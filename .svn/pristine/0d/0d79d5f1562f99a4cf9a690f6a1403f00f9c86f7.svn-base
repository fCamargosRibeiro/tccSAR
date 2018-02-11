<%@ page import="br.com.projetosar.entidades.Cliente" %>

<!--
 Scaffolding
 -->

<div class="form-group col-md-12">
	<label for="nome">
		<g:message code="cliente.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${clienteInstance?.nome}"  pattern="[a-zA-Z \u00C0-\u024F]+" />

</div>

<div class="form-group col-md-12">
	<label for="cpf">
		<g:message code="cliente.cpf.label" default="Cpf" />
		
	</label>
	<g:textField name="cpf" required="" value="${clienteInstance?.cpf}"/>

</div>

<div class="form-group col-md-12">
	<label for="email">
		<g:message code="cliente.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${clienteInstance?.email}"/>

</div>

<div class="form-group col-md-12">
	<label for="endereco">
		<g:message code="cliente.endereco.label" default="Endereco" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.endereco?}" var="e">
    <li><g:link controller="endereco" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="endereco" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'endereco.label', default: 'Endereco')])}</g:link>
</li>
</ul>


</div>

<div class="form-group col-md-12">
	<label for="telefone">
		<g:message code="cliente.telefone.label" default="Telefone" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${clienteInstance?.telefone?}" var="t">
    <li><g:link controller="telefone" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="telefone" action="create" params="['cliente.id': clienteInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'telefone.label', default: 'Telefone')])}</g:link>
</li>
</ul>


</div>
<asset:javascript src="jquery.maskedinput.js" />
<asset:stylesheet src="inputs.css"/>

    <!-- Adicionando Javascript -->
    <script type="text/javascript" >
    
    $("#cpf").mask("999.999.999-99");
    
    </script>