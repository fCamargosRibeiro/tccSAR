
<%@ page import="br.com.projetosar.entidades.Relatorio" %>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <asset:javascript src="lightbox-form.js" />
  <g:set var="entityName" value="${message(code: 'relatorio.label', default: 'Relatorio')}" />
  <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
  <div class="row">
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.create.label" args="[entityName]" /></g:link>
    <g:link class="btn btn-default pull-right h2" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link>
    
    <h1><span>Relatorios</span></h1>
    <h1>Escolha uma dos relatorios abaixo:</h1>
    <g:if test="${flash.message}">
      <div class="message">${flash.message}</div>
    </g:if>
    <div>
      <table>
        <thead>
          <tr>
        <g:sortableColumn property="nome" title="Relatorios" />
        </tr>
        </thead>
        <tbody>
        <g:each in="${relatorioInstanceList}" status="i" var="relatorioInstance">
          <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
            <td>
              <form>
                <g:remoteLink controller="relatorio" action="verParams" 
                              id="${relatorioInstance.id}" update="resultado" onComplete="openbox
                              ('${relatorioInstance.nome}',1);">${relatorioInstance.nome}</g:remoteLink>
              </form>
            </td>
          </tr>
        </g:each>
        </tbody>
      </table>
    </div>
  </div>
  <!--Resultado da pesquisa de parametros e efeito de lightbox-->
  <div id="shadowing"></div>
  <div id="box">
    <span id="boxtitle"></span>
    <img src="${resource(dir: 'images', file: 'btn_close.png')}" alt="sair" onClick="closebox()" style="position:absolute; top:0; right: 10px"/>
    <div id="resultado"></div>
  </div>
<asset:stylesheet src="formularios.css"/>
<asset:stylesheet src="titulos.css"/>
</body>
</html>
