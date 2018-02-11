package br.com.projetosar.entidades



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

class ClienteController {
    static scaffold = true
    
    def save() {
        def clienteInstance = new Cliente(params)
        params.cliente = clienteInstance
        params.saldo = 0
        def financeiro = new Financeiro(params)
        clienteInstance.financeiro = financeiro
        if (!clienteInstance.save(flush: true)) {
          render(view: "create", model: [clienteInstance:clienteInstance])
          return
        }
        flash.message = message(code: 'default.created.message', 
            args: [message(code: 'cliente.label', default: 'Cliente'), clienteInstance.id])
        redirect(action: "show", id: clienteInstance.id)
    }
}
