package br.gov.sp.etec.aula0502

class Conta {
    var titular: String = ""
    var numConta: Int = 0
    var saldo: Double = 0.0

    fun depositar(valor: Double) {
        if (valor > 0) {
            // ou saldo += valor ---> mesma coisa que saldo = saldo + valor
            saldo += valor
        } else {
            println("Valor insuficiente ou valor inválido")
        }
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            // ou saldo -= valor ---> mesma coisa que saldo = saldo - valor
            saldo -= valor
        } else {
            println("Saldo insuficiente ou saldo inválido")
        }
    }
}