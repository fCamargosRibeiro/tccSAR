<% import grails.persistence.Event %>
<%=packageName%>
<!--
 Scaffolding
 -->
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main">
  <g:set var="entityName" value="\${message(code: '${domainClass.propertyName}.label', default: '${className}')}" />
  <title><g:message code="default.show.label" args="[entityName]" /></title>
</head>
<body>
  <div class="row">
    <g:link class="btn btn-default pull-right h2" action="create"><g:message code="default.create.label" args="[entityName]" /></g:link>
    <g:link class="btn btn-default pull-right h2" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link>
    
    <h1><span><g:message code="default.create.label" args="[entityName]" /></span></h1>
    <g:if test="\${flash.message}">
      <div class="message" role="status" class="alert alert-info">\${flash.message}</div>
    </g:if>
    
        <div class="row pad-bg ">
            <div class=" col-md-6 col-sm-8 col-sm-offset-2 ">
<%  
excludedProps = Event.allEvents.toList() << 'id' << 'version'
allowedNames = domainClass.persistentProperties*.name << 'dateCreated' << 'lastUpdated'
props = domainClass.properties.findAll { allowedNames.contains(it.name) && !excludedProps.contains(it.name) }
Collections.sort(props, comparator.constructors[0].newInstance([domainClass] as Object[]))
props.each { p -> %>
  
  
      <g:if test="\${${propertyName}?.${p.name}}">
        <p><strong><g:message code="${domainClass.propertyName}.${p.name}.label" default="${p.naturalName}" /></strong></p>
<%
  if (p.isEnum()) { %>
        <p><g:fieldValue bean="\${${propertyName}}" field="${p.name}"/></p>
<%
  } else if (p.oneToMany || p.manyToMany) { %>
        <g:each in="\${${propertyName}.${p.name}}" var="${p.name[0]}">
          <p><g:link controller="${p.referencedDomainClass?.propertyName}" action="show" id="\${${p.name[0]}.id}">\${${p.name[0]}?.encodeAsHTML()}</g:link></p>
        </g:each>
        <p>
          <g:link controller="${p.referencedDomainClass?.propertyName}" action="create" 
              params="['${domainClass.propertyName}.id': ${propertyName}.id]">
                  \${message(code: 'default.add.label', 
                      args: [message(code: '${p.referencedDomainClass?.propertyName}.label', 
                      default: '${p.referencedDomainClass.shortName}')])}
          </g:link>
        </p>
<%  
  } else if (p.manyToOne || p.oneToOne) { %>
        <p>
          <g:link controller="${p.referencedDomainClass?.propertyName}" action="show" id="\${${propertyName}?.${p.name}?.id}">
              \${${propertyName}?.${p.name}?.encodeAsHTML()}</g:link>
        </p>
<%  
  } else if (p.type == Boolean || p.type == boolean) { %>
        <p><g:formatBoolean boolean="\${${propertyName}?.${p.name}}" /></p>
<%  
  } else if (p.type == Number) { %>
        <p><g:formatNumber type="number" number="\${${propertyName}?.${p.name}}" format="#"/></p>
<%  
  } else if (p.type == Date || p.type == java.sql.Date || p.type == java.sql.Time || p.type == Calendar) { %>
        <p><g:formatDate date="\${${propertyName}?.${p.name}}" /></span>
<%  
  } else if (p.type==([] as byte[]).class) { %>
          <g:link action="renderBlob" id="\${${propertyName}?.id}" params="[blob: '${p.name}']">
            <g:message code="default.view.label" default="Ver" />
          </g:link>
<%  
  } else if (!p.type.isArray()) { %>
        <p><g:fieldValue bean="\${${propertyName}}" field="${p.name}"/></p>
<%
  } %>

      </g:if>
<%  
  if (p.oneToMany || p.manyToMany) { %>
      <g:else>
        <br>
        <p><strong><g:message code="${p.referencedDomainClass?.propertyName}.label" default="${p.naturalName}" /></strong></p>
        <p>
          <g:link controller="${p.referencedDomainClass?.propertyName}" action="create" params="['${domainClass.propertyName}.id': ${propertyName}.id]">
              \${message(code: 'default.add.label', args: [message(code: '${p.referencedDomainClass?.propertyName}.label', 
                  default: '${p.referencedDomainClass.shortName}')])}
          </g:link>
        </p>
      </g:else>

<% 
  } %>
    
<%
} %>
  
    <g:form>
      <g:hiddenField name="id" value="\${${propertyName}?.id}" />
      <g:link class="btn btn-default" action="edit" id="\${${propertyName}?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
      <g:actionSubmit class="btn btn-danger" action="delete" value="\${message(code: 'default.button.delete.label', default: 'Delete')}" 
          onclick="return confirm('\${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
    </g:form>
   </div>
  </div>
</div>
</div>
<asset:stylesheet src="formularios.css"/>
<asset:stylesheet src="titulos.css"/>
</body>
</html>
