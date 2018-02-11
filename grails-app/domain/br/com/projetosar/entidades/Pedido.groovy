package br.com.projetosar.entidades

class Pedido {
    Date dataPedido
    Revendedor revendedor
    static hasMany = [produto: Produto]
    static constraints = {
      dataPedido(blank:false)
      produto(nullable: true)
      revendedor(nullable: true) 
    }
    
    String toString() {
        return "$dataPedido [$revendedor]"
    }
}
