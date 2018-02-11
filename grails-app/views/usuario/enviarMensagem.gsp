<%@ page import="br.com.projetosar.entidades.Usuario" %>
<html>
	<head>
		<meta name="layout" content="main">
		<title>Envio de Mensagens</title>
	</head>
	<body>
            <h2 class="page-header">Enviar Mensagem</h2>
		<g:if test="${flash.message}">
			<div class="alert alert-info" role="status">${flash.message}</div>
		</g:if>
		<div id="create-email" class="form-group col-md-8" role="main">


			<g:form action="enviarEmail" >
				<fieldset class="form">
                                    <div class="form-group col-md-12">
                                            <label for="destinatario">
                                                    <g:message code="email.destinatario.label" default="Destinatário" />

                                            </label>                        
                                            <sec:ifAnyGranted roles="ROLE_GERENTE"><p>Revendedor: <input type="radio" name="destinatario" value="1" /></p></sec:ifAnyGranted>
                                            <sec:ifAnyGranted roles="ROLE_GERENTE"><p>Grupo: <input type="radio" name="destinatario" value="2" /></p></sec:ifAnyGranted>
                                            <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><p>Cliente: <input type="radio" name="destinatario" value="3" checked="checked"/></p></sec:ifAnyGranted>
                                            
                                    </div>
                                    <sec:ifAnyGranted roles="ROLE_GERENTE"><div class="form-group col-md-12" id="emailRevendedores" hidden="hidden">
                                            <label for="revendedor">
                                                    <g:message code="email.revendedor.label" default="Revendedor" />
                                                    <span class="required-indicator">*</span>
                                            </label>
                                            <g:select id="revendedor" name="revendedor.id" from="${br.com.projetosar.entidades.Revendedor.list()}" optionKey="id" required="" value="" class="form-control" disabled="disabled"/>
                                    </div></sec:ifAnyGranted>
                                    <sec:ifAnyGranted roles="ROLE_GERENTE"><div class="form-group col-md-12" id="emailGrupo" hidden="hidden">
                                            <label for="grupo">
                                                    <g:message code="email.grupo.label" default="Grupo" />
                                                    <span class="required-indicator">*</span>
                                            </label>
                                            <g:select id="grupo" name="grupo.id" from="${br.com.projetosar.entidades.GrupoRevendedor.list()}" optionKey="id" required="" value="" class="form-control" disabled="disabled"/>
                                    </div></sec:ifAnyGranted>
                                    <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><div class="form-group col-md-12" id="emailCliente">
                                            <label for="cliente">
                                                    <g:message code="email.cliente.label" default="Cliente" />
                                                    <span class="required-indicator">*</span>
                                            </label>
                                            <g:select id="cliente" name="cliente.id" from="${br.com.projetosar.entidades.Cliente.list()}" optionKey="id" required="" value="" class="form-control"/>
                                    </div></sec:ifAnyGranted>
                                    <div class="form-group col-md-12">
                                            <label for="titulo">
                                                    <g:message code="email.titulo.label" default="Título" />
                                                    <span class="required-indicator">*</span>
                                            </label>
                                            <g:textField class="form-control" name="titulo" required="" value=""/>
                                    </div>
                                    <div class="form-group col-md-12">
                                            <label for="texto">
                                                    <g:message code="email.texto.label" default="Mensagem" />
                                                    <span class="required-indicator">*</span>
                                            </label>
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                                            <g:textArea class="form-control" name="texto" required="" value=""/>
                                    </div>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="btn btn-warning" value="Enviar"/>
					<g:link class="btn btn-default" action="/">Cancelar</g:link>
				</fieldset>
			</g:form>
		</div>
                <script type="text/javascript">
                    $('input:radio[name=destinatario]').change(function() {
                        if (this.value == 1) {
                            $('#emailRevendedores').show();
                            $('#emailGrupo').hide();
                            $('#emailCliente').hide();
                            $('#revendedor').prop('disabled', false);
                            $('#grupo').prop('disabled', true);
                            $('#cliente').prop('disabled', true);
                        }
                        else if (this.value == 2) {
                            $('#emailRevendedores').hide();
                            $('#emailGrupo').show();
                            $('#emailCliente').hide();
                            $('#revendedor').prop('disabled', true);
                            $('#grupo').prop('disabled', false);
                            $('#cliente').prop('disabled', true);
                        }
                        else if (this.value == 3) {
                            $('#emailRevendedores').hide();
                            $('#emailGrupo').hide();
                            $('#emailCliente').show();
                            $('#revendedor').prop('disabled', true);
                            $('#grupo').prop('disabled', true);
                            $('#cliente').prop('disabled', false);
                        }
                    });
                </script>  

	</body>
</html>
