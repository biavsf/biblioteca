package br.gov.sp.etec.aula0502

fun main() {
    println("Digite um valor:")
    var idade = readln()!!.toInt()


    if (idade >= 18) {
        println("Você é maior de idade")
    } else {
        println("Você é menor de idade")
    }
}