package br.com.projetosar.entidades



import grails.test.mixin.*
import spock.lang.*

@TestFor(GrupoRevendedorController)
@Mock(GrupoRevendedor)
class GrupoRevendedorControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.grupoRevendedorInstanceList
            model.grupoRevendedorInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.grupoRevendedorInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def grupoRevendedor = new GrupoRevendedor()
            grupoRevendedor.validate()
            controller.save(grupoRevendedor)

        then:"The create view is rendered again with the correct model"
            model.grupoRevendedorInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            grupoRevendedor = new GrupoRevendedor(params)

            controller.save(grupoRevendedor)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/grupoRevendedor/show/1'
            controller.flash.message != null
            GrupoRevendedor.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def grupoRevendedor = new GrupoRevendedor(params)
            controller.show(grupoRevendedor)

        then:"A model is populated containing the domain instance"
            model.grupoRevendedorInstance == grupoRevendedor
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def grupoRevendedor = new GrupoRevendedor(params)
            controller.edit(grupoRevendedor)

        then:"A model is populated containing the domain instance"
            model.grupoRevendedorInstance == grupoRevendedor
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/grupoRevendedor/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def grupoRevendedor = new GrupoRevendedor()
            grupoRevendedor.validate()
            controller.update(grupoRevendedor)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.grupoRevendedorInstance == grupoRevendedor

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            grupoRevendedor = new GrupoRevendedor(params).save(flush: true)
            controller.update(grupoRevendedor)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/grupoRevendedor/show/$grupoRevendedor.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/grupoRevendedor/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def grupoRevendedor = new GrupoRevendedor(params).save(flush: true)

        then:"It exists"
            GrupoRevendedor.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(grupoRevendedor)

        then:"The instance is deleted"
            GrupoRevendedor.count() == 0
            response.redirectedUrl == '/grupoRevendedor/index'
            flash.message != null
    }
}
