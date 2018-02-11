package br.com.projetosar.entidades

class Financeiro {

    static belongsTo = [cliente : Cliente]
    Double saldo
    
    static constraints = {
        cliente ()
        saldo (nullable: false, blank: false)
    }
    
    void addValor(Double valor){
        this.saldo += valor;
    }

    String toString() {
        return "$saldo"
    }
}
