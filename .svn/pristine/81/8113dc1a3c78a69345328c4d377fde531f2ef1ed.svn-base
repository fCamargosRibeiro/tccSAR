<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="http://getbootstrap.com/assets/ico/favicon.ico">
    <title>SAR</title>
  <ui:resources includeJQuery="true"/>
  <g:layoutHead/>
  <asset:stylesheet src="header.css"/>
  <asset:stylesheet src="bootstrap.min.css"/>
  <asset:stylesheet src="bootstrap-theme.css"/>  
  <asset:stylesheet src="bootstrap-theme.min.css"/>
  <asset:stylesheet src="bootstrap.css"/>
  <asset:stylesheet src="font-awesome.min.css"/>
  <asset:stylesheet src="menu.css"/>
  <asset:stylesheet src="ui.jqgrid.css"/>
  <asset:stylesheet src="jquery-ui.css"/>
  <r:layoutResources />
</head>
<body class="body-bottom">
  <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#"><g:img dir="images" file="logoSarPequena.png" width="40px" height="35px" align="left"/></a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li><a href="/SAR/"><span class="glyphicon glyphicon-home"></span> Home</a></li>
          <li><a href="/SAR/sobre"><span class="glyphicon glyphicon-info-sign"></span> Sobre</a></li>
          <li><a href="/SAR/faleConosco"><span class="glyphicon glyphicon-envelope"></span> Fale Conosco</a></li>
          <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><li><g:link controller="cliente" ><span class="glyphicon glyphicon-user"></span> Cliente</g:link></li></sec:ifAnyGranted>
          <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><li><g:link controller="produto" ><span class="glyphicon glyphicon-shopping-cart"></span> Produto</g:link></li></sec:ifAnyGranted>
          <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><li><g:link controller="venda" ><span class="glyphicon glyphicon-usd"></span> Vendas</g:link></li></sec:ifAnyGranted>
          <sec:ifAnyGranted roles="ROLE_REVENDEDOR">
                <li class=" dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> Serviços<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <sec:ifAnyGranted roles="ROLE_GERENTE"><li><g:link controller="grupoRevendedor" ><i class="fa fa-users" aria-hidden="true"></i> Grupo Revendedor</g:link></li></sec:ifAnyGranted>    
                        <sec:ifAnyGranted roles="ROLE_GERENTE"><li><g:link controller="revendedor" ><span class="glyphicon glyphicon-user"></span> Revendedor</g:link></li></sec:ifAnyGranted>  
                        <sec:ifAnyGranted roles="ROLE_GERENTE"><li><g:link controller="campanha" ><span class="glyphicon glyphicon-star"></span> Campanha</g:link></li></sec:ifAnyGranted>
                        <sec:ifAnyGranted roles="ROLE_GERENTE"><li><g:link controller="pedido" ><span class="glyphicon glyphicon-list-alt"></span> Pedido</g:link></li></sec:ifAnyGranted>           
                        <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><li><g:link controller="usuario" action="enviarMensagem"><span class="glyphicon glyphicon-envelope"></span> Enviar Mensagem</g:link></li></sec:ifAnyGranted>           
                        <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><li><g:link controller="relatorio" action="list"><span class="glyphicon glyphicon-duplicate"></span> Relatórios</g:link></li></sec:ifAnyGranted> 
                    </ul>
                </li>
          </sec:ifAnyGranted>
          <sec:ifAnyGranted roles="ROLE_ADMIN">
            <li class=" dropdown"><a href="#" class="dropdown-toggle " data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> Administrativo<span class="caret"></span></a>
              <ul class="dropdown-menu">
                  <li><g:link controller="usuario" ><span class="glyphicon glyphicon-user"></span> Usuario</g:link></li>
                  <li><g:link controller="OAuthID" ><i class="fa fa-id-card" aria-hidden="true"></i> OAuthID</g:link></li>
                  <li><g:link controller="requestmap" ><i class="fa fa-object-group" aria-hidden="true"></i> RequestMap</g:link></li>
                  <li><g:link controller="grupo" ><i class="fa fa-users" aria-hidden="true"></i> Grupo</g:link></li>
                  <li><g:link controller="grupoAtribuicao" ><i class="fa fa-user-circle-o" aria-hidden="true"></i> Grupo Atribuição</g:link></li>
                  <li><g:link controller="usuarioGrupo" ><i class="fa fa-user-plus" aria-hidden="true"></i> Grupo Usuario</g:link></li>
                  <li><g:link controller="atribuicao" ><span class="glyphicon glyphicon-certificate"></span> Atribuição</g:link></li>
            </ul>
            </li>
          </sec:ifAnyGranted>
          </ul>
        </div>
      </div>
    </div>
    <div id="page-wrapper" class="container-fluid" style="margin-left: 20px;margin-right: 20px;">
    <g:layoutBody/>
  </div>
  <div class="footer" role="contentinfo"></div>
  <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>
<r:layoutResources />
<asset:javascript src="jquery.min.js"/>
<asset:javascript src="jquery-ui-1.9.1.custom.min"/>
<asset:javascript src="bootstrap.min.js"/>
<asset:javascript src="codemirror.js"/>
<asset:javascript src="scripts.min.js"/>
<asset:javascript src="grid.locale-pt-br.js"/>
<asset:javascript src="jquery.jqGrid.min.js"/>
<asset:javascript src="jquery.maskedinput.js" />
</body>
</html>