<%@ page import="br.com.projetosar.entidades.Venda" %>
<%@ page import="br.com.projetosar.entidades.ProdutoVenda" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'venda.label', default: 'Venda')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
	</head>
	<body>
		<h1><span><g:message code="default.create.label" args="[entityName]" /></span></h1>
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
                
                <div class="vendaBG well">
                    <img class="imagemVenda" src="http://3.bp.blogspot.com/-2zBu4-Obdlk/TgF3pE2vqSI/AAAAAAAABEY/-_puFQIlcDA/s1600/tb-tesoreria.png"/>
                <h3>Soma Parcial:</h3>
                <div id="totalVenda"></div>
                <div id="totalVendaDesconto"></div>
                </div>
                
		<div id="create-venda" class="form-group col-md-4" role="main">

                <div class="container">
                <div class="row">
                <div class="col-sm-8 col-sm-offset-2">
			<g:form action="save" class="pad-bg" >
                            <h3><span><g:message code="default.create.label" args="[entityName]" /></span></h3>
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="btn btn-default" value="${message(code: 'default.button.create.label', default: 'Create')}" />
					<g:link class="btn btn-default" action="index">Cancelar</g:link>
				</fieldset>
			</g:form>
                        
                       <g:render template='/produtoVenda/itemProdutoVenda' model="['produtoVenda':null,'i':'_clone','hidden':true]"/>
                               </div>
                </div>
                </div>
		</div>
                <asset:stylesheet src="formularios.css"/>
                <asset:stylesheet src="titulos.css"/>
                <asset:stylesheet src="vendaBg.css"/>
	</body>
</html>
