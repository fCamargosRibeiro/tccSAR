package br.com.projetosar.entidades

class GrupoRevendedor {
  
    String descricaoGrupo
    static hasMany = [revendedor: Revendedor]
    static constraints = {
        descricaoGrupo()
        revendedor(nullable: true)
    }
    
     String toString() {
        return "$descricaoGrupo" 
    }
}
