import br.com.projetosar.entidades.Venda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_vendaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/venda/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'venda.label', default: 'Venda'))],-1)
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
printHtmlPart(4)
createTagBody(2, {->
invokeTag('message','g',12,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',12,['class':("btn btn-default pull-right h2"),'action':("create")],2)
printHtmlPart(5)
invokeTag('message','g',14,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('sortableColumn','g',23,['property':("data"),'title':(message(code: 'venda.data.label', default: 'Data'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',25,['property':("tipoPagamento"),'title':(message(code: 'venda.tipoPagamento.label', default: 'Tipo Pagamento'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',27,['property':("entrada"),'title':(message(code: 'venda.entrada.label', default: 'Entrada'))],-1)
printHtmlPart(10)
invokeTag('sortableColumn','g',29,['property':("desconto"),'title':(message(code: 'venda.desconto.label', default: 'Desconto'))],-1)
printHtmlPart(11)
invokeTag('message','g',31,['code':("venda.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(12)
loop:{
int i = 0
for( vendaInstance in (vendaInstanceList) ) {
printHtmlPart(13)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(14)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: vendaInstance, field: "data"))
})
invokeTag('link','g',39,['action':("show"),'id':(vendaInstance.id)],3)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: vendaInstance, field: "tipoPagamento"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: vendaInstance, field: "entrada"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: vendaInstance, field: "desconto"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: vendaInstance, field: "cliente"))
printHtmlPart(17)
i++
}
}
printHtmlPart(18)
invokeTag('paginate','g',56,['total':(vendaInstanceCount ?: 0)],-1)
printHtmlPart(19)
invokeTag('stylesheet','asset',59,['src':("tabelas.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',60,['src':("titulos.css")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',61,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975044L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
