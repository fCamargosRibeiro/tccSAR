import br.com.projetosar.entidades.Revendedor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_revendedorshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/revendedor/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'revendedor.label', default: 'Revendedor'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',11,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("btn btn-default pull-right h2"),'action':("create")],2)
printHtmlPart(4)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("btn btn-default pull-right h2"),'action':("index")],2)
printHtmlPart(5)
invokeTag('message','g',18,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
if(true && (revendedorInstance?.nome)) {
printHtmlPart(10)
invokeTag('message','g',29,['code':("revendedor.nome.label"),'default':("Nome")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',31,['bean':(revendedorInstance),'field':("nome")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (revendedorInstance?.cpf)) {
printHtmlPart(10)
invokeTag('message','g',41,['code':("revendedor.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',43,['bean':(revendedorInstance),'field':("cpf")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (revendedorInstance?.identidade)) {
printHtmlPart(10)
invokeTag('message','g',53,['code':("revendedor.identidade.label"),'default':("Identidade")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',55,['bean':(revendedorInstance),'field':("identidade")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (revendedorInstance?.orgExpeditor)) {
printHtmlPart(10)
invokeTag('message','g',65,['code':("revendedor.orgExpeditor.label"),'default':("Org Expeditor")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',67,['bean':(revendedorInstance),'field':("orgExpeditor")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (revendedorInstance?.email)) {
printHtmlPart(10)
invokeTag('message','g',77,['code':("revendedor.email.label"),'default':("Email")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',79,['bean':(revendedorInstance),'field':("email")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (revendedorInstance?.ativo)) {
printHtmlPart(10)
invokeTag('message','g',89,['code':("revendedor.ativo.label"),'default':("Ativo")],-1)
printHtmlPart(11)
invokeTag('formatBoolean','g',91,['boolean':(revendedorInstance?.ativo)],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (revendedorInstance?.endereco)) {
printHtmlPart(10)
invokeTag('message','g',101,['code':("revendedor.endereco.label"),'default':("Endereco")],-1)
printHtmlPart(14)
for( e in (revendedorInstance.endereco) ) {
printHtmlPart(15)
createTagBody(4, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',104,['controller':("enderecoRevendedor"),'action':("show"),'id':(e.id)],4)
printHtmlPart(16)
}
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(message(code: 'default.add.label',                       args: [message(code: 'enderecoRevendedor.label', 
                      default: 'EnderecoRevendedor')]))
printHtmlPart(19)
})
invokeTag('link','g',111,['controller':("enderecoRevendedor"),'action':("create"),'params':(['revendedor.id': revendedorInstance.id])],3)
printHtmlPart(20)
}
else {
printHtmlPart(21)
invokeTag('message','g',119,['code':("enderecoRevendedor.label"),'default':("Endereco")],-1)
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'enderecoRevendedor.label', 
                  default: 'EnderecoRevendedor')]))
printHtmlPart(19)
})
invokeTag('link','g',124,['controller':("enderecoRevendedor"),'action':("create"),'params':(['revendedor.id': revendedorInstance.id])],3)
printHtmlPart(24)
}
printHtmlPart(25)
if(true && (revendedorInstance?.telefone)) {
printHtmlPart(10)
invokeTag('message','g',134,['code':("revendedor.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(14)
for( t in (revendedorInstance.telefone) ) {
printHtmlPart(15)
createTagBody(4, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',137,['controller':("telefoneRevendedor"),'action':("show"),'id':(t.id)],4)
printHtmlPart(16)
}
printHtmlPart(17)
createTagBody(3, {->
printHtmlPart(18)
expressionOut.print(message(code: 'default.add.label',                       args: [message(code: 'telefoneRevendedor.label', 
                      default: 'TelefoneRevendedor')]))
printHtmlPart(19)
})
invokeTag('link','g',144,['controller':("telefoneRevendedor"),'action':("create"),'params':(['revendedor.id': revendedorInstance.id])],3)
printHtmlPart(20)
}
else {
printHtmlPart(21)
invokeTag('message','g',152,['code':("telefoneRevendedor.label"),'default':("Telefone")],-1)
printHtmlPart(22)
createTagBody(3, {->
printHtmlPart(23)
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'telefoneRevendedor.label', 
                  default: 'TelefoneRevendedor')]))
printHtmlPart(19)
})
invokeTag('link','g',157,['controller':("telefoneRevendedor"),'action':("create"),'params':(['revendedor.id': revendedorInstance.id])],3)
printHtmlPart(24)
}
printHtmlPart(26)
createTagBody(2, {->
printHtmlPart(27)
invokeTag('hiddenField','g',166,['name':("id"),'value':(revendedorInstance?.id)],-1)
printHtmlPart(27)
createTagBody(3, {->
invokeTag('message','g',167,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',167,['class':("btn btn-default"),'action':("edit"),'id':(revendedorInstance?.id)],3)
printHtmlPart(27)
invokeTag('actionSubmit','g',169,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(4)
})
invokeTag('form','g',170,[:],2)
printHtmlPart(28)
invokeTag('stylesheet','asset',175,['src':("formularios.css")],-1)
printHtmlPart(0)
invokeTag('stylesheet','asset',176,['src':("titulos.css")],-1)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',177,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975191L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
