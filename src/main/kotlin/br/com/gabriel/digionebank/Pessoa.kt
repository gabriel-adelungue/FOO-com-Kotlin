package br.com.gabriel.digionebank

// Outer class
class Pessoa {
    var nome: String = "Gabriel"
    var cpf: String = "333.333.333-33"

    // Inner Class
    inner class Endereco { // Classe dentro de outra classe (Pessoa())
        var rua: String = "Rua Teste"
    }
}

fun main() {
    val gabriel = Pessoa()
    println(gabriel.nome)
    println(gabriel.cpf)

    println(gabriel.Endereco().rua)
}
