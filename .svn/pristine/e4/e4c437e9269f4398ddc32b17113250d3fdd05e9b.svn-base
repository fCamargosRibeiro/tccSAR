package br.com.projetosar.entidades



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = false)
class PagamentoController {
    static scaffold = true
    def pagamentoService
    def grailsLinkGenerator
    
    def save() {
        def cliente = Cliente.get(params.cliente.id)
        def valor = params.valor.toDouble()
        def data = new Date();
        pagamentoService.adicionarPagamento(cliente, valor, data, "Pagamento")
        flash.message = message(code: 'default.created.message', 
            args: [message(code: 'pagamento.label', default: 'Pagamento'), params.id])
        redirect(action: "show", id: params.id)
    }
  
  //EXEMPLO DE ENVIO DE EMAIL
    def teste(){
        def email = []
        email.add("flp.camargos@gmail.com")
        email.add("anacaroolinamartins@gmail.com")
        email.add("contato.vsr@gmail.com")
        sendMail {
            to email.toArray()
            subject "Teste de envio email aplicacao SAR"     
            html """ mimimimimimimimimimimimi ${grailsLinkGenerator.link(uri:'/', absolute:true)}
                 """ 
        }
    } 
}