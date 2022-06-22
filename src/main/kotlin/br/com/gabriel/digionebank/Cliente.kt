package br.com.gabriel.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Tipo do cliente: ${clienteTipo.descricao}
    """.trimIndent()
}