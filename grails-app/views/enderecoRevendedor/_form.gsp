<%@ page import="br.com.projetosar.entidades.EnderecoRevendedor" %>

<!--
 Scaffolding
 -->

<div class="form-group col-md-12">
	<label for="cep">
		<g:message code="enderecoRevendedor.cep.label" default="Cep" />
		
	</label>
	<g:textField name="cep" required="" value="${enderecoInstance?.cep}" type="text" size="10" maxlength="9" onblur="pesquisacep(this.value);"/>

</div>

<div class="form-group col-md-12">
	<label for="tipo">
		<g:message code="enderecoRevendedor.tipo.label" default="Tipo" />
		
	</label>
	<g:textField name="tipo" required="" value="${enderecoRevendedorInstance?.tipo}"/>

</div>

<div class="form-group col-md-12">
	<label for="logradouro">
		<g:message code="enderecoRevendedor.logradouro.label" default="Logradouro" />
		
	</label>
	<g:textField name="logradouro" required="" value="${enderecoRevendedorInstance?.logradouro}"/>

</div>

<div class="form-group col-md-12">
	<label for="lote">
		<g:message code="enderecoRevendedor.lote.label" default="Lote" />
		
	</label>
	<g:textField name="lote" required="" value="${enderecoRevendedorInstance?.lote}"/>

</div>

<div class="form-group col-md-12">
	<label for="bairro">
		<g:message code="enderecoRevendedor.bairro.label" default="Bairro" />
		
	</label>
	<g:textField name="bairro" required="" value="${enderecoRevendedorInstance?.bairro}"/>

</div>

<div class="form-group col-md-12">
	<label for="cidade">
		<g:message code="enderecoRevendedor.cidade.label" default="Cidade" />
		
	</label>
	<g:textField name="cidade" required="" value="${enderecoRevendedorInstance?.cidade}"/>

</div>

<div class="form-group col-md-12">
	<label for="estado">
		<g:message code="enderecoRevendedor.estado.label" default="Estado" />
		
	</label>
	<g:textField name="estado" required="" value="${enderecoRevendedorInstance?.estado}"/>

</div>

<div class="form-group col-md-12">
	<label for="revendedor">
		<g:message code="enderecoRevendedor.revendedor.label" default="Revendedor" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="revendedor" name="revendedor.id" from="${br.com.projetosar.entidades.Revendedor.list()}" optionKey="id" required="" value="${enderecoRevendedorInstance?.revendedor?.id}" class="many-to-one"/>

</div>

<asset:stylesheet src="inputs.css"/>
<asset:javascript src="jquery.maskedinput.js" />

<!-- Adicionando Javascript -->
    <script type="text/javascript" >
    
    $("#cep").mask("99.999-999");
    function limpa_formulario_cep() {
            //Limpa valores do formulário de cep.
            document.getElementById('logradouro').value=("");
            document.getElementById('bairro').value=("");
            document.getElementById('cidade').value=("");
            document.getElementById('estado').value=("");
    }

    function meu_callback(conteudo) {
        if (!("erro" in conteudo)) {
            //Atualiza os campos com os valores.
            document.getElementById('logradouro').value=(conteudo.logradouro);
            document.getElementById('bairro').value=(conteudo.bairro);
            document.getElementById('cidade').value=(conteudo.localidade);
            document.getElementById('estado').value=(conteudo.uf);
        } //end if.
        else {
            //CEP não Encontrado.
            limpa_formulario_cep();
            alert("CEP não encontrado.");
        }
    }
        
    function pesquisacep(valor) {

        //Nova variável "cep" somente com dígitos.
        var cep = valor.replace(/\D/g, '');

        //Verifica se campo cep possui valor informado.
        if (cep != "") {

            //Expressão regular para validar o CEP.
            var validacep = /^[0-9]{8}$/;

            //Valida o formato do CEP.
            if(validacep.test(cep)) {

                //Preenche os campos com "..." enquanto consulta webservice.
                document.getElementById('logradouro').value="...";
                document.getElementById('bairro').value="...";
                document.getElementById('cidade').value="...";
                document.getElementById('estado').value="...";

                //Cria um elemento javascript.
                var script = document.createElement('script');

                //Sincroniza com o callback.
                script.src = '//viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

                //Insere script no documento e carrega o conteúdo.
                document.body.appendChild(script);

            } //end if.
        } //end if.
        else {
            //cep sem valor, limpa formulário.
            limpa_formulario_cep();
        }
    };

    </script>