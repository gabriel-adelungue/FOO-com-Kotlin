package br.com.gabriel.digionebank.testes

import br.com.gabriel.digionebank.Banco

fun main() {
    // Argumentos nomeados dentro da classe Banco.
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)
    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val banco2 = digiOneBank.copy(nome = "Banco2")
    println(banco2.info())
}