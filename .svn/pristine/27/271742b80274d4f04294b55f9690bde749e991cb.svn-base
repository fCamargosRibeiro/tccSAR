
<%@ page import="br.com.projetosar.entidades.Cliente" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
  </head>
  <body>
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
    <div id="list-cliente" class="content scaffold-list" role="main">
      <h1><span><g:message code="default.list.label" args="[entityName]" /></span></h1>
      <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
      </g:if>
      <div class="table-responsive col-md-12">             
            <table class="table table-striped tabelas" cellspacing="0" cellpadding="0">
            <thead class="cabecalhoTabelas">
                <tr>
              
                <g:sortableColumn property="nome" title="${message(code: 'cliente.nome.label', default: 'Nome')}" />
                
                <g:sortableColumn property="cpf" title="${message(code: 'cliente.cpf.label', default: 'Cpf')}" />
                
                <g:sortableColumn property="email" title="${message(code: 'cliente.email.label', default: 'Email')}" />
                
            </tr>
          </thead>
          <tbody>
            <g:each in="${clienteInstanceList}" status="i" var="clienteInstance">
              <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                  
                  <td><g:link action="show" id="${clienteInstance.id}">${fieldValue(bean: clienteInstance, field: "nome")}</g:link></td>
                  
                <td>${fieldValue(bean: clienteInstance, field: "cpf")}</td>
                
                <td>${fieldValue(bean: clienteInstance, field: "email")}</td>
                
              </tr>
            </g:each>
          </tbody>
        </table>
      </div>
      </div>
      <div class="pagination">
        <g:paginate total="${clienteInstanceCount ?: 0}" />
      </div>
    </div>
    <asset:stylesheet src="tabelas.css"/>
    <asset:stylesheet src="titulos.css"/>
    <asset:stylesheet src="inputs.css"/>
  </body>
</html>
