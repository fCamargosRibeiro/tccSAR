
<%@ page import="br.com.projetosar.entidades.Pagamento" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="${message(code: 'pagamento.label', default: 'Pagamento')}" />
  <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
  <div class="row">
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.create.label" args="[entityName]" /></g:link>
    <g:link class="btn btn-default pull-right h2" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link>
    
    <h1><span><g:message code="default.create.label" args="[entityName]" /></span></h1>
    <g:if test="${flash.message}">
      <div class="message" role="status" class="alert alert-info">${flash.message}</div>
    </g:if>
    
        <div class="row pad-bg ">
            <div class=" col-md-6 col-sm-8 col-sm-offset-2 ">

  
  
      <g:if test="${pagamentoInstance?.data}">
        <p><strong><g:message code="pagamento.data.label" default="Data" /></strong></p>

        <p><g:formatDate date="${pagamentoInstance?.data}" /></span>


      </g:if>

    

  
  
      <g:if test="${pagamentoInstance?.valor}">
        <p><strong><g:message code="pagamento.valor.label" default="Valor" /></strong></p>

        <p><g:fieldValue bean="${pagamentoInstance}" field="valor"/></p>


      </g:if>

    

  
  
      <g:if test="${pagamentoInstance?.observacao}">
        <p><strong><g:message code="pagamento.observacao.label" default="Observacao" /></strong></p>

        <p><g:fieldValue bean="${pagamentoInstance}" field="observacao"/></p>


      </g:if>

    

  
  
      <g:if test="${pagamentoInstance?.cliente}">
        <p><strong><g:message code="pagamento.cliente.label" default="Cliente" /></strong></p>

        <p>
          <g:link controller="cliente" action="show" id="${pagamentoInstance?.cliente?.id}">
              ${pagamentoInstance?.cliente?.encodeAsHTML()}</g:link>
        </p>


      </g:if>

    

  
    
   </div>
  </div>
</div>
</div>
<asset:stylesheet src="formularios.css"/>
<asset:stylesheet src="titulos.css"/>
</body>
</html>
