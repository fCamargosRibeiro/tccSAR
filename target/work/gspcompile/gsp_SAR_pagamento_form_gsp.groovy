import br.com.projetosar.entidades.Pagamento
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_pagamento_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/pagamento/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',9,['code':("pagamento.data.label"),'default':("Data")],-1)
printHtmlPart(1)
invokeTag('datePicker','g',12,['name':("data"),'precision':("day"),'value':(pagamentoInstance?.data),'disabled':("disabled")],-1)
printHtmlPart(2)
invokeTag('message','g',18,['code':("pagamento.valor.label"),'default':("Valor")],-1)
printHtmlPart(1)
invokeTag('field','g',21,['name':("valor"),'value':(fieldValue(bean: pagamentoInstance, field: 'valor')),'required':(""),'type':("number"),'step':("0.01")],-1)
printHtmlPart(3)
invokeTag('message','g',27,['code':("pagamento.observacao.label"),'default':("Observacao")],-1)
printHtmlPart(4)
invokeTag('textField','g',30,['name':("observacao"),'value':(pagamentoInstance?.observacao)],-1)
printHtmlPart(5)
invokeTag('message','g',36,['code':("pagamento.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(1)
invokeTag('select','g',39,['id':("cliente"),'name':("cliente.id"),'from':(br.com.projetosar.entidades.Cliente.list()),'optionKey':("id"),'required':(""),'value':(pagamentoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(6)
invokeTag('stylesheet','asset',1,['src':("inputs.css")],-1)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909974979L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
