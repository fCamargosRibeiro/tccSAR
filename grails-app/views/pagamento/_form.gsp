<%@ page import="br.com.projetosar.entidades.Pagamento" %>

<!--
 Scaffolding
 -->

<div class="form-group col-md-12">
	<label for="data">
		<g:message code="pagamento.data.label" default="Data" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data" precision="day"  value="${pagamentoInstance?.data}" disabled="disabled" />

</div>

<div class="form-group col-md-12">
	<label for="valor">
		<g:message code="pagamento.valor.label" default="Valor" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="valor" value="${fieldValue(bean: pagamentoInstance, field: 'valor')}" required="" type="number" step="0.01"/>

</div>

<div class="form-group col-md-12">
	<label for="observacao">
		<g:message code="pagamento.observacao.label" default="Observacao" />
		
	</label>
	<g:textField name="observacao" value="${pagamentoInstance?.observacao}"/>

</div>

<div class="form-group col-md-12">
	<label for="cliente">
		<g:message code="pagamento.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${br.com.projetosar.entidades.Cliente.list()}" optionKey="id" required="" value="${pagamentoInstance?.cliente?.id}" class="many-to-one"/>

</div>

<asset:stylesheet src="inputs.css"/>