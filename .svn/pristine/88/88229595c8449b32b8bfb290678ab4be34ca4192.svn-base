import br.com.projetosar.entidades.Relatorio
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_relatoriolist_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/relatorio/list.gsp" }
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
invokeTag('javascript','asset',10,['src':("lightbox-form.js")],-1)
printHtmlPart(2)
invokeTag('set','g',11,['var':("entityName"),'value':(message(code: 'relatorio.label', default: 'Relatorio'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',12,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(0)
})
invokeTag('captureHead','sitemesh',13,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(3)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.create.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("btn btn-default pull-right h2"),'action':("create")],2)
printHtmlPart(4)
createTagBody(2, {->
invokeTag('message','g',17,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',17,['class':("btn btn-default pull-right h2"),'action':("index")],2)
printHtmlPart(5)
if(true && (flash.message)) {
printHtmlPart(6)
expressionOut.print(flash.message)
printHtmlPart(7)
}
printHtmlPart(8)
invokeTag('sortableColumn','g',28,['property':("nome"),'title':("Relatorios")],-1)
printHtmlPart(9)
loop:{
int i = 0
for( relatorioInstance in (relatorioInstanceList) ) {
printHtmlPart(10)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(11)
createTagBody(3, {->
expressionOut.print(relatorioInstance.nome)
})
invokeTag('remoteLink','g',38,['controller':("relatorio"),'action':("verParams"),'id':(relatorioInstance.id),'update':("resultado"),'onComplete':("""openbox
                              ('${relatorioInstance.nome}',1);""")],3)
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
expressionOut.print(resource(dir: 'images', file: 'btn_close.png'))
printHtmlPart(14)
invokeTag('stylesheet','asset',54,['src':("formularios.css")],-1)
printHtmlPart(0)
invokeTag('stylesheet','asset',55,['src':("titulos.css")],-1)
printHtmlPart(0)
})
invokeTag('captureBody','sitemesh',56,[:],1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975272L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
