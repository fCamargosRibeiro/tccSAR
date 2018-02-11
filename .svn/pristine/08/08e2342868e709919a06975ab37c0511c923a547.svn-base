
<%@ page import="br.com.projetosar.entidades.Cliente" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" />
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

  
  
      <g:if test="${clienteInstance?.nome}">
        <p><strong><g:message code="cliente.nome.label" default="Nome" /></strong></p>

        <p><g:fieldValue bean="${clienteInstance}" field="nome"/></p>


      </g:if>

    

  
  
      <g:if test="${clienteInstance?.cpf}">
        <p><strong><g:message code="cliente.cpf.label" default="Cpf" /></strong></p>

        <p><g:fieldValue bean="${clienteInstance}" field="cpf"/></p>


      </g:if>

    

  
  
      <g:if test="${clienteInstance?.email}">
        <p><strong><g:message code="cliente.email.label" default="Email" /></strong></p>

        <p><g:fieldValue bean="${clienteInstance}" field="email"/></p>


      </g:if>

    

  
  
      <g:if test="${clienteInstance?.endereco}">
        <p><strong><g:message code="cliente.endereco.label" default="Endereco" /></strong></p>

        <g:each in="${clienteInstance.endereco}" var="e">
          <p><g:link controller="endereco" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></p>
        </g:each>
        <p>
          <g:link controller="endereco" action="create" 
              params="['cliente.id': clienteInstance.id]">
                  ${message(code: 'default.add.label',                       args: [message(code: 'endereco.label', 
                      default: 'Endereco')])}
          </g:link>
        </p>


      </g:if>

      <g:else>
        <br>
        <p><strong><g:message code="endereco.label" default="Endereco" /></strong></p>
        <p>
          <g:link controller="endereco" action="create" params="['cliente.id': clienteInstance.id]">
              ${message(code: 'default.add.label', args: [message(code: 'endereco.label', 
                  default: 'Endereco')])}
          </g:link>
        </p>
      </g:else>


    

  
  
      <g:if test="${clienteInstance?.telefone}">
        <p><strong><g:message code="cliente.telefone.label" default="Telefone" /></strong></p>

        <g:each in="${clienteInstance.telefone}" var="t">
          <p><g:link controller="telefone" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></p>
        </g:each>
        <p>
          <g:link controller="telefone" action="create" 
              params="['cliente.id': clienteInstance.id]">
                  ${message(code: 'default.add.label',                       args: [message(code: 'telefone.label', 
                      default: 'Telefone')])}
          </g:link>
        </p>


      </g:if>

      <g:else>
        <br>
        <p><strong><g:message code="telefone.label" default="Telefone" /></strong></p>
        <p>
          <g:link controller="telefone" action="create" params="['cliente.id': clienteInstance.id]">
              ${message(code: 'default.add.label', args: [message(code: 'telefone.label', 
                  default: 'Telefone')])}
          </g:link>
        </p>
      </g:else>


    

  
  
      <g:if test="${clienteInstance?.financeiro}">
        <p><strong><g:message code="cliente.financeiro.label" default="Financeiro" /></strong></p>

        <p>
          <g:link controller="financeiro" action="show" id="${clienteInstance?.financeiro?.id}">
              ${clienteInstance?.financeiro?.encodeAsHTML()}</g:link>
        </p>


      </g:if>

    

  
    <g:form>
      <g:hiddenField name="id" value="${clienteInstance?.id}" />
      <g:link class="btn btn-default" action="edit" id="${clienteInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
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
