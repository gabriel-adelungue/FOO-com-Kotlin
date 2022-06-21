package br.com.gabriel.digionebank


class Pessoa {
    var nome: String = "Gabriel"
    var cpf: String = "333.333.333-33"
    private set
}

fun main() {
    val gabriel = Pessoa()

    println(gabriel)
    println(gabriel.nome)
    println(gabriel.cpf)

}
