package br.com.projetosar.entidades



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PedidoController {
  static scaffold = true
}
