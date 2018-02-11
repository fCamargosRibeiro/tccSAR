<%@ page import="br.com.projetosar.entidades.Revendedor" %>

<!--
 Scaffolding
 -->

<div class="form-group col-md-12">
	<label for="nome">
		<g:message code="revendedor.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${revendedorInstance?.nome}" pattern="[a-zA-Z \u00C0-\u024F]+"/>

</div>

<div class="form-group col-md-12">
	<label for="cpf">
		<g:message code="revendedor.cpf.label" default="Cpf" />
		
	</label>
	<g:textField name="cpf" required="" value="${revendedorInstance?.cpf}"/>

</div>

<div class="form-group col-md-12">
	<label for="identidade">
		<g:message code="revendedor.identidade.label" default="Identidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="identidade" type="number" min="0" value="${revendedorInstance.identidade}" required=""/>

</div>

<div class="form-group col-md-12">
	<label for="orgExpeditor">
		<g:message code="revendedor.orgExpeditor.label" default="Org Expeditor" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="orgExpeditor" required="" value="${revendedorInstance?.orgExpeditor}" pattern="[a-zA-Z \u00C0-\u024F]+"/>

</div>

<div class="form-group col-md-12">
	<label for="email">
		<g:message code="revendedor.email.label" default="Email" />
		
	</label>
	<g:field type="email" name="email" required="" value="${revendedorInstance?.email}"/>

</div>

<div class="form-group col-md-12">
	<label for="ativo">
		<g:message code="revendedor.ativo.label" default="Ativo" />
		
	</label>
	<g:checkBox name="ativo" value="${revendedorInstance?.ativo}" />

</div>

<div class="form-group col-md-12">
	<label for="endereco">
		<g:message code="revendedor.endereco.label" default="Endereco" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${revendedorInstance?.endereco?}" var="e">
    <li><g:link controller="enderecoRevendedor" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="enderecoRevendedor" action="create" params="['revendedor.id': revendedorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'enderecoRevendedor.label', default: 'EnderecoRevendedor')])}</g:link>
</li>
</ul>


</div>

<div class="form-group col-md-12">
	<label for="telefone">
		<g:message code="revendedor.telefone.label" default="Telefone" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${revendedorInstance?.telefone?}" var="t">
    <li><g:link controller="telefoneRevendedor" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="telefoneRevendedor" action="create" params="['revendedor.id': revendedorInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'telefoneRevendedor.label', default: 'TelefoneRevendedor')])}</g:link>
</li>
</ul>


</div>
<asset:javascript src="jquery.maskedinput.js" />
<asset:stylesheet src="inputs.css"/>

    <!-- Adicionando Javascript -->
    <script type="text/javascript" >
    
    $("#cpf").mask("999.999.999-99");
    
    </script>