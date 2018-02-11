import br.com.projetosar.entidades.Revendedor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_revendedor_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/revendedor/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',9,['code':("revendedor.nome.label"),'default':("Nome")],-1)
printHtmlPart(1)
invokeTag('textField','g',12,['name':("nome"),'required':(""),'value':(revendedorInstance?.nome),'pattern':("[a-zA-Z \u00C0-\u024F]+")],-1)
printHtmlPart(2)
invokeTag('message','g',18,['code':("revendedor.cpf.label"),'default':("Cpf")],-1)
printHtmlPart(3)
invokeTag('textField','g',21,['name':("cpf"),'required':(""),'value':(revendedorInstance?.cpf)],-1)
printHtmlPart(4)
invokeTag('message','g',27,['code':("revendedor.identidade.label"),'default':("Identidade")],-1)
printHtmlPart(1)
invokeTag('field','g',30,['name':("identidade"),'type':("number"),'min':("0"),'value':(revendedorInstance.identidade),'required':("")],-1)
printHtmlPart(5)
invokeTag('message','g',36,['code':("revendedor.orgExpeditor.label"),'default':("Org Expeditor")],-1)
printHtmlPart(1)
invokeTag('textField','g',39,['name':("orgExpeditor"),'required':(""),'value':(revendedorInstance?.orgExpeditor),'pattern':("[a-zA-Z \u00C0-\u024F]+")],-1)
printHtmlPart(6)
invokeTag('message','g',45,['code':("revendedor.email.label"),'default':("Email")],-1)
printHtmlPart(3)
invokeTag('field','g',48,['type':("email"),'name':("email"),'required':(""),'value':(revendedorInstance?.email)],-1)
printHtmlPart(7)
invokeTag('message','g',54,['code':("revendedor.ativo.label"),'default':("Ativo")],-1)
printHtmlPart(3)
invokeTag('checkBox','g',57,['name':("ativo"),'value':(revendedorInstance?.ativo)],-1)
printHtmlPart(8)
invokeTag('message','g',63,['code':("revendedor.endereco.label"),'default':("Endereco")],-1)
printHtmlPart(9)
for( e in (revendedorInstance?.endereco) ) {
printHtmlPart(10)
createTagBody(2, {->
expressionOut.print(e?.encodeAsHTML())
})
invokeTag('link','g',69,['controller':("enderecoRevendedor"),'action':("show"),'id':(e.id)],2)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'enderecoRevendedor.label', default: 'EnderecoRevendedor')]))
})
invokeTag('link','g',72,['controller':("enderecoRevendedor"),'action':("create"),'params':(['revendedor.id': revendedorInstance?.id])],1)
printHtmlPart(13)
invokeTag('message','g',81,['code':("revendedor.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(9)
for( t in (revendedorInstance?.telefone) ) {
printHtmlPart(10)
createTagBody(2, {->
expressionOut.print(t?.encodeAsHTML())
})
invokeTag('link','g',87,['controller':("telefoneRevendedor"),'action':("show"),'id':(t.id)],2)
printHtmlPart(11)
}
printHtmlPart(12)
createTagBody(1, {->
expressionOut.print(message(code: 'default.add.label', args: [message(code: 'telefoneRevendedor.label', default: 'TelefoneRevendedor')]))
})
invokeTag('link','g',90,['controller':("telefoneRevendedor"),'action':("create"),'params':(['revendedor.id': revendedorInstance?.id])],1)
printHtmlPart(14)
invokeTag('javascript','asset',96,['src':("jquery.maskedinput.js")],-1)
printHtmlPart(15)
invokeTag('stylesheet','asset',97,['src':("inputs.css")],-1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975184L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
