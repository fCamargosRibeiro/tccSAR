package br.com.projetosar.entidades

class EnderecoRevendedor {
    String tipo
    String logradouro
    String bairro
    String lote
    String cidade
    String estado
    String cep
    static belongsTo = [revendedor: Revendedor]
    static constraints = {
        cep()
        tipo()
        logradouro()
        bairro()
        cidade(nullable:false, blank:false)
        estado(nullable:false, blank:false) 
        lote()
    }

    String toString() {
        return "$logradouro [$cep]"
    }
}
