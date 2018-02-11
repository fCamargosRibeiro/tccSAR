package br.com.projetosar.entidades

class Campanha {
    Date dataInicio
    Date dataFim
    static hasMany = [pedido: Pedido]
    static constraints = {
        dataInicio(validator: { dataInicio, obj -> return dataInicio < obj.dataFim})
        dataFim(validator: { dataFim, obj -> return dataFim > obj.dataInicio})
    }
    
    String toString() {
        return "$dataInicio / $dataFim"
    }
  
}
