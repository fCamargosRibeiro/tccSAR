
<%@ page import="br.com.projetosar.entidades.Venda" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="${message(code: 'venda.label', default: 'Venda')}" />
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
    
    <div class="container">
        <div class="row pad-bg well">
            <div class=" col-md-6 col-sm-8 col-sm-offset-2">

  
  
      <g:if test="${vendaInstance?.data}">
        <p><strong><g:message code="venda.data.label" default="Data" /></strong></p>

        <p><g:formatDate date="${vendaInstance?.data}" /></span>


      </g:if>

    

  
  
      <g:if test="${vendaInstance?.tipoPagamento}">
        <p><strong><g:message code="venda.tipoPagamento.label" default="Tipo Pagamento" /></strong></p>

        <p><g:fieldValue bean="${vendaInstance}" field="tipoPagamento"/></p>


      </g:if>

    

  
  
      <g:if test="${vendaInstance?.entrada}">
        <p><strong><g:message code="venda.entrada.label" default="Entrada" /></strong></p>

        <p><g:fieldValue bean="${vendaInstance}" field="entrada"/></p>


      </g:if>

    

  
  
      <g:if test="${vendaInstance?.desconto}">
        <p><strong><g:message code="venda.desconto.label" default="Desconto" /></strong></p>

        <p><g:fieldValue bean="${vendaInstance}" field="desconto"/></p>


      </g:if>

    

  
  
      <g:if test="${vendaInstance?.cliente}">
        <p><strong><g:message code="venda.cliente.label" default="Cliente" /></strong></p>

        <p>
          <g:link controller="cliente" action="show" id="${vendaInstance?.cliente?.id}">
              ${vendaInstance?.cliente?.encodeAsHTML()}</g:link>
        </p>


      </g:if>

    

  
  
      <g:if test="${vendaInstance?.produtoVenda}">
        <p><strong><g:message code="venda.produtoVenda.label" default="Produto Venda" /></strong></p>

        <g:each in="${vendaInstance.produtoVenda}" var="p">
          <p><g:link controller="produtoVenda" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></p>
        </g:each>
        <p>
          <g:link controller="produtoVenda" action="create" 
              params="['venda.id': vendaInstance.id]">
                  ${message(code: 'default.add.label',                       args: [message(code: 'produtoVenda.label', 
                      default: 'ProdutoVenda')])}
          </g:link>
        </p>


      </g:if>

      <g:else>
        <br>
        <p><strong><g:message code="produtoVenda.label" default="Produto Venda" /></strong></p>
        <p>
          <g:link controller="produtoVenda" action="create" params="['venda.id': vendaInstance.id]">
              ${message(code: 'default.add.label', args: [message(code: 'produtoVenda.label', 
                  default: 'ProdutoVenda')])}
          </g:link>
        </p>
      </g:else>


    

  
    <g:form>
      <g:hiddenField name="id" value="${vendaInstance?.id}" />
      <g:actionSubmit class="btn btn-danger" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" 
          onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
    </g:form>
   </div>
  </div>
</div>
</div>
<asset:stylesheet src="formularios.css"/>
<asset:stylesheet src="titulos.css"/>
</body>
</html>
