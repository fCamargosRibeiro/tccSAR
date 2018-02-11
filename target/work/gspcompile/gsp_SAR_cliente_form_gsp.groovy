import br.com.projetosar.entidades.Cliente
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_cliente_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/cliente/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',9,['code':("cliente.nome.label"),'default':("Nome")],-1)
printHtmlPart(1)
invokeTag('textField','g',12,['name':("nome"),'required':(""),'value':(clienteInstance?.nome),'pattern':("[a-zA-Z \u00C0-\u024F]+")],-1)
printHtmlPart(2)
invokeTag('message','g',18,['code':("cliente.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(3)
invokeTag('textField','g',21,['name':("cpf"),'required':(""),'value':(clienteInstance?.cpf)],-1)
printHtmlPart(4)
invokeTag('message','g',27,['code':("cliente.email.label"),'default':("Email")],-1)
printHtmlPart(1)
invokeTag('field','g',30,['type':("email"),'name':("email"),'required':(""),'value':(clienteInstance?.email)],-1)
printHtmlPart(5)
invokeTag('message','g',36,['code':("cliente.endereco.label"),'default':("Endereco")],-1)
printHtmlPart(6)
for( e in (clienteInstance?.endereco) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',42,['controller':("endereco"),'action':("show"),'id':(e.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'endereco.label', default: 'Endereco')]))
})
invokeTag('link','g',45,['controller':("endereco"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(10)
invokeTag('message','g',54,['code':("cliente.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(6)
for( t in (clienteInstance?.telefone) ) {
printHtmlPart(7)
createTagBody(2, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',60,['controller':("telefone"),'action':("show"),'id':(t.id)],2)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'telefone.label', default: 'Telefone')]))
})
invokeTag('link','g',63,['controller':("telefone"),'action':("create"),'params':(['cliente.id': clienteInstance?.id])],1)
printHtmlPart(11)
invokeTag('javascript','asset',69,['src':("jquery.maskedinput.js")],-1)
printHtmlPart(12)
invokeTag('stylesheet','asset',70,['src':("inputs.css")],-1)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975154L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
