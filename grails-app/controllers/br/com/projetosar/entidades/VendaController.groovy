package br.com.projetosar.entidades

import org.springframework.dao.DataIntegrityViolationException
import grails.plugins.rest.client.RestBuilder 
import java.text.DecimalFormat
import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = false)
class VendaController {

  def filterPaneService
  def pagamentoService
  def springSecurityService
  
  static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

  def index(Integer max) {
    params.max = max?max:10
    respond Venda.list(params), model:[vendaInstanceCount: Venda.count()]
  }

  def create() {
    def vendaInstance = new Venda(params)
    def produtos = []
    produtos.add(new ProdutoVenda())
    vendaInstance.produtoVenda = produtos
    [vendaInstance: vendaInstance]
  }

  def save() {
    params.data = new Date()
    def vendaInstance = new Venda(params)
    if (!vendaInstance.save(flush: true)) {
      render(view: "create", model: [vendaInstance: vendaInstance])
      return
    }
    pagamentoService.adicionarPagamento(vendaInstance.cliente, -vendaInstance.totalVenda, vendaInstance.data, "Venda")
    if(vendaInstance.tipoPagamento == "PagSeguro"){
        pagseguro(vendaInstance)
    }else if(vendaInstance.tipoPagamento == "À Vista"){
            pagamentoService.adicionarPagamento(vendaInstance.cliente, vendaInstance.totalVenda, vendaInstance.data, "À Vista")
    }else{
        if(vendaInstance.entrada > 0){
            pagamentoService.adicionarPagamento(vendaInstance.cliente, vendaInstance.entrada, vendaInstance.data, "Entrada")
        }
    }
    flash.message = message(code: 'default.created.message', 
        args: [message(code: 'venda.label', default: 'Venda'), vendaInstance.id])
    redirect(action: "show", id: vendaInstance.id)
  }
  
  def pagseguro(Venda venda){
    def user= springSecurityService.currentUser
    def rest = new RestBuilder(connectTimeout:1000, readTimeout:20000)
    def paramPagSeguro = "email=flp.camargos@gmail.com&token=103BD05439344CD7BF9C7007F63636E5"
    def configuracoes = "&currency=BRL&reference=${venda.id}"
    def pattern = "#0.00"
    def moneyform = new DecimalFormat(pattern)
    def valor = moneyform.format(venda.totalVenda).toString().replace(',','.')
    def produto = "&itemId1=1&itemDescription1=ProdutoSAR&itemAmount1=${valor}&itemQuantity1=1&itemWeight1=0";
    def resp = rest.post("https://ws.sandbox.pagseguro.uol.com.br/v2/checkout?"+paramPagSeguro+configuracoes+produto) {
            header 'Content-Type', 'application/x-www-form-urlencoded; charset=ISO-8859-1'
        }
    try {
        def resultResp = new XmlParser().parseText(resp.text)
        def code = resultResp.code.text()

        if(code){
            sendMail {
                to "${venda.cliente.email}"
                subject """[SAR 2016] Link Pagamento PagSeguro""" 
                html """Sistema de Apoio ao Revendedor<br/>
                        Remetente: [projetosar2016@gmail.com]<br/>
                        Mensagem: 
                                Clink no link abaixo para efetuar o pagamento:
                                https://sandbox.pagseguro.uol.com.br/v2/checkout/payment.html?code=${code}
                                """
            }
        }else{
            def emails = []
            emails.add(user?.email)
            emails.add(venda.cliente?.email)
            sendMail {
            to emails.toArray()
                subject """[SAR 2016] Error PagSeguro""" 
                html """Sistema de Apoio ao Revendedor<br/>
                        Remetente: [projetosar2016@gmail.com]<br/>
                        Mensagem: 
                                A venda [${venda.id}] não foi processado o pagamento pelo PagSeguro.
                                """
            }
        }     
    }catch (Exception e) {
        def emails = []
        emails.add(user?.email)
        emails.add(venda.cliente?.email)
        sendMail {
            to emails.toArray()
            subject """[SAR 2016] Error PagSeguro""" 
            html """Sistema de Apoio ao Revendedor<br/>
                    Remetente: [projetosar2016@gmail.com]<br/>
                    Mensagem: 
                            A venda [${venda.id}] não foi processado o pagamento pelo PagSeguro.
                            """
        }
    }
    
  }

