import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SARsobre_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/sobre.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',12,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('img','g',23,['dir':("images"),'file':("oficialLogoSAR.png"),'class':("img img-circle")],-1)
printHtmlPart(6)
invokeTag('img','g',33,['dir':("images"),'file':("controleAtividades.jpg"),'class':("img img-circle")],-1)
printHtmlPart(7)
invokeTag('img','g',43,['dir':("images"),'file':("gerencieGrupos.jpg"),'class':("img img-circle")],-1)
printHtmlPart(8)
invokeTag('img','g',50,['dir':("images"),'file':("modeloNegocio.jpg"),'class':("img img-circle")],-1)
printHtmlPart(9)
invokeTag('stylesheet','asset',56,['src':("about.css")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',57,[:],1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975305L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
