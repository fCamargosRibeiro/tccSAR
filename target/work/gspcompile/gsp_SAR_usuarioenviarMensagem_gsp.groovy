import br.com.projetosar.entidades.Usuario
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_usuarioenviarMensagem_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usuario/enviarMensagem.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',6,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
if(true && (flash.message)) {
printHtmlPart(5)
expressionOut.print(flash.message)
printHtmlPart(6)
}
printHtmlPart(7)
createTagBody(2, {->
printHtmlPart(8)
invokeTag('message','g',19,['code':("email.destinatario.label"),'default':("Destinatário")],-1)
printHtmlPart(9)
createClosureForHtmlPart(10, 3)
invokeTag('ifAnyGranted','sec',22,['roles':("ROLE_GERENTE")],3)
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('ifAnyGranted','sec',23,['roles':("ROLE_GERENTE")],3)
printHtmlPart(11)
createClosureForHtmlPart(13, 3)
invokeTag('ifAnyGranted','sec',24,['roles':("ROLE_REVENDEDOR")],3)
printHtmlPart(14)
createTagBody(3, {->
printHtmlPart(15)
invokeTag('message','g',29,['code':("email.revendedor.label"),'default':("Revendedor")],-1)
printHtmlPart(16)
invokeTag('select','g',32,['id':("revendedor"),'name':("revendedor.id"),'from':(br.com.projetosar.entidades.Revendedor.list()),'optionKey':("id"),'required':(""),'value':(""),'class':("form-control"),'disabled':("disabled")],-1)
printHtmlPart(17)
})
invokeTag('ifAnyGranted','sec',33,['roles':("ROLE_GERENTE")],3)
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(19)
invokeTag('message','g',36,['code':("email.grupo.label"),'default':("Grupo")],-1)
printHtmlPart(16)
invokeTag('select','g',39,['id':("grupo"),'name':("grupo.id"),'from':(br.com.projetosar.entidades.GrupoRevendedor.list()),'optionKey':("id"),'required':(""),'value':(""),'class':("form-control"),'disabled':("disabled")],-1)
printHtmlPart(17)
})
invokeTag('ifAnyGranted','sec',40,['roles':("ROLE_GERENTE")],3)
printHtmlPart(18)
createTagBody(3, {->
printHtmlPart(20)
invokeTag('message','g',43,['code':("email.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(16)
invokeTag('select','g',46,['id':("cliente"),'name':("cliente.id"),'from':(br.com.projetosar.entidades.Cliente.list()),'optionKey':("id"),'required':(""),'value':(""),'class':("form-control")],-1)
printHtmlPart(17)
})
invokeTag('ifAnyGranted','sec',47,['roles':("ROLE_REVENDEDOR")],3)
printHtmlPart(21)
invokeTag('message','g',50,['code':("email.titulo.label"),'default':("Título")],-1)
printHtmlPart(16)
invokeTag('textField','g',53,['class':("form-control"),'name':("titulo"),'required':(""),'value':("")],-1)
printHtmlPart(22)
invokeTag('message','g',57,['code':("email.texto.label"),'default':("Mensagem")],-1)
printHtmlPart(23)
invokeTag('textArea','g',61,['class':("form-control"),'name':("texto"),'required':(""),'value':("")],-1)
printHtmlPart(24)
invokeTag('submitButton','g',65,['name':("create"),'class':("btn btn-warning"),'value':("Enviar")],-1)
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',66,['class':("btn btn-default"),'action':("/")],3)
printHtmlPart(27)
})
invokeTag('form','g',68,['action':("enviarEmail")],2)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',99,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975095L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
