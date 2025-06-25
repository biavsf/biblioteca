package br.gov.sp.etec.aula0502

fun main() {
    var c1 = Conta()
    c1.titular = "Rafaela"
    c1.numConta = 123321
    c1.saldo = 5200.00

    c1.depositar(7550.00)
    
    println("Saldo da conta: ${c1.saldo}")
}