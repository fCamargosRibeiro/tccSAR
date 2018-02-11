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
  <asset:stylesheet src="header.css"/>
  <asset:stylesheet src="bootstrap.min.css"/>
  <asset:stylesheet src="bootstrap-theme.css"/>  
  <asset:stylesheet src="bootstrap-theme.min.css"/>
  <asset:stylesheet src="bootstrap.css"/>
  <asset:stylesheet src="font-awesome.css"/>
  <asset:stylesheet src="menu.css"/>
  <asset:stylesheet src="ui.jqgrid.css"/>
  <asset:stylesheet src="jquery-ui.css"/>
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
          <li><a href="/SAR"><span class="glyphicon glyphicon-home"></span> Home</a></li>
          <li><a href="/SAR/sobre"><span class="glyphicon glyphicon-info-sign"></span> Sobre</a></li>
          <li><a href="/SAR/faleConosco"><span class="glyphicon glyphicon-envelope"></span> Fale Conosco</a></li>
        </ul>
      </div>
    </div>
  </div>
 <%-- <div class="container">
    <div class="corpoIndex jumbotron">
      <h1>Sistema de Apoio ao Revendedor</h1>
      <p class="lead"><br>Aqui você terá todo apoio e controle para suas vendas</p>
    </div>
  </div> --%>
<div class="hoverzoom">
    <g:img dir="images" file="SARBanner1.png"  class="col-md-11 col-xs-8 col-lg-11"/>
    <div class="retina">
        <p>Você é um(a) revendedor(a) e tem dificuldades para controlar suas vendas? 
        O SAR é a solução perfeita para te auxiliar no gerenciamento de suas atividades. 
        O SAR oferece diversas funcionalidades, dentre elas o gerenciamento de equipes, vendas, clientes, 
        estoque, pedidos, campanhas, e muitas outras. O melhor de tudo é que você pode acessar o SAR do 
        seu smartphone, tablet ou computador! Se interessou? Clique e saiba mais!</p>
        <a href="/SAR/sobre">Saiba mais</a>
    </div>
</div>
<div class="conteudo">
      <p class="about">
      <span> Modelo de Negócio</span> Ut congue augue non tellus bibendum, in varius tellus condimentum. In scelerisque nibh tortor, sed rhoncus odio condimentum in. Sed sed est ut sapien ultrices eleifend. Integer tellus est, vehicula eu lectus tincidunt,
      ultricies feugiat leo. Suspendisse tellus elit, pharetra in hendrerit ut, aliquam quis augue. Nam ut nibh mollis, tristique ante sed, viverra massa.
    </p>
  </div>
<div class="conteudo">
  <p class="about">
      <span> Gerenciamento de equipes</span> Ut congue augue non tellus bibendum, in varius tellus condimentum. In scelerisque nibh tortor, sed rhoncus odio condimentum in. Sed sed est ut sapien ultrices eleifend. Integer tellus est, vehicula eu lectus tincidunt,
      ultricies feugiat leo. Suspendisse tellus elit, pharetra in hendrerit ut, aliquam quis augue. Nam ut nibh mollis, tristique ante sed, viverra massa.
    </p>
</div>
<div class="conteudo2"> 
  <p>Para revendedores:</p>
  <div>
   <g:img dir="images" file="natura.png" class="logosEmpresas"/>
   <g:img dir="images" file="avon.png" class="logosEmpresas"/>
   <g:img dir="images" file="tupperware.jpg" class="logosEmpresas"/>
   <g:img dir="images" file="demillus.png" class="logosEmpresas"/>
  </div>
</div>


  <div class="container">
      <div class="corpoLogin card card-container login-html">
          <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
          <p id="profile-name" class="profile-name-card"></p>
          <form action="${postUrl ?: '/login/j_spring_security_check'}" method="POST" id="loginForm" class="form-signin">
              <span id="reauth-email" class="reauth-email"></span>
              <input type="text" name="j_username" id="inputEmail" class="form-control" placeholder="Usuário" required autofocus>
              <input type="password" name="j_password" id="inputPassword" class="form-control" placeholder="Senha" required>
              <div id="remember" class="checkbox">
                  <label>
                      <input type="checkbox" name="${rememberMeParameter ?: 'remember-me'}" value="remember-me"> Lembre-me
                  </label>
              </div>
              <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Logar</button>
          </form><!-- /form -->
          <a href="#" class="forgot-password">
              Esqueceu sua senha?
          </a>
          <br>
          <br>
          <center>
            <a href="/${grailsApplication.metadata['app.name']}/oauth/google/authenticate"><g:img dir="images" file="btn_google_normal.png" width="210" height="50"/>
          </center>
      </div><!-- /card-container -->
  </div>

<asset:javascript src="jquery.min.js"/>
<asset:javascript src="jquery-ui-1.9.1.custom.min"/>
<asset:javascript src="bootstrap.min.js"/>
<asset:javascript src="codemirror.js"/>
<asset:javascript src="scripts.min.js"/>
<asset:javascript src="grid.locale-pt-br.js"/>
<asset:javascript src="jquery.jqGrid.min.js"/>
<asset:stylesheet src="banner.css"/>
<asset:stylesheet src="conteudos.css"/>
<asset:stylesheet src="footer.css"/>
<footer class="footer"></footer>
</body>
</html>