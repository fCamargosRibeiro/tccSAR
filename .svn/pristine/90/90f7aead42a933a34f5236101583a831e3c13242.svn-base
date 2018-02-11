import br.com.projetosar.entidades.Venda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_venda_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/venda/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',9,['code':("venda.data.label"),'default':("Data:")],-1)
printHtmlPart(1)
invokeTag('datePicker','g',12,['name':("data"),'precision':("day"),'value':(vendaInstance?.data),'disabled':("disabled")],-1)
printHtmlPart(2)
invokeTag('message','g',17,['code':("venda.tipoPagamento.label"),'default':("Tipo Pagamento")],-1)
printHtmlPart(3)
invokeTag('select','g',20,['name':("tipoPagamento"),'from':(vendaInstance.constraints.tipoPagamento.inList),'required':(""),'value':(vendaInstance?.tipoPagamento),'valueMessagePrefix':("venda.tipoPagamento")],-1)
printHtmlPart(4)
invokeTag('message','g',26,['code':("venda.entrada.label"),'default':("Entrada:")],-1)
printHtmlPart(5)
invokeTag('field','g',29,['name':("entrada"),'value':(fieldValue(bean: vendaInstance, field: 'entrada')),'type':("number")],-1)
printHtmlPart(6)
invokeTag('message','g',35,['code':("venda.desconto.label"),'default':("Porcentagem de desconto:")],-1)
printHtmlPart(5)
invokeTag('field','g',38,['name':("desconto"),'value':(fieldValue(bean: vendaInstance, field: 'desconto'))],-1)
printHtmlPart(7)
invokeTag('message','g',44,['code':("venda.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(3)
invokeTag('select','g',47,['id':("cliente"),'name':("cliente.id"),'from':(br.com.projetosar.entidades.Cliente.list()),'optionKey':("id"),'required':(""),'value':(vendaInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(8)
invokeTag('render','g',53,['template':("/produtoVenda/gridVenda"),'model':(['vendaInstance':vendaInstance])],-1)
printHtmlPart(9)
invokeTag('stylesheet','asset',57,['src':("inputs.css")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975042L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
