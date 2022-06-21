package br.com.gabriel.digionebank

class Pessoa {
    var nome: String = "Gabriel"
    var cpf: String = "333.333.333-33"
}

fun main() {
    val gabriel = Pessoa()
    println(gabriel.nome)
    println(gabriel.cpf)
}
