
<%@ page import="br.com.projetosar.entidades.Revendedor" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'revendedor.label', default: 'Revendedor')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
  </head>
  <body>
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
    <div id="list-revendedor" class="content scaffold-list" role="main">
      <h1><span><g:message code="default.list.label" args="[entityName]" /></span></h1>
      <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
      </g:if>
      <div class="table-responsive col-md-12">             
            <table class="table table-striped tabelas" cellspacing="0" cellpadding="0">
            <thead class="cabecalhoTabelas">
                <tr>
              
                <g:sortableColumn property="nome" title="${message(code: 'revendedor.nome.label', default: 'Nome')}" />
                
                <g:sortableColumn property="cpf" title="${message(code: 'revendedor.cpf.label', default: 'Cpf')}" />
                
                <g:sortableColumn property="identidade" title="${message(code: 'revendedor.identidade.label', default: 'Identidade')}" />
                
                <g:sortableColumn property="orgExpeditor" title="${message(code: 'revendedor.orgExpeditor.label', default: 'Org Expeditor')}" />
                
                <g:sortableColumn property="email" title="${message(code: 'revendedor.email.label', default: 'Email')}" />
                
                <g:sortableColumn property="ativo" title="${message(code: 'revendedor.ativo.label', default: 'Ativo')}" />
                
            </tr>
          </thead>
          <tbody>
            <g:each in="${revendedorInstanceList}" status="i" var="revendedorInstance">
              <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                  
                  <td><g:link action="show" id="${revendedorInstance.id}">${fieldValue(bean: revendedorInstance, field: "nome")}</g:link></td>
                  
                <td>${fieldValue(bean: revendedorInstance, field: "cpf")}</td>
                
                <td>${fieldValue(bean: revendedorInstance, field: "identidade")}</td>
                
                <td>${fieldValue(bean: revendedorInstance, field: "orgExpeditor")}</td>
                
                <td>${fieldValue(bean: revendedorInstance, field: "email")}</td>
                
                  <td><g:formatBoolean boolean="${revendedorInstance.ativo}" /></td>
                
              </tr>
            </g:each>
          </tbody>
        </table>
      </div>
      </div>
      <div class="pagination">
        <g:paginate total="${revendedorInstanceCount ?: 0}" />
      </div>
    </div>
    <asset:stylesheet src="tabelas.css"/>
    <asset:stylesheet src="titulos.css"/>
    <asset:stylesheet src="inputs.css"/>
  </body>
</html>
