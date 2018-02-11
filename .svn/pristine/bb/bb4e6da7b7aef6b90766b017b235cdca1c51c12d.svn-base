package br.com.projetosar.entidades

class ProdutoVenda {
    
    Produto produto
    int quantidade
    Double precoUnitario
    
    static belongsTo = [venda: Venda]
    static constraints = {
        produto ()
        quantidade min:1, blank: false, nullable: false
        precoUnitario blank: false, nullable: false, min: 0d
    }

    String toString() {
        return "$produto ($quantidade) [${quantidade * precoUnitario}]"
    }
}
