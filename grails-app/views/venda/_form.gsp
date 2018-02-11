<%@ page import="br.com.projetosar.entidades.Venda" %>

<!--
 Scaffolding
 -->

    <div class="form-group col-md-12">
	 <label for="data"> 
		<g:message code="venda.data.label" default="Data:" />
		<span class="required-indicator">*</span>
	 </label> 
	<g:datePicker name="data" precision="day"  value="${vendaInstance?.data}" disabled="disabled"/>
</div>

    <div class="form-group col-md-12">
	<label for="tipoPagamento">
		<g:message code="venda.tipoPagamento.label" default="Tipo Pagamento" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="tipoPagamento" from="${vendaInstance.constraints.tipoPagamento.inList}" required="" value="${vendaInstance?.tipoPagamento}" valueMessagePrefix="venda.tipoPagamento"/>

</div>

<div class="form-group col-md-12" hidden="hidden" id="entrada">
	<label for="entrada">
		<g:message code="venda.entrada.label" default="Entrada:" />
		
	</label>
	<g:field name="entrada" value="${fieldValue(bean: vendaInstance, field: 'entrada')}" type="number"/>

</div>

    <div class="form-group col-md-12">
	<label for="desconto">
		<g:message code="venda.desconto.label" default="Porcentagem de desconto:" />
		
	</label>
	<g:field name="desconto" value="${fieldValue(bean: vendaInstance, field: 'desconto')}"/>

</div>

    <div class="form-group col-md-12">
	<label for="cliente">
		<g:message code="venda.cliente.label" default="Cliente" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="cliente" name="cliente.id" from="${br.com.projetosar.entidades.Cliente.list()}" optionKey="id" required="" value="${vendaInstance?.cliente?.id}" class="many-to-one"/>

</div>

    <div class="form-group col-md-12">
        <table class="table table-hover">
            <g:render template="/produtoVenda/gridVenda" model="['vendaInstance':vendaInstance]"/>
        </table>
</div>

<asset:stylesheet src="inputs.css"/>
                <script type="text/javascript">
                    $('#tipoPagamento').change(function() {
                        if (this.value == 'À Prazo') {
                            $('#entrada').show();
                            $('#entrada').prop('disabled', false);
                        }else{
                            $('#entrada').hide();
                            $('#entrada').prop('disabled', true);
                        }
                    });
                </script> 