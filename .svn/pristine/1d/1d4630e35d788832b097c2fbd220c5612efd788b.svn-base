import br.com.projetosar.entidades.ProdutoVenda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_produtoVenda_gridVenda_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoVenda/_gridVenda.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(vendaInstance?.produtoVenda?.size())
printHtmlPart(1)
invokeTag('hiddenField','g',67,['id':("produtoVendaList"),'name':("produtoVendaList")],-1)
printHtmlPart(2)
loop:{
int i = 0
for( produto in (vendaInstance?.produtoVenda) ) {
printHtmlPart(3)
invokeTag('render','g',70,['template':("/produtoVenda/itemProdutoVenda"),'model':(['produtoVenda':produto,'i':i,'hidden':false])],-1)
printHtmlPart(4)
i++
}
}
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909974832L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
