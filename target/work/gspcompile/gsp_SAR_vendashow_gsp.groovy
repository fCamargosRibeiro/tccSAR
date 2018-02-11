import br.com.projetosar.entidades.Venda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_vendashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/venda/show.gsp" }
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
invokeTag('set','g',10,['var':("entityName"),'value':(message(code: 'venda.label', default: 'Venda'))],-1)
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
if(true && (vendaInstance?.data)) {
printHtmlPart(10)
invokeTag('message','g',30,['code':("venda.data.label"),'default':("Data")],-1)
printHtmlPart(11)
invokeTag('formatDate','g',32,['date':(vendaInstance?.data)],-1)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (vendaInstance?.tipoPagamento)) {
printHtmlPart(10)
invokeTag('message','g',42,['code':("venda.tipoPagamento.label"),'default':("Tipo Pagamento")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',44,['bean':(vendaInstance),'field':("tipoPagamento")],-1)
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (vendaInstance?.entrada)) {
printHtmlPart(10)
invokeTag('message','g',54,['code':("venda.entrada.label"),'default':("Entrada")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',56,['bean':(vendaInstance),'field':("entrada")],-1)
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (vendaInstance?.desconto)) {
printHtmlPart(10)
invokeTag('message','g',66,['code':("venda.desconto.label"),'default':("Desconto")],-1)
printHtmlPart(11)
invokeTag('fieldValue','g',68,['bean':(vendaInstance),'field':("desconto")],-1)
printHtmlPart(14)
}
printHtmlPart(13)
if(true && (vendaInstance?.cliente)) {
printHtmlPart(10)
invokeTag('message','g',78,['code':("venda.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(15)
createTagBody(3, {->
printHtmlPart(16)
expressionOut.print(vendaInstance?.cliente?.encodeAsHTML())
})
invokeTag('link','g',82,['controller':("cliente"),'action':("show"),'id':(vendaInstance?.cliente?.id)],3)
printHtmlPart(17)
}
printHtmlPart(13)
if(true && (vendaInstance?.produtoVenda)) {
printHtmlPart(10)
invokeTag('message','g',93,['code':("venda.produtoVenda.label"),'default':("Produto Venda")],-1)
printHtmlPart(18)
for( p in (vendaInstance.produtoVenda) ) {
printHtmlPart(19)
createTagBody(4, {->
expressionOut.print(p?.encodeAsHTML())
})
invokeTag('link','g',96,['controller':("produtoVenda"),'action':("show"),'id':(p.id)],4)
printHtmlPart(20)
}
printHtmlPart(21)
createTagBody(3, {->
printHtmlPart(22)
expressionOut.print(message(code: 'default.add.label',                       args: [message(code: 'produtoVenda.label', 
                      default: 'ProdutoVenda')]))
printHtmlPart(23)
})
invokeTag('link','g',103,['controller':("produtoVenda"),'action':("create"),'params':(['venda.id': vendaInstance.id])],3)
printHtmlPart(17)
}
else {
printHtmlPart(24)
invokeTag('message','g',111,['code':("produtoVenda.label"),'default':("Produto Venda")],-1)
printHtmlPart(25)
createTagBody(3, {->
printHtmlPart(16)
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'produtoVenda.label', 
                  default: 'ProdutoVenda')]))
printHtmlPart(23)
})
invokeTag('link','g',116,['controller':("produtoVenda"),'action':("create"),'params':(['venda.id': vendaInstance.id])],3)
printHtmlPart(26)
}
printHtmlPart(27)
createTagBody(2, {->
printHtmlPart(28)
invokeTag('hiddenField','g',125,['name':("id"),'value':(vendaInstance?.id)],-1)
printHtmlPart(28)
invokeTag('actionSubmit','g',127,['class':("btn btn-danger"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(4)
})
invokeTag('form','g',128,[:],2)
printHtmlPart(29)
invokeTag('stylesheet','asset',133,['src':("formularios.css")],-1)
printHtmlPart(0)
invokeTag('stylesheet','asset',134,['src':("titulos.css")],-1)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',135,[:],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975040L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
