package br.com.projetosar.entidades

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.apache.commons.lang.builder.HashCodeBuilder

@ToString(cache=true, includeNames=true, includePackage=false)
class UsuarioGrupo implements Serializable {

	private static final long serialVersionUID = 1

	Usuario usuario
	Grupo grupo

	UsuarioGrupo(Usuario u, Grupo rg) {
		this()
		usuario = u
		grupo = rg
	}

	@Override
	boolean equals(other) {
		if (!(other instanceof UsuarioGrupo)) {
			return false
		}

		other.usuario?.id == usuario?.id && other.grupo?.id == grupo?.id
	}

	@Override
	int hashCode() {
		def builder = new HashCodeBuilder()
		if (usuario) builder.append(usuario.id)
		if (grupo) builder.append(grupo.id)
		builder.toHashCode()
	}

	static UsuarioGrupo get(long usuarioId, long grupoId) {
		criteriaFor(usuarioId, grupoId).get()
	}

	static boolean exists(long usuarioId, long grupoId) {
		criteriaFor(usuarioId, grupoId).count()
	}

	private static DetachedCriteria criteriaFor(long usuarioId, long grupoId) {
		UsuarioGrupo.where {
			usuario == Usuario.load(usuarioId) &&
			grupo == Grupo.load(grupoId)
		}
	}

	static UsuarioGrupo create(Usuario usuario, Grupo grupo, boolean flush = false) {
		def instance = new UsuarioGrupo(usuario, grupo)
		instance.save(flush: flush, insert: true)
		instance
	}

	static boolean remove(Usuario u, Grupo rg, boolean flush = false) {
		if (u == null || rg == null) return false

		int rowCount = UsuarioGrupo.where { usuario == u && grupo == rg }.deleteAll()

		if (flush) { UsuarioGrupo.withSession { it.flush() } }

		rowCount
	}

	static void removeAll(Usuario u, boolean flush = false) {
		if (u == null) return

		UsuarioGrupo.where { usuario == u }.deleteAll()

		if (flush) { UsuarioGrupo.withSession { it.flush() } }
	}

	static void removeAll(Grupo rg, boolean flush = false) {
		if (rg == null) return

		UsuarioGrupo.where { grupo == rg }.deleteAll()

		if (flush) { UsuarioGrupo.withSession { it.flush() } }
	}

	static constraints = {
		usuario validator: { Usuario u, UsuarioGrupo ug ->
			if (ug.grupo == null || ug.grupo.id == null) return
			boolean existing = false
			UsuarioGrupo.withNewSession {
				existing = UsuarioGrupo.exists(u.id, ug.grupo.id)
			}
			if (existing) {
				return 'userGroup.exists'
			}
		}
	}

	static mapping = {
//		id composite: ['grupo', 'usuario']
		version false
	}
}
