package br.com.projetosar.entidades

class Cliente {
    String nome
    String cpf
    String email
    Financeiro financeiro
    static hasMany = [endereco: Endereco, telefone: Telefone]
    
    static constraints = {
        nome(nullable:false, blank:false)
        cpf(cpf:true)
        email(blank: false, email: true)
        endereco(nullable: true)
        telefone(nullable: true)
        financeiro(nullable: true, display: false)
    }

    String toString() {
        return "$nome [$cpf]"
    }
}
