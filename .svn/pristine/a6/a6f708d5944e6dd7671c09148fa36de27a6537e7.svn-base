package br.com.projetosar.entidades

class TelefoneRevendedor {
    String operadora
    String ddd
    String numero
    static belongsTo = [revendedor: Revendedor]
    static constraints = {
        ddd blank: false, nullable: false
        numero blank: false, nullable: false
        operadora ()
    }
}
