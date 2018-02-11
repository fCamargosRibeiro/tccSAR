import br.com.projetosar.entidades.Pagamento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_pagamentoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pagamento/show.gsp" }
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
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'pagamento.label', default: 'Pagamento'))],-1)
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
if(true && (pagamentoInstance?.data)) {
printHtmlPart(10)
invokeTag('message','g',29,['code':("pagamento.data.label"),'default':("Data")],-1)
printHtmlPart(11)
invokeTag('formatDate','g',31,['date':(pagamentoInstance?.data)],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (pagamentoInstance?.valor)) {
printHtmlPart(10)
invokeTag('message','g',41,['code':("pagamento.valor.label"),'default':("Valor")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',43,['bean':(pagamentoInstance),'field':("valor")],-1)
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (pagamentoInstance?.observacao)) {
printHtmlPart(10)
invokeTag('message','g',53,['code':("pagamento.observacao.label"),'default':("Observacao")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',55,['bean':(pagamentoInstance),'field':("observacao")],-1)
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (pagamentoInstance?.cliente)) {
printHtmlPart(10)
invokeTag('message','g',65,['code':("pagamento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
expressionOut.print(pagamentoInstance?.cliente?.encodeAsHTML())
})
invokeTag('link','g',69,['controller':("cliente"),'action':("show"),'id':(pagamentoInstance?.cliente?.id)],3)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('stylesheet','asset',83,['src':("formularios.css")],-1)
printHtmlPart(0)
invokeTag('stylesheet','asset',84,['src':("titulos.css")],-1)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',85,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909974981L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
