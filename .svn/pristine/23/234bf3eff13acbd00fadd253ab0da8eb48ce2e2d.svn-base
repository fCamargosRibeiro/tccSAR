<!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta name="layout" content="main">  
  </head>
<body>
  <%--<div class="container">
    <div class="corpoIndex jumbotron">
      <h1>Sistema de Apoio ao Revendedor</h1>
      <p class="lead"><br>Aqui você terá todo apoio e controle para suas vendas</p>
    </div>
  </div> 
  --%>
<h1 class="linha">
  <span>Acesso rápido</span>
</h1>


 <div class="row">
<div class="col-lg-1 botaoMaior">
  <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><a href="/SAR/pagamento/create" > <g:img dir="images" file="registrarPag1.PNG" class=" botaoMaior col-lg-6"/></a></sec:ifAnyGranted>
  <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><a href="/SAR/usuario/enviarMensagem" > <g:img dir="images" file="enviaremail.PNG" class=" botaoMaior col-lg-6"/></a></sec:ifAnyGranted>
  <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><a href="/SAR/relatorio/list" > <g:img dir="images" file="emitirRelatorio.PNG" class=" botaoMaior col-lg-6"/></a></sec:ifAnyGranted>
</div>
 
<div class="col-lg-9">
   <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><a href="/SAR/cliente/create" > <g:img dir="images" file="novoCliente.png" class="imagensRedondas  img-responsive col-lg-6"/></a></sec:ifAnyGranted>
   <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><a href="/SAR/venda/create" > <g:img dir="images" file="novaVenda.png" class="imagensRedondas col-lg-6"/></a></sec:ifAnyGranted>
   <sec:ifAnyGranted roles="ROLE_REVENDEDOR"><a href="/SAR/produto/create" > <g:img dir="images" file="novoProduto.png" class="imagensRedondas col-lg-6"/></a></sec:ifAnyGranted>
   <sec:ifAnyGranted roles="ROLE_GERENTE"><a href="/SAR/revendedor/create" > <g:img dir="images" file="novoRevendedor.png" class="imagensRedondas col-lg-6"/></a></sec:ifAnyGranted>
   <sec:ifAnyGranted roles="ROLE_GERENTE"><a href="/SAR/campanha/create" > <g:img dir="images" file="Nova Campanha.png" class="imagensRedondas col-lg-6"/></a></sec:ifAnyGranted>
   <sec:ifAnyGranted roles="ROLE_GERENTE"><a href="/SAR/grupoRevendedor/create" > <g:img dir="images" file="NovoGRupo.png" class="imagensRedondas col-lg-6"/></a></sec:ifAnyGranted>
   
</div>

  </div>
  
        
   
   <div class="corpoLogin card card-container login-wrap">  
        <h3>Olá ${applicationContext.springSecurityService.currentUser}</h3>
          <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
          <p id="profile-name" class="profile-name-card"></p>
          <center><a class="btn btn-warning" href="j_spring_security_logout">Logout</a></center>
          </div>
      
      
  <asset:stylesheet src="botaom.css"/>
  <asset:stylesheet src="conteudos.css"/>
</body>
</html>