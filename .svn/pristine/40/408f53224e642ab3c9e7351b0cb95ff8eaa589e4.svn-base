package br.com.projetosar.entidades

class Pagamento {
    
    Double valor
    Date data
    String observacao
    static belongsTo = [cliente : Cliente]
    
    static constraints = {
        data(nullable: true)
        valor(nullable: false, blank: false)
        observacao(nullable: true)
    }
}
