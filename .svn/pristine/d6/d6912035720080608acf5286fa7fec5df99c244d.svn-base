import br.com.projetosar.entidades.Endereco
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_endereco_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/endereco/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',8,['code':("endereco.cep.label"),'default':("Cep")],-1)
printHtmlPart(1)
invokeTag('textField','g',11,['name':("cep"),'required':(""),'value':(enderecoInstance?.cep),'type':("text"),'size':("10"),'maxlength':("10"),'onblur':("pesquisacep(this.value);")],-1)
printHtmlPart(2)
invokeTag('message','g',17,['code':("endereco.tipo.label"),'default':("Tipo")],-1)
printHtmlPart(1)
invokeTag('textField','g',20,['name':("tipo"),'required':(""),'value':(enderecoInstance?.tipo)],-1)
printHtmlPart(3)
invokeTag('message','g',26,['code':("endereco.logradouro.label"),'default':("Logradouro")],-1)
printHtmlPart(1)
invokeTag('textField','g',29,['name':("logradouro"),'required':(""),'value':(enderecoInstance?.logradouro)],-1)
printHtmlPart(4)
invokeTag('message','g',35,['code':("endereco.lote.label"),'default':("Lote")],-1)
printHtmlPart(1)
invokeTag('textField','g',38,['name':("lote"),'required':(""),'value':(enderecoInstance?.lote)],-1)
printHtmlPart(5)
invokeTag('message','g',44,['code':("endereco.bairro.label"),'default':("Bairro")],-1)
printHtmlPart(1)
invokeTag('textField','g',47,['name':("bairro"),'required':(""),'value':(enderecoInstance?.bairro)],-1)
printHtmlPart(6)
invokeTag('message','g',53,['code':("endereco.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(1)
invokeTag('textField','g',56,['name':("cidade"),'required':(""),'value':(enderecoInstance?.cidade)],-1)
printHtmlPart(7)
invokeTag('message','g',62,['code':("endereco.estado.label"),'default':("Estado")],-1)
printHtmlPart(1)
invokeTag('textField','g',65,['name':("estado"),'required':(""),'value':(enderecoInstance?.estado)],-1)
printHtmlPart(8)
invokeTag('message','g',71,['code':("endereco.cliente.label"),'default':("Cliente")],-1)
printHtmlPart(9)
invokeTag('select','g',74,['id':("cliente"),'name':("cliente.id"),'from':(br.com.projetosar.entidades.Cliente.list()),'optionKey':("id"),'required':(""),'value':(enderecoInstance?.cliente?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
invokeTag('stylesheet','asset',78,['src':("inputs.css")],-1)
printHtmlPart(11)
invokeTag('javascript','asset',79,['src':("jquery.maskedinput.js")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975223L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
