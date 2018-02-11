
<%@ page import="br.com.projetosar.entidades.Pagamento" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'pagamento.label', default: 'Pagamento')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
  </head>
  <body>
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
    <div id="list-pagamento" class="content scaffold-list" role="main">
      <h1><span><g:message code="default.list.label" args="[entityName]" /></span></h1>
      <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
      </g:if>
      <div class="table-responsive col-md-12">             
            <table class="table table-striped tabelas" cellspacing="0" cellpadding="0">
            <thead class="cabecalhoTabelas">
                <tr>
              
                <g:sortableColumn property="data" title="${message(code: 'pagamento.data.label', default: 'Data')}" />
                
                <g:sortableColumn property="valor" title="${message(code: 'pagamento.valor.label', default: 'Valor')}" />
                
                <g:sortableColumn property="observacao" title="${message(code: 'pagamento.observacao.label', default: 'Observacao')}" />
                
              <th><g:message code="pagamento.cliente.label" default="Cliente" /></th>
                
            </tr>
          </thead>
          <tbody>
            <g:each in="${pagamentoInstanceList}" status="i" var="pagamentoInstance">
              <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                  
                  <td><g:link action="show" id="${pagamentoInstance.id}">${fieldValue(bean: pagamentoInstance, field: "data")}</g:link></td>
                  
                <td>${fieldValue(bean: pagamentoInstance, field: "valor")}</td>
                
                <td>${fieldValue(bean: pagamentoInstance, field: "observacao")}</td>
                
                <td>${fieldValue(bean: pagamentoInstance, field: "cliente")}</td>
                
              </tr>
            </g:each>
          </tbody>
        </table>
      </div>
      </div>
      <div class="pagination">
        <g:paginate total="${pagamentoInstanceCount ?: 0}" />
      </div>
    </div>
    <asset:stylesheet src="tabelas.css"/>
    <asset:stylesheet src="titulos.css"/>
    <asset:stylesheet src="inputs.css"/>
  </body>
</html>
