package br.com.projetosar.entidades
import org.apache.commons.collections.list.LazyList;
import org.apache.commons.collections.FactoryUtils;

class Venda {
    Date data
    Cliente cliente
    Double entrada
    Double desconto
    String tipoPagamento
    
    static hasMany = [produtoVenda: ProdutoVenda]
    
    static constraints = {
        data(nullable: true)
        tipoPagamento inList:['À Vista','À Prazo','PagSeguro']
        entrada (nullable: true, min: 0d)
        desconto (nullable: true, min: 0d)
        cliente ()
        produtoVenda ()
    }
    
    def getProdutoVendaList() {
        return LazyList.decorate(
              produtoVenda,
              FactoryUtils.instantiateFactory(ProdutoVenda.class))
    }

    def getTotalVenda(){
        def totalVenda = 0
        for(produto in this.produtoVenda){
            totalVenda += (produto.precoUnitario)*(produto.quantidade)
        }
        if(this.desconto > 0){
            totalVenda = totalVenda - ((totalVenda * this.desconto)/100)
        }
        return totalVenda
    }
    
    String toString() {
        return "[$data] $id"
    }
}
