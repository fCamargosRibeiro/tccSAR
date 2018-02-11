import br.com.projetosar.entidades.EnderecoRevendedor
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_enderecoRevendedor_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/enderecoRevendedor/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('message','g',9,['code':("enderecoRevendedor.cep.label"),'default':("Cep")],-1)
printHtmlPart(1)
invokeTag('textField','g',12,['name':("cep"),'required':(""),'value':(enderecoInstance?.cep),'type':("text"),'size':("10"),'maxlength':("9"),'onblur':("pesquisacep(this.value);")],-1)
printHtmlPart(2)
invokeTag('message','g',18,['code':("enderecoRevendedor.tipo.label"),'default':("Tipo")],-1)
printHtmlPart(1)
invokeTag('textField','g',21,['name':("tipo"),'required':(""),'value':(enderecoRevendedorInstance?.tipo)],-1)
printHtmlPart(3)
invokeTag('message','g',27,['code':("enderecoRevendedor.logradouro.label"),'default':("Logradouro")],-1)
printHtmlPart(1)
invokeTag('textField','g',30,['name':("logradouro"),'required':(""),'value':(enderecoRevendedorInstance?.logradouro)],-1)
printHtmlPart(4)
invokeTag('message','g',36,['code':("enderecoRevendedor.lote.label"),'default':("Lote")],-1)
printHtmlPart(1)
invokeTag('textField','g',39,['name':("lote"),'required':(""),'value':(enderecoRevendedorInstance?.lote)],-1)
printHtmlPart(5)
invokeTag('message','g',45,['code':("enderecoRevendedor.bairro.label"),'default':("Bairro")],-1)
printHtmlPart(1)
invokeTag('textField','g',48,['name':("bairro"),'required':(""),'value':(enderecoRevendedorInstance?.bairro)],-1)
printHtmlPart(6)
invokeTag('message','g',54,['code':("enderecoRevendedor.cidade.label"),'default':("Cidade")],-1)
printHtmlPart(1)
invokeTag('textField','g',57,['name':("cidade"),'required':(""),'value':(enderecoRevendedorInstance?.cidade)],-1)
printHtmlPart(7)
invokeTag('message','g',63,['code':("enderecoRevendedor.estado.label"),'default':("Estado")],-1)
printHtmlPart(1)
invokeTag('textField','g',66,['name':("estado"),'required':(""),'value':(enderecoRevendedorInstance?.estado)],-1)
printHtmlPart(8)
invokeTag('message','g',72,['code':("enderecoRevendedor.revendedor.label"),'default':("Revendedor")],-1)
printHtmlPart(9)
invokeTag('select','g',75,['id':("revendedor"),'name':("revendedor.id"),'from':(br.com.projetosar.entidades.Revendedor.list()),'optionKey':("id"),'required':(""),'value':(enderecoRevendedorInstance?.revendedor?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
invokeTag('stylesheet','asset',79,['src':("inputs.css")],-1)
printHtmlPart(11)
invokeTag('javascript','asset',80,['src':("jquery.maskedinput.js")],-1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909975252L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
