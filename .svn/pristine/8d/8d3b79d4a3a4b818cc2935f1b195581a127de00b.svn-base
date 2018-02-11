import br.com.projetosar.entidades.Venda
import br.com.projetosar.entidades.ProdutoVenda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_vendacreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/venda/create.gsp" }
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
invokeTag('message','g',11,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',14,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(8)
createTagBody(3, {->
printHtmlPart(9)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(10)
expressionOut.print(error.field)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('message','g',21,['error':(error)],-1)
printHtmlPart(13)
})
invokeTag('eachError','g',22,['bean':(vendaInstance),'var':("error")],3)
printHtmlPart(14)
})
invokeTag('hasErrors','g',24,['bean':(vendaInstance)],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('message','g',39,['code':("default.create.label"),'args':([entityName])],-1)
printHtmlPart(17)
invokeTag('render','g',41,['template':("form")],-1)
printHtmlPart(18)
invokeTag('submitButton','g',44,['name':("create"),'class':("btn btn-default"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',45,['class':("btn btn-default"),'action':("index")],3)
printHtmlPart(21)
})
invokeTag('form','g',47,['action':("save"),'class':("pad-bg")],2)
printHtmlPart(22)
invokeTag('render','g',49,['template':("/produtoVenda/itemProdutoVenda"),'model':(['produtoVenda':null,'i':'_clone','hidden':true])],-1)
printHtmlPart(23)
invokeTag('stylesheet','asset',54,['src':("formularios.css")],-1)
printHtmlPart(24)
invokeTag('stylesheet','asset',55,['src':("titulos.css")],-1)
printHtmlPart(24)
invokeTag('stylesheet','asset',56,['src':("vendaBg.css")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975046L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
