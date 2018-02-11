package br.com.projetosar.entidades

import org.springframework.dao.DataIntegrityViolationException

class RequestmapController {

    def springSecurityService
    def scaffold=true
    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Requestmap.list(params), model:[requestmapInstanceCount: Requestmap.count()]
    }
    
    def create() {
        [requestmapInstance: new Requestmap(params)]
    }

    def save() {
        def requestmapInstance = new Requestmap(params)
        if (!requestmapInstance.save(flush: true)) {
            render(view: "create", model: [requestmapInstance: requestmapInstance])
            return
        }
        springSecurityService.clearCachedRequestmaps()
        flash.message = message(code: 'default.created.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), requestmapInstance.id])
        redirect(action: "show", id: requestmapInstance.id)
    }

    def show(Long id) {
        def requestmapInstance = Requestmap.get(id)
        if (!requestmapInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), id])
            redirect(action: "index")
            return
        }

        [requestmapInstance: requestmapInstance]
    }

    def edit(Long id) {
        def requestmapInstance = Requestmap.get(id)
        if (!requestmapInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), id])
            redirect(action: "index")
            return
            }

        [requestmapInstance: requestmapInstance]
    }

    def update(Long id, Long version) {
        def requestmapInstance = Requestmap.get(id)
        if (!requestmapInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), id])
            redirect(action: "index")
            return
        }

        if (version != null) {
            if (requestmapInstance.version > version) {
                requestmapInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'requestmap.label', default: 'Requestmap')] as Object[],
                          "Another user has updated this Requestmap while you were editing")
                render(view: "edit", model: [requestmapInstance: requestmapInstance])
            return
        }
        }

        requestmapInstance.properties = params

        if (!requestmapInstance.save(flush: true)) {
            render(view: "edit", model: [requestmapInstance: requestmapInstance])
            return
            }
        springSecurityService.clearCachedRequestmaps()
        flash.message = message(code: 'default.updated.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), requestmapInstance.id])
        redirect(action: "show", id: requestmapInstance.id)
        }

    def delete(Long id) {
        def requestmapInstance = Requestmap.get(id)
        if (!requestmapInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), id])
            redirect(action: "index")
            return
    }

        try {
            requestmapInstance.delete(flush: true)
            springSecurityService.clearCachedRequestmaps()
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), id])
            redirect(action: "index")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'requestmap.label', default: 'Requestmap'), id])
            redirect(action: "show", id: id)
        }
    }
  
}
