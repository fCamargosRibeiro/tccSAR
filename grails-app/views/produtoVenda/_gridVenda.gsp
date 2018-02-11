<%@ page import="br.com.projetosar.entidades.ProdutoVenda" %>
<script type="text/javascript">
    var childCount = ${vendaInstance?.produtoVenda?.size()} + 0;
    $(function(){
        $("#produtoVendaList").val(childCount);
    });
    $("#produtoVendaList").val(childCount);
    function addProdutoVenda(){
      var clone = $("#produtoVenda_clone").clone()
      var htmlId = 'produtoVenda['+childCount+'].';
      var produtoInput = clone.find("input[id$=quantidade]");
      clone.find("input[id$=id]")
              .attr('id',htmlId + 'id')
              .attr('name',htmlId + 'id');
      clone.find("input[id$=deleted]")
              .attr('id',htmlId + 'deleted')
              .attr('name',htmlId + 'deleted');
      clone.find("input[id$=new]")
              .attr('id',htmlId + 'new')
              .attr('name',htmlId + 'new')
              .attr('value', 'true');
      clone.find("select[id$='produto']")
              .attr('id',htmlId + 'produto')
              .attr('name',htmlId + 'produto.id');
      produtoInput.attr('id',htmlId + 'quantidade')
              .attr('name',htmlId + 'quantidade');
      clone.find("input[id$=precoUnitario]")
              .attr('id',htmlId + 'precoUnitario')
              .attr('name',htmlId + 'precoUnitario');
      clone.find("span[id^=deletaProduto]")
              .attr('id','deletaProduto['+childCount+']');
      clone.attr('id', 'produtoVenda'+childCount);
      $("#childList").append(clone);
      clone.show();
      produtoInput.focus();
      childCount++;
      $("#produtoVendaList").val(childCount);
    }
    
    function calculaTotalVenda(){
        var res = 0;
        var desconto = $("input[name='desconto']").val();
        if(childCount >= 0){
            for(var i = 0; i < childCount; i++){
                if($("input[name='produtoVenda\["+i+"\].quantidade']").val()){
                    res += $("input[name='produtoVenda\["+i+"\].quantidade']").val() * $("input[name='produtoVenda\["+i+"\].precoUnitario']").val().replace(',','.');
                }
            }
            $("#totalVenda").text("Total Venda: "+res);
            
                if(desconto > 0){
                res = res - (res * desconto)/100;
            }
            $("#totalVendaDesconto").text("Total Venda com desconto: "+res);
        }
    }
    $("input[name='desconto']").change(function (){
        calculaTotalVenda();
    });
    function deletarProduto(obj){
        var objId = obj.id.split('[')[1].split(']')[0];
        var div = $("#childList").find("#produtoVenda"+objId);
        div.remove();
        calculaTotalVenda();
    }
</script>
<g:hiddenField id='produtoVendaList' name='produtoVendaList'/>
<div id="childList">
    <g:each var="produto" in="${vendaInstance?.produtoVenda}" status="i">
            <g:render template='/produtoVenda/itemProdutoVenda' model="['produtoVenda':produto,'i':i,'hidden':false]"/>
    </g:each>
</div>
<input type="button" value="Adicionar Produto" onclick="addProdutoVenda();" />
