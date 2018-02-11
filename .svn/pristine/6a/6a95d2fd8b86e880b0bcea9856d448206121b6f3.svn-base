package br.com.projetosar.entidades

class Telefone {
    String operadora
    String ddd
    String numero
    static belongsTo = [cliente: Cliente]
    static constraints = {
        ddd blank: false, nullable: false
        numero blank: false, nullable: false
        operadora ()
    }

    String toString() {
        return "($ddd)$numero"
    }
}
