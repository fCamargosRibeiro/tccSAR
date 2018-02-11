
<%@ page import="br.com.projetosar.entidades.Endereco" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'endereco.label', default: 'Endereco')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
  </head>
  <body>
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
    <div id="list-endereco" class="content scaffold-list" role="main">
      <h1><span><g:message code="default.list.label" args="[entityName]" /></span></h1>
      <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
      </g:if>
      <div class="table-responsive col-md-12">             
            <table class="table table-striped tabelas" cellspacing="0" cellpadding="0">
            <thead class="cabecalhoTabelas">
                <tr>
              
                <g:sortableColumn property="tipo" title="${message(code: 'endereco.tipo.label', default: 'Tipo')}" />
                
                <g:sortableColumn property="logradouro" title="${message(code: 'endereco.logradouro.label', default: 'Logradouro')}" />
                
                <g:sortableColumn property="lote" title="${message(code: 'endereco.lote.label', default: 'Lote')}" />
                
                <g:sortableColumn property="bairro" title="${message(code: 'endereco.bairro.label', default: 'Bairro')}" />
                
                <g:sortableColumn property="cidade" title="${message(code: 'endereco.cidade.label', default: 'Cidade')}" />
                
                <g:sortableColumn property="estado" title="${message(code: 'endereco.estado.label', default: 'Estado')}" />
                
            </tr>
          </thead>
          <tbody>
            <g:each in="${enderecoInstanceList}" status="i" var="enderecoInstance">
              <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                  
                  <td><g:link action="show" id="${enderecoInstance.id}">${fieldValue(bean: enderecoInstance, field: "tipo")}</g:link></td>
                  
                <td>${fieldValue(bean: enderecoInstance, field: "logradouro")}</td>
                
                <td>${fieldValue(bean: enderecoInstance, field: "lote")}</td>
                
                <td>${fieldValue(bean: enderecoInstance, field: "bairro")}</td>
                
                <td>${fieldValue(bean: enderecoInstance, field: "cidade")}</td>
                
                <td>${fieldValue(bean: enderecoInstance, field: "estado")}</td>
                
              </tr>
            </g:each>
          </tbody>
        </table>
      </div>
      </div>
      <div class="pagination">
        <g:paginate total="${enderecoInstanceCount ?: 0}" />
      </div>
    </div>
    <asset:stylesheet src="tabelas.css"/>
    <asset:stylesheet src="titulos.css"/>
    <asset:stylesheet src="inputs.css"/>
  </body>
</html>
