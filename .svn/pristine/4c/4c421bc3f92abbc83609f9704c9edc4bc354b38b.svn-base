package br.com.projetosar.entidades

import grails.transaction.Transactional

@Transactional
class PagamentoService {

    def adicionarPagamento(Cliente cliente, Double valor, Date data, String obs) {
        def pagamento = new Pagamento()
        pagamento.valor = valor
        pagamento.cliente = cliente
        pagamento.data = data
        pagamento.observacao = obs
        cliente.financeiro.addValor(valor)
        pagamento.save()
    }
    
    def findCreditos(Cliente cliente, Date dataIni, Date dataFim){
        def pagamentos = findPagamentos(cliente,dataIni,dataFim?:new Date())
        def result = []
        for(pg in pagamentos){
            if(pg.valor > 0){
                result.add(pg)
            }
        }
        return result
    }
    def findDebitos(Cliente cliente, Date dataIni, Date dataFim){
        def pagamentos = findPagamentos(cliente,dataIni,dataFim?:new Date())
        def result = []
        for(pg in pagamentos){
            if(pg.valor < 0){
                result.add(pg)
            }
        }
        return result
    }
    def findPagamentos(Cliente cliente, Date dataIni, Date dataFim){
        def pagamentos = Pagamento.findAllByClienteAndDataBetween(cliente,dataIni,dataFim?:new Date())
        return pagamentos
    }
}
