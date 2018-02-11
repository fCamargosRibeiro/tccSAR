package br.com.projetosar.entidades

class Relatorio {

    static mapping = {
        table schema:"public"
        comando type: "text"
        sort 'nome'
    }

    String nome
    String jrxml
    String comando
    String grupo
    String permissoes

    static constraints = {
        nome()
        jrxml(nullable: true)
        comando(widget: 'textarea')
        grupo(nullable: true)
        permissoes(widget: 'textarea', nullable:true)
    }
}
