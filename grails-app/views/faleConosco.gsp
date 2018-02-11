<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
  <head>
    <meta name="layout" content="main">
  </head>
  <body>
    <h1 class="linha2">
  <span>Fale Conosco</span>
</h1>
<div class="container">

    <form class="well form-horizontal" id="contact_form">
<fieldset>

<!-- Form Name -->
<legend>Entre em contato!</legend>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Nome</label>  
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input id="nome"  name="nome" placeholder="Insira seu nome" class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">E-Mail</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
  <input id="email" name="email" placeholder="Insira seu e-mail" class="form-control"  type="text">
    </div>
  </div>
</div>



  
<div class="form-group">
  <label class="col-md-4 control-label">Mensagem</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
        	<textarea id="msgFaleConosco" class="form-control" name="mensagem" placeholder="Escreva aqui sua mensagem"></textarea>
  </div>
  </div>
</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
      <button id="enviar" type="submit" class="btn btn-warning" >Enviar <span class="glyphicon glyphicon-send"></span></button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
     <asset:stylesheet src="conteudos.css"/>
     <script>
            $( "#enviar" ).click(function() {  
                    $.ajax({
                      url: 'usuario/faleConosco',
                      type: 'POST',
                      async: false,
                      data:{
                          'nome': $("#nome").val(),
                          'email': $("#email").val(),
                          'msgFaleConosco': $("#msgFaleConosco").val()
                      }
                    })
            });
     </script>
  </body>
</html>
