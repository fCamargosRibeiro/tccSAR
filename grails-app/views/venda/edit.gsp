<%@ page import="br.com.projetosar.entidades.Venda" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'venda.label', default: 'Venda')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
	</head>
	<body>
	<h1><span><g:message code="default.edit.label" args="[entityName]" /></span></h1>
        
	<g:if test="${flash.message}">
		<div class="alert alert-info" role="status">${flash.message}</div>
	</g:if>
	<g:hasErrors bean="${vendaInstance}">
		<ul class="errors" role="alert">
			<g:eachError bean="${vendaInstance}" var="error">
				<div class="alert alert-danger" <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></div>
			</g:eachError>
		</ul>
	</g:hasErrors>
		<div id="edit-venda" class="form-group col-md-8" role="main">
                <div class="container">
                        <div class="row">
                         <div class="col-sm-8 col-sm-offset-2">

			<g:form class="pad-bg" url="[resource:vendaInstance, action:'update']" method="POST" >
				<h3><g:message code="default.edit.label" args="[entityName]" /></h3>
                            <g:hiddenField name="id" value="${vendaInstance?.id}" />
                <g:hiddenField name="version" value="${vendaInstance?.version}" />
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
	</body>
</html>
