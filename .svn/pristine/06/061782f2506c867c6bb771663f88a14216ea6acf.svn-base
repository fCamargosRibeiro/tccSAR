package br.com.projetosar.entidades

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.apache.commons.lang.builder.HashCodeBuilder

@ToString(cache=true, includeNames=true, includePackage=false)
class GrupoAtribuicao implements Serializable {

	private static final long serialVersionUID = 1

	Grupo grupo
	Atribuicao atribuicao

	GrupoAtribuicao(Grupo g, Atribuicao r) {
		this()
		grupo = g
		atribuicao = r
	}

	@Override
	boolean equals(other) {
		if (!(other instanceof GrupoAtribuicao)) {
			return false
		}

		other.atribuicao?.id == atribuicao?.id && other.grupo?.id == grupo?.id
	}

	@Override
	int hashCode() {
		def builder = new HashCodeBuilder()
		if (grupo) builder.append(grupo.id)
		if (atribuicao) builder.append(atribuicao.id)
		builder.toHashCode()
	}

	static GrupoAtribuicao get(long grupoId, long atribuicaoId) {
		criteriaFor(grupoId, atribuicaoId).get()
	}

	static boolean exists(long grupoId, long atribuicaoId) {
		criteriaFor(grupoId, atribuicaoId).count()
	}

	private static DetachedCriteria criteriaFor(long grupoId, long atribuicaoId) {
		GrupoAtribuicao.where {
			grupo == Grupo.load(grupoId) &&
			atribuicao == Atribuicao.load(atribuicaoId)
		}
	}

	static GrupoAtribuicao create(Grupo grupo, Atribuicao atribuicao, boolean flush = false) {
		def instance = new GrupoAtribuicao(grupo, atribuicao)
		instance.save(flush: flush, insert: true)
		instance
	}

	static boolean remove(Grupo rg, Atribuicao r, boolean flush = false) {
		if (rg == null || r == null) return false

		int rowCount = GrupoAtribuicao.where { grupo == rg && atribuicao == r }.deleteAll()

		if (flush) { GrupoAtribuicao.withSession { it.flush() } }

		rowCount
	}

	static void removeAll(Atribuicao r, boolean flush = false) {
		if (r == null) return

		GrupoAtribuicao.where { atribuicao == r }.deleteAll()

		if (flush) { GrupoAtribuicao.withSession { it.flush() } }
	}

	static void removeAll(Grupo rg, boolean flush = false) {
		if (rg == null) return

		GrupoAtribuicao.where { grupo == rg }.deleteAll()

		if (flush) { GrupoAtribuicao.withSession { it.flush() } }
	}

	static constraints = {
		atribuicao validator: { Atribuicao r, GrupoAtribuicao rg ->
			if (rg.grupo == null || rg.grupo.id == null) return
			boolean existing = false
			GrupoAtribuicao.withNewSession {
				existing = GrupoAtribuicao.exists(rg.grupo.id, r.id)
			}
			if (existing) {
				return 'roleGroup.exists'
			}
		}
	}

	static mapping = {
//		id composite: ['grupo', 'atribuicao']
		version false
	}
}
