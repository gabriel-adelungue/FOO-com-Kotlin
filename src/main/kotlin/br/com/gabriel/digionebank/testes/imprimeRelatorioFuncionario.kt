package br.com.gabriel.digionebank.testes

import br.com.gabriel.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object{
        fun imprime (funcionario: Funcionario){
            println(funcionario.toString())
        }
    }
}