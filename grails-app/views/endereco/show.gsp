
<%@ page import="br.com.projetosar.entidades.Endereco" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="${message(code: 'endereco.label', default: 'Endereco')}" />
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

  
  
      <g:if test="${enderecoInstance?.tipo}">
        <p><strong><g:message code="endereco.tipo.label" default="Tipo" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="tipo"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.logradouro}">
        <p><strong><g:message code="endereco.logradouro.label" default="Logradouro" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="logradouro"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.lote}">
        <p><strong><g:message code="endereco.lote.label" default="Lote" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="lote"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.bairro}">
        <p><strong><g:message code="endereco.bairro.label" default="Bairro" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="bairro"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.cidade}">
        <p><strong><g:message code="endereco.cidade.label" default="Cidade" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="cidade"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.estado}">
        <p><strong><g:message code="endereco.estado.label" default="Estado" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="estado"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.cep}">
        <p><strong><g:message code="endereco.cep.label" default="Cep" /></strong></p>

        <p><g:fieldValue bean="${enderecoInstance}" field="cep"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoInstance?.cliente}">
        <p><strong><g:message code="endereco.cliente.label" default="Cliente" /></strong></p>

        <p>
          <g:link controller="cliente" action="show" id="${enderecoInstance?.cliente?.id}">
              ${enderecoInstance?.cliente?.encodeAsHTML()}</g:link>
        </p>


      </g:if>

    

  
    <g:form>
      <g:hiddenField name="id" value="${enderecoInstance?.id}" />
      <g:link class="btn btn-default" action="edit" id="${enderecoInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
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
