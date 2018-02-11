import br.com.projetosar.entidades.Pagamento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_pagamentoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pagamento/index.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'pagamento.label', default: 'Pagamento'))],-1)
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
invokeTag('sortableColumn','g',22,['property':("data"),'title':(message(code: 'pagamento.data.label', default: 'Data'))],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',24,['property':("valor"),'title':(message(code: 'pagamento.valor.label', default: 'Valor'))],-1)
printHtmlPart(9)
invokeTag('sortableColumn','g',26,['property':("observacao"),'title':(message(code: 'pagamento.observacao.label', default: 'Observacao'))],-1)
printHtmlPart(10)
invokeTag('message','g',28,['code':("pagamento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(11)
loop:{
int i = 0
for( pagamentoInstance in (pagamentoInstanceList) ) {
printHtmlPart(12)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(13)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: pagamentoInstance, field: "data"))
})
invokeTag('link','g',36,['action':("show"),'id':(pagamentoInstance.id)],3)
printHtmlPart(14)
expressionOut.print(fieldValue(bean: pagamentoInstance, field: "valor"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: pagamentoInstance, field: "observacao"))
printHtmlPart(15)
expressionOut.print(fieldValue(bean: pagamentoInstance, field: "cliente"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
invokeTag('paginate','g',51,['total':(pagamentoInstanceCount ?: 0)],-1)
printHtmlPart(18)
invokeTag('stylesheet','asset',54,['src':("tabelas.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',55,['src':("titulos.css")],-1)
printHtmlPart(2)
invokeTag('stylesheet','asset',56,['src':("inputs.css")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909974985L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
