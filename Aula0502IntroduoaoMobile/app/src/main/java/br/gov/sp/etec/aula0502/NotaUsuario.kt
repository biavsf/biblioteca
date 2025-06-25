package br.gov.sp.etec.aula0502

fun main() {
    println("Digite sua nota:")
    val nota = readln()!!.toDouble()


    if (nota >= 6) {
        println("Você foi aprovado.")
    } else {
        println("Você foi reprovado.")
    }
}