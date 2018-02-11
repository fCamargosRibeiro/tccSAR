package br.com.projetosar.entidades

class RelatorioController {
  def scaffold = true
  
    def RelatorioService
    
    def list() {
        def cons = Relatorio.findAllByPermissoesIsNotNull()
        def relatorioList = []
        cons.each(){
            log.fatal it.permissoes
            //if(grails.plugin.springsecurity.SpringSecurityUtils.ifAnyGranted(it.permissoes))
            relatorioList.add(it)
        }
        [relatorioInstanceList: relatorioList]
    }
    
    def verParams(){
        def cons = Relatorio.get(params.id)
        def appName = grailsApplication.metadata['app.name']
//        if(!cons || !grails.plugin.springsecurity.SpringSecurityUtils.ifAnyGranted(cons.permissoes)){
//            flash.message = "Você não tem permissão para executar esse relatrio."
//            redirect(action: "list")
//        }
        String form = RelatorioService.verParams(cons,appName);
        render(template: "parametros", text: form)
    }

    def executa(){
        def cons = Relatorio.get(params.id)
        def parametros = params
        def appName = grailsApplication.metadata['app.name']
//        if(!cons || !grails.plugin.springsecurity.SpringSecurityUtils.ifAnyGranted(cons.permissoes)){
//            flash.message = "Você não tem permissão para executar esse relatrio."
//            redirect(action: "list")
//        }
        render RelatorioService.executa(cons,appName,parametros)
    }
    
    def update(Long id, Long version) {
        def relatorioInstance = Relatorio.get(id)
        if (!relatorioInstance) {
          flash.message = message(code: 'default.not.found.message', 
              args: [message(code: 'relatorio.label', default: 'Relatorio'), id])
          redirect(action: "index")
          return
        }

        if (version != null) {
          if (relatorioInstance.version > version) {
            relatorioInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
              [message(code: 'relatorio.label', default: 'Relatorio')] as Object[],
                              "Another user has updated this Relatorio while you were editing")
            render(view: "edit", model: [relatorioInstance: relatorioInstance])
            return
          }
        }
    
        relatorioInstance.properties = params

        if (!relatorioInstance.save(flush: true)) {
          render(view: "edit", model: [relatorioInstance: relatorioInstance])
          return
        }

        flash.message = message(code: 'default.updated.message', 
            args: [message(code: 'relatorio.label', default: 'Relatorio'), relatorioInstance.id])
        redirect(action: "show", id: relatorioInstance.id)
    }
}
