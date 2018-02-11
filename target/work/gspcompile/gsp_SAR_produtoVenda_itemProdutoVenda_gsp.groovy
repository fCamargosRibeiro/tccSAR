import br.com.projetosar.entidades.ProdutoVenda
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_SAR_produtoVenda_itemProdutoVenda_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/produtoVenda/_itemProdutoVenda.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(i)
printHtmlPart(1)
if(true && (hidden)) {
printHtmlPart(2)
}
printHtmlPart(3)
invokeTag('hiddenField','g',3,['name':("produtoVenda[${i}].id"),'value':(produtoVenda?.id)],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',4,['name':("produtoVenda[${i}].deleted"),'value':("false")],-1)
printHtmlPart(3)
invokeTag('hiddenField','g',5,['name':("produtoVenda[${i}].new"),'value':(produtoVenda?.id == null?'true':'false')],-1)
printHtmlPart(4)
expressionOut.print(i)
printHtmlPart(5)
invokeTag('select','g',8,['id':("produtoVenda[${i}].produto"),'name':("produtoVenda[${i}].produto.id"),'from':(br.com.projetosar.entidades.Produto.list()),'optionKey':("id"),'value':(produtoVenda?.produto?.descricao),'noSelection':(['':'Produtos...']),'class':("form-control"),'onchange':("var idElem = this.parentNode.id;jQuery.ajax({type:'POST',data:'produto.id=' + this.value, url:'/SAR/produto/searchPreco',success:function(data,textStatus){var obj = JSON.parse(data);var elem = document.getElementById('produtoVenda\\['+idElem.slice(-1)+'\\].precoUnitario');elem.value= obj.preco;var elemQ =document.getElementById('produtoVenda\\['+idElem.slice(-1)+'\\].quantidade');elemQ.max=obj.estoque;},error:function(XMLHttpRequest,textStatus,errorThrown){}});")],-1)
printHtmlPart(6)
expressionOut.print(i)
printHtmlPart(7)
invokeTag('field','g',10,['type':("number"),'class':("form-control"),'id':("produtoVenda[${i}].quantidade"),'name':("produtoVenda[${i}].quantidade"),'value':(fieldValue(bean: produtoVenda, field: 'quantidade')),'onchange':("calculaTotalVenda();")],-1)
printHtmlPart(6)
expressionOut.print(i)
printHtmlPart(8)
expressionOut.print(i)
printHtmlPart(9)
expressionOut.print(i)
printHtmlPart(10)
expressionOut.print(fieldValue(bean: produtoVenda, field: 'precoUnitario'))
printHtmlPart(11)
expressionOut.print(i)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479909974834L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
