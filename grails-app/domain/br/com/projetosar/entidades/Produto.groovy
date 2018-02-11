package br.com.projetosar.entidades

class Produto {
    String codigo
    String descricao
    String linha
    Double precoCusto
    Double precoVenda
    int estoque
    static constraints = {
        codigo unique: true, blank: false, nullable: false
        descricao blank: false, nullable: false
        linha blank: false, nullable: false
        precoCusto (blank: false, min: 0d, nullable: false, validator:{precoCusto, obj -> return precoCusto < obj.precoVenda})
        precoVenda blank: false, min: 0d
        estoque blank: true, nullable: true, min: 0
    }

    String toString() {
        return "[$codigo] $descricao"
    }
}
