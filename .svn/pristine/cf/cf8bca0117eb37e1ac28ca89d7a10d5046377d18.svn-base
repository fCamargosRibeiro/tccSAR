package br.com.projetosar.entidades

import org.apache.commons.lang.builder.HashCodeBuilder

class UsuarioAtribuicao implements Serializable {

	Usuario usuario
	Atribuicao atribuicao

	boolean equals(other) {
		if (!(other instanceof UsuarioAtribuicao)) {
			return false
		}

		other.usuario?.id == usuario?.id &&
			other.atribuicao?.id == atribuicao?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (usuario) builder.append(usuario.id)
		if (atribuicao) builder.append(atribuicao.id)
		builder.toHashCode()
	}

	static UsuarioAtribuicao get(long usuarioId, long atribuicaoId) {
		find 'from UsuarioAtribuicao where usuario.id=:usuarioId and atribuicao.id=:atribuicaoId',
			[usuarioId: usuarioId, atribuicaoId: atribuicaoId]
	}

	static UsuarioAtribuicao create(Usuario usuario, Atribuicao atribuicao, boolean flush = false) {
		new UsuarioAtribuicao(usuario: usuario, atribuicao: atribuicao).save(flush: flush, insert: true)
	}

	static boolean remove(Usuario usuario, Atribuicao atribuicao, boolean flush = false) {
		UsuarioAtribuicao instance = UsuarioAtribuicao.findByUsuarioAndAtribuicao(usuario, atribuicao)
		if (!instance) {
			return false
		}

		instance.delete(flush: flush)
		true
	}

	static void removeAll(Usuario usuario) {
		executeUpdate 'DELETE FROM UsuarioAtribuicao WHERE usuario=:usuario', [usuario: usuario]
	}

	static void removeAll(Atribuicao atribuicao) {
		executeUpdate 'DELETE FROM UsuarioAtribuicao WHERE atribuicao=:atribuicao', [atribuicao: atribuicao]
	}

	static mapping = {
//		id composite: ['atribuicao', 'usuario']
		version false
	}
  
  String toString() {
    return "$atribuicao"
  }
}
