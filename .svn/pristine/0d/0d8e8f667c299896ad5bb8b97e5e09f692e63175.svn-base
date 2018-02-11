import br.com.projetosar.entidades.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_clienteindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'cliente.label', default: 'Cliente'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
invokeTag('message','g',11,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',11,['class':("btn btn-default pull-right h2"),'action':("create")],2)
printHtmlPart(4)
invokeTag('message','g',13,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('sortableColumn','g',22,['property':("nome"),'title':(message(code: 'cliente.nome.label', default: 'Nome'))],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',24,['property':("cpf"),'title':(message(code: 'cliente.cpf.label', default: 'Cpf'))],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',26,['property':("email"),'title':(message(code: 'cliente.email.label', default: 'Email'))],-1)
printHtmlPart(10)
loop:{
int i = 0
for( clienteInstance in (clienteInstanceList) ) {
printHtmlPart(11)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(12)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: clienteInstance, field: "nome"))
})
invokeTag('link','g',34,['action':("show"),'id':(clienteInstance.id)],3)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: clienteInstance, field: "cpf"))
printHtmlPart(14)
expressionOut.print(fieldValue(bean: clienteInstance, field: "email"))
printHtmlPart(15)
i++
}
}
printHtmlPart(16)
invokeTag('paginate','g',47,['total':(clienteInstanceCount ?: 0)],-1)
printHtmlPart(17)
invokeTag('stylesheet','asset',50,['src':("tabelas.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',51,['src':("titulos.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',52,['src':("inputs.css")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',53,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975159L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
