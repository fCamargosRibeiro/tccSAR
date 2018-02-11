<%@ page import="br.com.projetosar.entidades.ProdutoVenda" %>
<div id="produtoVenda${i}" class="produto-div" <g:if test="${hidden}">style="display:none;"</g:if>
    <g:hiddenField name='produtoVenda[${i}].id' value='${produtoVenda?.id}'/>
    <g:hiddenField name='produtoVenda[${i}].deleted' value='false'/>
    <g:hiddenField name='produtoVenda[${i}].new' value="${produtoVenda?.id == null?'true':'false'}"/>
    
    <label for="produtoVenda[${i}].produto" >Produto:</label>
        <g:select id="produtoVenda[${i}].produto" name="produtoVenda[${i}].produto.id" from="${br.com.projetosar.entidades.Produto.list()}" optionKey="id" value="${produtoVenda?.produto?.descricao}" noSelection="${['':'Produtos...']}" class="form-control" onchange="var idElem = this.parentNode.id;jQuery.ajax({type:'POST',data:'produto.id=' + this.value, url:'/SAR/produto/searchPreco',success:function(data,textStatus){var obj = JSON.parse(data);var elem = document.getElementById('produtoVenda\\['+idElem.slice(-1)+'\\].precoUnitario');elem.value= obj.preco;var elemQ =document.getElementById('produtoVenda\\['+idElem.slice(-1)+'\\].quantidade');elemQ.max=obj.estoque;},error:function(XMLHttpRequest,textStatus,errorThrown){}});"/>
    <label for="produtoVenda[${i}].quantidade">Quantidade:</label>
        <g:field type="number" class="form-control" id="produtoVenda[${i}].quantidade" name="produtoVenda[${i}].quantidade" value="${fieldValue(bean: produtoVenda, field: 'quantidade')}" onchange="calculaTotalVenda();"/>
    <label for="produtoVenda[${i}].precoUnitario">Preço Unitário:</label>
        <input type="number" class="form-control" id="produtoVenda[${i}].precoUnitario" name="produtoVenda[${i}].precoUnitario" value="${fieldValue(bean: produtoVenda, field: 'precoUnitario')}" readonly="readonly"/>
        
    <a><span id="deletaProduto[${i}]" class="glyphicon glyphicon-trash" onclick="deletarProduto(this);"></span></a>
</div>