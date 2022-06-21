package br.com.gabriel.digionebank


class Pessoa {
    var nome: String = "Gabriel"
    var cpf: String = "333.333.333-33"
    private set

    constructor() // Construtor secundário

    fun pessoaInfo() = "$nome + $cpf"
}

fun main() {
    val gabriel = Pessoa()
    println(gabriel.pessoaInfo())
}
