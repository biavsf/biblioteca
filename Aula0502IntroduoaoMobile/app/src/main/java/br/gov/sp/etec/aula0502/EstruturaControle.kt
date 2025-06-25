package br.gov.sp.etec.aula0502

fun main() {
    println("Digite sua idade: ")
    var idade = readln()!!.toInt()


    if (idade >= 18) {
        println("Pode entrar.")
    } else {
        println("Você não pode entrar.")
    }
}