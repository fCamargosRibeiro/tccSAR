
<%@ page import="br.com.projetosar.entidades.Venda" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'venda.label', default: 'Venda')}" />
    <title><g:message code="default.list.label" args="[entityName]" /></title>
  </head>
  <body>
    <a class="btn btn-default pull-right h2"  href="/SAR/pagamento/create" >Realizar Pagamento</a>
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link>
    <div id="list-venda" class="content scaffold-list" role="main">
      <h1><span><g:message code="default.list.label" args="[entityName]" /></span></h1>
      <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
      </g:if>
      <div class="table-responsive col-md-12">             
            <table class="table table-striped tabelas" cellspacing="0" cellpadding="0">
            <thead class="cabecalhoTabelas">
                <tr>
              
                <g:sortableColumn property="data" title="${message(code: 'venda.data.label', default: 'Data')}" />
                
                <g:sortableColumn property="tipoPagamento" title="${message(code: 'venda.tipoPagamento.label', default: 'Tipo Pagamento')}" />
                
                <g:sortableColumn property="entrada" title="${message(code: 'venda.entrada.label', default: 'Entrada')}" />
                
                <g:sortableColumn property="desconto" title="${message(code: 'venda.desconto.label', default: 'Desconto')}" />
                
              <th><g:message code="venda.cliente.label" default="Cliente" /></th>
                
            </tr>
          </thead>
          <tbody>
            <g:each in="${vendaInstanceList}" status="i" var="vendaInstance">
              <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
                  
                  <td><g:link action="show" id="${vendaInstance.id}">${fieldValue(bean: vendaInstance, field: "data")}</g:link></td>
                  
                <td>${fieldValue(bean: vendaInstance, field: "tipoPagamento")}</td>
                
                <td>${fieldValue(bean: vendaInstance, field: "entrada")}</td>
                
                <td>${fieldValue(bean: vendaInstance, field: "desconto")}</td>
                
                <td>${fieldValue(bean: vendaInstance, field: "cliente")}</td>
                
              </tr>
            </g:each>
          </tbody>
        </table>
      </div>
      </div>
      <div class="pagination">
        <g:paginate total="${vendaInstanceCount ?: 0}" />
      </div>
    </div>
    <asset:stylesheet src="tabelas.css"/>
    <asset:stylesheet src="titulos.css"/>
  </body>
</html>
