package br.com.projetosar.entidades

class Usuario {
    
    transient springSecurityService
    
    String username
    String password
    String email
    boolean enabled
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired
    static hasMany = [oAuthID: OAuthID, atribuicoes : UsuarioAtribuicao]
    
    static constraints = {
        username (blank: false)
        password (nullable: true)
        email (email: true, nullable: true)
    }

    String toString() {
        return "$username"
    }
    
    Set<Grupo> getAuthorities() {
        UsuarioGrupo.findAllByUsuario(this)*.grupo
    }

    def beforeInsert() {
        encodePassword()
    }

    def beforeUpdate() {
        if (isDirty('password')) {
          encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService?.passwordEncoder ? springSecurityService.encodePassword(password) : password
    }
}
