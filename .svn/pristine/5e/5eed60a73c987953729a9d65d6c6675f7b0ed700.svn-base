package br.com.projetosar.entidades

class UsuarioController {
    static scaffold = true
    def springSecurityService
    
    def enviarMensagem(){}
    
    def enviarEmail(){
        def user= springSecurityService.currentUser
        def email = []
        switch(params.destinatario){
           case "1":
                def revendedor = Revendedor.get(params.revendedor.id)
                if(revendedor.email){
                    email.add(revendedor.email)
                }
                break
            case "2":
                def grupo = GrupoRevendedor.get(params.grupo.id)
                for(rev in grupo.revendedor){
                    if(rev.email){
                        email.add(rev.email)
                    }
                }
                break
            case "3":
                def cliente = Cliente.get(params.cliente.id)
                if(cliente.email){
                    email.add(cliente.email)
                }
        }
        sendMail {
            to email.toArray()
            subject """[SAR 2016] ${params.titulo}""" 
            html """Sistema de Apoio ao Revendedor<br/>
                    Remetente: [${user?.email}]<br/>
                    Mensagem: 
                            ${params.texto}"""
        }
        flash.message = "Mensagem Enviada"
        redirect(action: "enviarMensagem")
    }
    
    def faleConosco(){
        def nome = params.nome
        def email = params.email
        def mensagem = params.msgFaleConosco
        log.fatal(mensagem)
        sendMail {
            to "projetosar2016@gmail.com"
            subject """[SAR 2016] Fale Conosco""" 
            html """Sistema de Apoio ao Revendedor<br/>
                    Remetente: ${nome}[${email}]<br/>
                    Mensagem: 
                            ${mensagem}"""
        }
    }
}
