import br.com.projetosar.entidades.Venda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_vendaedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/venda/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',9,['var':("entityName"),'value':(message(code: 'venda.label', default: 'Venda'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',10,['code':("default.edit.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
invokeTag('message','g',13,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(4)
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(7)
createTagBody(3, {->
printHtmlPart(8)
if(true && (error in org.springframework.validation.FieldError)) {
printHtmlPart(9)
expressionOut.print(error.field)
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('message','g',21,['error':(error)],-1)
printHtmlPart(12)
})
invokeTag('eachError','g',22,['bean':(vendaInstance),'var':("error")],3)
printHtmlPart(13)
})
invokeTag('hasErrors','g',24,['bean':(vendaInstance)],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('message','g',31,['code':("default.edit.label"),'args':([entityName])],-1)
printHtmlPart(16)
invokeTag('hiddenField','g',32,['name':("id"),'value':(vendaInstance?.id)],-1)
printHtmlPart(17)
invokeTag('hiddenField','g',33,['name':("version"),'value':(vendaInstance?.version)],-1)
printHtmlPart(18)
invokeTag('render','g',35,['template':("form")],-1)
printHtmlPart(19)
invokeTag('actionSubmit','g',38,['class':("btn btn-success"),'action':("update"),'value':(message(code: 'default.button.update.label', default: 'Update'))],-1)
printHtmlPart(20)
invokeTag('actionSubmit','g',39,['class':("btn btn-default"),'action':("show"),'value':(message(code: 'default.button.cancel.label', default: 'Cancel'))],-1)
printHtmlPart(21)
})
invokeTag('form','g',41,['class':("pad-bg"),'url':([resource:vendaInstance, action:'update']),'method':("POST")],2)
printHtmlPart(22)
invokeTag('stylesheet','asset',46,['src':("formularios.css")],-1)
printHtmlPart(23)
invokeTag('stylesheet','asset',47,['src':("titulos.css")],-1)
printHtmlPart(2)
})
invokeTag('captureBody','sitemesh',48,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975048L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
