package br.com.gabriel.digionebank.testes

import br.com.gabriel.digionebank.Cliente
import br.com.gabriel.digionebank.ClienteTipo

fun main(){
    val jose = Cliente(nome = "Jose da Silva", cpf = "111.333.888.050", clienteTipo = ClienteTipo.PF, senha = "123456")

    println(jose)

    TesteAutenticacao().autentica(jose)
}

