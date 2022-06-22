package br.com.gabriel.digionebank.testes

import br.com.gabriel.digionebank.Gerente

fun main() {
    val maria = Gerente(nome = "Maria Morena", cpf = "425.741.325-11", salario = 9000.0)
    imprimeRelatorioFuncionario.imprime(maria)
}