  def show(Long id) {
    def vendaInstance = Venda.get(id)
    if (!vendaInstance) {
      flash.message = message(code: 'default.not.found.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "index")
      return
    }

    [vendaInstance: vendaInstance]
  }

  def edit(Long id) {
    def vendaInstance = Venda.get(id)
    if (!vendaInstance) {
      flash.message = message(code: 'default.not.found.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "index")
      return
    }

    [vendaInstance: vendaInstance]
  }

  def update(Long id, Long version) {
    def vendaInstance = Venda.get(id)
    if (!vendaInstance) {
      flash.message = message(code: 'default.not.found.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "index")
      return
    }

    if (version != null) {
      if (vendaInstance.version > version) {
        vendaInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
          [message(code: 'venda.label', default: 'Venda')] as Object[],
                          "Another user has updated this Venda while you were editing")
        render(view: "edit", model: [vendaInstance: vendaInstance])
        return
      }
    }

    grailsApplication.getDomainClass("br.com.projetosar.entidades.Venda").persistentProperties.each {
      if (it.type == ([] as byte[]).class && params[it]?.isEmpty()) {
        params.remove(it)
      }
      if ((it.oneToMany && !it.bidirectional)  || (it.manyToMany && it.isOwningSide())) {
        vendaInstance[it.name].clear()
      }
    }
    
    vendaInstance.properties = params

    if (!vendaInstance.save(flush: true)) {
      render(view: "edit", model: [vendaInstance: vendaInstance])
      return
    }

    flash.message = message(code: 'default.updated.message', 
        args: [message(code: 'venda.label', default: 'Venda'), vendaInstance.id])
    redirect(action: "show", id: vendaInstance.id)
  }

  def delete(Long id) {
    def vendaInstance = Venda.get(id)
    if (!vendaInstance) {
      flash.message = message(code: 'default.not.found.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "index")
      return
    }

    try {
//      def creditos = pagamentoService.findCreditos(vendaInstance.cliente,vendaInstance.data,null)
//      def pagamentos = []
//      for(cr in creditos){
//          if(cr.data != vendaInstance.data || cr.valor != vendaInstance.entrada){
//              pagamentos.add(cr)
//          }
//      }
//      if(pagamentos.size==0){
        pagamentoService.adicionarPagamento(vendaInstance.cliente, vendaInstance.totalVenda, vendaInstance.data, "Cancelamento de Venda")    
        vendaInstance.delete(flush: true)
//      }
      flash.message = message(code: 'default.deleted.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "index")
    }
    catch (DataIntegrityViolationException e) {
      flash.message = message(code: 'default.not.deleted.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "show", id: id)
    }
  }
  
  def filter = {
    if(!params.max) params.max = 10
    render( view:'list',
      model:[ vendaInstanceList: filterPaneService.filter( params, Venda ),
        vendaInstanceTotal: filterPaneService.count( params, Venda ),
        filterParams: org.grails.plugin.filterpane.FilterPaneUtils.extractFilterParams(params),
        params:params ] )
  }
    
  def renderizaLista(){
    render(template:"listagem",model:[vendaInstanceList:Venda.list(params)])
  }
    
  def renderBlob(Long id) {
    def vendaInstance = Venda.get(id)
    if (!vendaInstance) {
      flash.message = message(code: 'default.not.found.message', 
          args: [message(code: 'venda.label', default: 'Venda'), id])
      redirect(action: "index")
      return
    }
    
    def blob = vendaInstance[params.blob]
    if (blob) {
      response.setContentLength(blob.length)
      response.outputStream.write(blob)
    }
    else {
      response.sendError(404)
    }
  }
  
  def salvar(){
    def vendaInstance = new Venda(params)
    if (!vendaInstance.save(flush: true)) {
      render vendaInstance.id
    }
  }

}
