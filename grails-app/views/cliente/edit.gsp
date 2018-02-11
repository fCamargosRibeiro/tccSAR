<%@ page import="br.com.projetosar.entidades.Cliente" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'cliente.label', default: 'Cliente')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
	<h1><span><g:message code="default.edit.label" args="[entityName]" /></span></h1>
       
	<g:if test="${flash.message}">
		<div class="alert alert-info" role="status">${flash.message}</div>
	</g:if>
	<g:hasErrors bean="${clienteInstance}">
		<ul class="errors" role="alert">
			<g:eachError bean="${clienteInstance}" var="error">
				<div class="alert alert-danger" <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></div>
			</g:eachError>
		</ul>
	</g:hasErrors>
		<div id="edit-cliente" class="form-group col-md-8" role="main">
                <div class="container">
                        <div class="row">
                         <div class="col-sm-8 col-sm-offset-2">
                             
                             

			<g:form class="pad-bg" url="[resource:clienteInstance, action:'update']" method="POST" >
                            <h3><span><g:message code="default.edit.label" args="[entityName]" /></span></h3>
				<g:hiddenField name="id" value="${clienteInstance?.id}" />
                <g:hiddenField name="version" value="${clienteInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:actionSubmit class="btn btn-success" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
					<g:actionSubmit class="btn btn-default" action="show" value="${message(code: 'default.button.cancel.label', default: 'Cancel')}" />
				</fieldset>
			</g:form>
		</div>
                </div>
                </div>
                </div>
        <asset:stylesheet src="formularios.css"/>
        <asset:stylesheet src="titulos.css"/>
        <asset:stylesheet src="inputs.css"/>
	</body>
</html>
