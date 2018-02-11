<%=packageName%>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
		<h1><span><g:message code="default.create.label" args="[entityName]" /></span></h1>
		<g:if test="\${flash.message}">
			<div class="alert alert-info" role="status">\${flash.message}</div>
		</g:if>
		<g:hasErrors bean="\${${propertyName}}">
			<ul class="errors" role="alert">
				<g:eachError bean="\${${propertyName}}" var="error">
					<div class="alert alert-danger" <g:if test="\${error in org.springframework.validation.FieldError}">data-field-id="\${error.field}"</g:if>><g:message error="\${error}"/></div>
				</g:eachError>
			</ul>
		</g:hasErrors>
		
                <div id="create-${domainClass.propertyName}" class="form-group col-md-12" role="main">
                <div class="container">
                <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
                    
			<g:form action="save" class="pad-bg" <%= multiPart ? ' enctype="multipart/form-data"' : '' %>>
				<h3><span><g:message code="default.create.label" args="[entityName]" /></span></h3>
                            <fieldset class="form">
                                 <g:render template="form"/>
				</fieldset>
                                
				<fieldset class="buttons">
					<g:submitButton name="create" class="btn btn-default" value="\${message(code: 'default.button.create.label', default: 'Create')}" />
					<g:link class="btn btn-default" action="index">Cancelar</g:link>
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
