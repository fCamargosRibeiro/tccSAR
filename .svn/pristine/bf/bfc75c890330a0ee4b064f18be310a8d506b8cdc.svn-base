
<%@ page import="br.com.projetosar.entidades.Revendedor" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="${message(code: 'revendedor.label', default: 'Revendedor')}" />
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

  
  
      <g:if test="${revendedorInstance?.nome}">
        <p><strong><g:message code="revendedor.nome.label" default="Nome" /></strong></p>

        <p><g:fieldValue bean="${revendedorInstance}" field="nome"/></p>


      </g:if>

    

  
  
      <g:if test="${revendedorInstance?.cpf}">
        <p><strong><g:message code="revendedor.cpf.label" default="Cpf" /></strong></p>

        <p><g:fieldValue bean="${revendedorInstance}" field="cpf"/></p>


      </g:if>

    

  
  
      <g:if test="${revendedorInstance?.identidade}">
        <p><strong><g:message code="revendedor.identidade.label" default="Identidade" /></strong></p>

        <p><g:fieldValue bean="${revendedorInstance}" field="identidade"/></p>


      </g:if>

    

  
  
      <g:if test="${revendedorInstance?.orgExpeditor}">
        <p><strong><g:message code="revendedor.orgExpeditor.label" default="Org Expeditor" /></strong></p>

        <p><g:fieldValue bean="${revendedorInstance}" field="orgExpeditor"/></p>


      </g:if>

    

  
  
      <g:if test="${revendedorInstance?.email}">
        <p><strong><g:message code="revendedor.email.label" default="Email" /></strong></p>

        <p><g:fieldValue bean="${revendedorInstance}" field="email"/></p>


      </g:if>

    

  
  
      <g:if test="${revendedorInstance?.ativo}">
        <p><strong><g:message code="revendedor.ativo.label" default="Ativo" /></strong></p>

        <p><g:formatBoolean boolean="${revendedorInstance?.ativo}" /></p>


      </g:if>

    

  
  
      <g:if test="${revendedorInstance?.endereco}">
        <p><strong><g:message code="revendedor.endereco.label" default="Endereco" /></strong></p>

        <g:each in="${revendedorInstance.endereco}" var="e">
          <p><g:link controller="enderecoRevendedor" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></p>
        </g:each>
        <p>
          <g:link controller="enderecoRevendedor" action="create" 
              params="['revendedor.id': revendedorInstance.id]">
                  ${message(code: 'default.add.label',                       args: [message(code: 'enderecoRevendedor.label', 
                      default: 'EnderecoRevendedor')])}
          </g:link>
        </p>


      </g:if>

      <g:else>
        <br>
        <p><strong><g:message code="enderecoRevendedor.label" default="Endereco" /></strong></p>
        <p>
          <g:link controller="enderecoRevendedor" action="create" params="['revendedor.id': revendedorInstance.id]">
              ${message(code: 'default.add.label', args: [message(code: 'enderecoRevendedor.label', 
                  default: 'EnderecoRevendedor')])}
          </g:link>
        </p>
      </g:else>


    

  
  
      <g:if test="${revendedorInstance?.telefone}">
        <p><strong><g:message code="revendedor.telefone.label" default="Telefone" /></strong></p>

        <g:each in="${revendedorInstance.telefone}" var="t">
          <p><g:link controller="telefoneRevendedor" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></p>
        </g:each>
        <p>
          <g:link controller="telefoneRevendedor" action="create" 
              params="['revendedor.id': revendedorInstance.id]">
                  ${message(code: 'default.add.label',                       args: [message(code: 'telefoneRevendedor.label', 
                      default: 'TelefoneRevendedor')])}
          </g:link>
        </p>


      </g:if>

      <g:else>
        <br>
        <p><strong><g:message code="telefoneRevendedor.label" default="Telefone" /></strong></p>
        <p>
          <g:link controller="telefoneRevendedor" action="create" params="['revendedor.id': revendedorInstance.id]">
              ${message(code: 'default.add.label', args: [message(code: 'telefoneRevendedor.label', 
                  default: 'TelefoneRevendedor')])}
          </g:link>
        </p>
      </g:else>


    

  
    <g:form>
      <g:hiddenField name="id" value="${revendedorInstance?.id}" />
      <g:link class="btn btn-default" action="edit" id="${revendedorInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
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
