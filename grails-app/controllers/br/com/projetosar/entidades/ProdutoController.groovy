package br.com.projetosar.entidades

import org.springframework.dao.DataIntegrityViolationException

import static org.springframework.http.HttpStatus.*
import grails.converters.JSON
import grails.converters.JSON
import grails.transaction.Transactional

@Transactional(readOnly = false)
class ProdutoController {
  static scaffold = true
  
  def searchAJAX = {
    def query = params.term
    log.fatal query
    if (!query) {
      return [:]
    }
    def produtos = []
    def searchResult = Produto.findAllByDescricaoIlike("%"+params.term+"%",true)
    searchResult.each{
        def map = [id: it.id, value: it.descricao, label: it.descricao, preco: it.precoVenda]
        produtos.add(map)
      
    }
    render produtos as JSON
  }
  
    def searchPreco = {
        def produto = Produto.get(params.produto.id)
        render '{"preco":'+produto.precoVenda+',"estoque":'+produto.estoque+'}'
    }
}
