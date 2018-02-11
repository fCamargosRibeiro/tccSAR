package br.com.projetosar.entidades

import org.springframework.dao.DataIntegrityViolationException

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = false)
class RevendedorController { 
  static scaffold = true
}
