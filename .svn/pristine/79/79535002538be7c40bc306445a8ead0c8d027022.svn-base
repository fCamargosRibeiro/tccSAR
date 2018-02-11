package br.com.projetosar.entidades

class Grupo implements Serializable {

	private static final long serialVersionUID = 1

	String name

        static hasMany = [usuarios: UsuarioGrupo, atribuicoes: GrupoAtribuicao]
        
	Grupo(String name) {
		this()
		this.name = name
	}

	@Override
	int hashCode() {
		name?.hashCode() ?: 0
	}

	@Override
	boolean equals(other) {
		is(other) || (other instanceof Grupo && other.name == name)
	}

	@Override
	String toString() {
		name
	}

	Set<Atribuicao> getAuthorities() {
		GrupoAtribuicao.findAllByGrupo(this)*.atribuicao
	}

	static constraints = {
		name blank: false, unique: true
	}

	static mapping = {
		cache true
	}
}
