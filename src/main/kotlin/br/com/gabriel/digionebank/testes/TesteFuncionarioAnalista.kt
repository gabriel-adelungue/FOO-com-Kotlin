package br.com.gabriel.digionebank.testes

import br.com.gabriel.digionebank.Analista

fun main() {
    val gabriel = Analista(nome = "Gabriel Adelungue", cpf = "232.141.154-78", salario = 4700.0)
    imprimeRelatorioFuncionario.imprime(gabriel)

}
