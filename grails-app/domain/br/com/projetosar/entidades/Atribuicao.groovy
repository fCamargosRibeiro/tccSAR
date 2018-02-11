package br.com.projetosar.entidades

class Atribuicao {

    String authority

    static mapping = {
        cache true
        sort authority: 'asc'
    }

    static constraints = {
        authority blank: false, unique: true
    }

    String toString() {
        return "$authority"
    }
  
}
