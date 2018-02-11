
<%@ page import="br.com.projetosar.entidades.EnderecoRevendedor" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="${message(code: 'enderecoRevendedor.label', default: 'EnderecoRevendedor')}" />
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

  
  
      <g:if test="${enderecoRevendedorInstance?.tipo}">
        <p><strong><g:message code="enderecoRevendedor.tipo.label" default="Tipo" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="tipo"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.logradouro}">
        <p><strong><g:message code="enderecoRevendedor.logradouro.label" default="Logradouro" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="logradouro"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.lote}">
        <p><strong><g:message code="enderecoRevendedor.lote.label" default="Lote" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="lote"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.bairro}">
        <p><strong><g:message code="enderecoRevendedor.bairro.label" default="Bairro" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="bairro"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.cidade}">
        <p><strong><g:message code="enderecoRevendedor.cidade.label" default="Cidade" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="cidade"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.estado}">
        <p><strong><g:message code="enderecoRevendedor.estado.label" default="Estado" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="estado"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.cep}">
        <p><strong><g:message code="enderecoRevendedor.cep.label" default="Cep" /></strong></p>

        <p><g:fieldValue bean="${enderecoRevendedorInstance}" field="cep"/></p>


      </g:if>

    

  
  
      <g:if test="${enderecoRevendedorInstance?.revendedor}">
        <p><strong><g:message code="enderecoRevendedor.revendedor.label" default="Revendedor" /></strong></p>

        <p>
          <g:link controller="revendedor" action="show" id="${enderecoRevendedorInstance?.revendedor?.id}">
              ${enderecoRevendedorInstance?.revendedor?.encodeAsHTML()}</g:link>
        </p>


      </g:if>

    

  
    <g:form>
      <g:hiddenField name="id" value="${enderecoRevendedorInstance?.id}" />
      <g:link class="btn btn-default" action="edit" id="${enderecoRevendedorInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
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
