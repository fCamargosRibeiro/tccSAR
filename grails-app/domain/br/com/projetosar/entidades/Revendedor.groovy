package br.com.projetosar.entidades

class Revendedor {
    String nome
    String cpf
    Integer identidade
    String orgExpeditor
    String email
    Boolean ativo
    static hasMany = [endereco: EnderecoRevendedor, telefone: TelefoneRevendedor]
    
    static constraints = {
        nome(nullable:false, blank:false)
        cpf(cpf:true)
        identidade(nullable: false, blank: false, min: 0)
        orgExpeditor(nullable: false, blank: false)
        email(email:true)
        ativo(nullable: true)
        endereco(nullable: true)
        telefone(nullable: true)
    }

    String toString() {
        return "$nome [$cpf]"
    }
}
