import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SARindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('img','g',16,['dir':("images"),'file':("registrarPag1.PNG"),'class':(" botaoMaior col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',17,['roles':("ROLE_REVENDEDOR")],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('img','g',22,['dir':("images"),'file':("enviaremail.PNG"),'class':(" botaoMaior col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',22,['roles':("ROLE_REVENDEDOR")],2)
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(9)
invokeTag('img','g',23,['dir':("images"),'file':("emitirRelatorio.PNG"),'class':(" botaoMaior col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',23,['roles':("ROLE_REVENDEDOR")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('img','g',24,['dir':("images"),'file':("novoCliente.png"),'class':("imagensRedondas  img-responsive col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',24,['roles':("ROLE_REVENDEDOR")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(13)
invokeTag('img','g',28,['dir':("images"),'file':("novaVenda.png"),'class':("imagensRedondas col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',28,['roles':("ROLE_REVENDEDOR")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(14)
invokeTag('img','g',29,['dir':("images"),'file':("novoProduto.png"),'class':("imagensRedondas col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',29,['roles':("ROLE_REVENDEDOR")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(15)
invokeTag('img','g',30,['dir':("images"),'file':("novoRevendedor.png"),'class':("imagensRedondas col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',30,['roles':("ROLE_GERENTE")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('img','g',31,['dir':("images"),'file':("Nova Campanha.png"),'class':("imagensRedondas col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',31,['roles':("ROLE_GERENTE")],2)
printHtmlPart(12)
createTagBody(2, {->
printHtmlPart(17)
invokeTag('img','g',32,['dir':("images"),'file':("NovoGRupo.png"),'class':("imagensRedondas col-lg-6")],-1)
printHtmlPart(6)
})
invokeTag('ifAnyGranted','sec',32,['roles':("ROLE_GERENTE")],2)
printHtmlPart(18)
expressionOut.print(applicationContext.springSecurityService.currentUser)
printHtmlPart(19)
invokeTag('stylesheet','asset',44,['src':("botaom.css")],-1)
printHtmlPart(7)
invokeTag('stylesheet','asset',44,['src':("conteudos.css")],-1)
printHtmlPart(3)
})
invokeTag('captureBody','sitemesh',44,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975074L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
