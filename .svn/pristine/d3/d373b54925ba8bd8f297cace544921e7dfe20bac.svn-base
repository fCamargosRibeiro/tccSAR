import br.com.projetosar.entidades.EnderecoRevendedor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_enderecoRevendedorshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/enderecoRevendedor/show.gsp" }
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
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'enderecoRevendedor.label', default: 'EnderecoRevendedor'))],-1)
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
if(true && (enderecoRevendedorInstance?.tipo)) {
printHtmlPart(10)
invokeTag('message','g',29,['code':("enderecoRevendedor.tipo.label"),'default':("Tipo")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',31,['bean':(enderecoRevendedorInstance),'field':("tipo")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.logradouro)) {
printHtmlPart(10)
invokeTag('message','g',41,['code':("enderecoRevendedor.logradouro.label"),'default':("Logradouro")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',43,['bean':(enderecoRevendedorInstance),'field':("logradouro")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.lote)) {
printHtmlPart(10)
invokeTag('message','g',53,['code':("enderecoRevendedor.lote.label"),'default':("Lote")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',55,['bean':(enderecoRevendedorInstance),'field':("lote")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.bairro)) {
printHtmlPart(10)
invokeTag('message','g',65,['code':("enderecoRevendedor.bairro.label"),'default':("Bairro")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',67,['bean':(enderecoRevendedorInstance),'field':("bairro")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.cidade)) {
printHtmlPart(10)
invokeTag('message','g',77,['code':("enderecoRevendedor.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',79,['bean':(enderecoRevendedorInstance),'field':("cidade")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.estado)) {
printHtmlPart(10)
invokeTag('message','g',89,['code':("enderecoRevendedor.estado.label"),'default':("Estado")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',91,['bean':(enderecoRevendedorInstance),'field':("estado")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.cep)) {
printHtmlPart(10)
invokeTag('message','g',101,['code':("enderecoRevendedor.cep.label"),'default':("Cep")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',103,['bean':(enderecoRevendedorInstance),'field':("cep")],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (enderecoRevendedorInstance?.revendedor)) {
printHtmlPart(10)
invokeTag('message','g',113,['code':("enderecoRevendedor.revendedor.label"),'default':("Revendedor")],-1)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
expressionOut.print(enderecoRevendedorInstance?.revendedor?.encodeAsHTML())
})
invokeTag('link','g',117,['controller':("revendedor"),'action':("show"),'id':(enderecoRevendedorInstance?.revendedor?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(18)
invokeTag('hiddenField','g',127,['name':("id"),'value':(enderecoRevendedorInstance?.id)],-1)
printHtmlPart(18)
createTagBody(3, {->
invokeTag('message','g',128,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',128,['class':("btn btn-default"),'action':("edit"),'id':(enderecoRevendedorInstance?.id)],3)
printHtmlPart(18)
invokeTag('actionSubmit','g',130,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(4)
})
invokeTag('form','g',131,[:],2)
printHtmlPart(19)
invokeTag('stylesheet','asset',136,['src':("formularios.css")],-1)
printHtmlPart(0)
invokeTag('stylesheet','asset',137,['src':("titulos.css")],-1)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',138,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975260L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
