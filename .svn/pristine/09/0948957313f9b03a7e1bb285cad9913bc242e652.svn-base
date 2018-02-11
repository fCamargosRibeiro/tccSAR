
<%@ page import="br.com.projetosar.entidades.EnderecoRevendedor" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'enderecoRevendedor.label', default: 'EnderecoRevendedor')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
  </head>
  <body>
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
    <div id="list-enderecoRevendedor" class="content scaffold-list" role="main">
      <h1><span><g:message code="default.list.label" args="[entityName]" /></span></h1>
      <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
      </g:if>
      <div class="table-responsive col-md-12">             
            <table class="table table-striped tabelas" cellspacing="0" cellpadding="0">
            <thead class="cabecalhoTabelas">
                <tr>
              
                <g:sortableColumn property="tipo" title="${message(code: 'enderecoRevendedor.tipo.label', default: 'Tipo')}" />
                
                <g:sortableColumn property="logradouro" title="${message(code: 'enderecoRevendedor.logradouro.label', default: 'Logradouro')}" />
                
                <g:sortableColumn property="lote" title="${message(code: 'enderecoRevendedor.lote.label', default: 'Lote')}" />
                
                <g:sortableColumn property="bairro" title="${message(code: 'enderecoRevendedor.bairro.label', default: 'Bairro')}" />
                
                <g:sortableColumn property="cidade" title="${message(code: 'enderecoRevendedor.cidade.label', default: 'Cidade')}" />
                
                <g:sortableColumn property="estado" title="${message(code: 'enderecoRevendedor.estado.label', default: 'Estado')}" />
                
            </tr>
          </thead>
          <tbody>
            <g:each in="${enderecoRevendedorInstanceList}" status="i" var="enderecoRevendedorInstance">
              <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                  
                  <td><g:link action="show" id="${enderecoRevendedorInstance.id}">${fieldValue(bean: enderecoRevendedorInstance, field: "tipo")}</g:link></td>
                  
                <td>${fieldValue(bean: enderecoRevendedorInstance, field: "logradouro")}</td>
                
                <td>${fieldValue(bean: enderecoRevendedorInstance, field: "lote")}</td>
                
                <td>${fieldValue(bean: enderecoRevendedorInstance, field: "bairro")}</td>
                
                <td>${fieldValue(bean: enderecoRevendedorInstance, field: "cidade")}</td>
                
                <td>${fieldValue(bean: enderecoRevendedorInstance, field: "estado")}</td>
                
              </tr>
            </g:each>
          </tbody>
        </table>
      </div>
      </div>
      <div class="pagination">
        <g:paginate total="${enderecoRevendedorInstanceCount ?: 0}" />
      </div>
    </div>
    <asset:stylesheet src="tabelas.css"/>
    <asset:stylesheet src="titulos.css"/>
    <asset:stylesheet src="inputs.css"/>
  </body>
</html>
