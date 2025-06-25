package br.gov.sp.etec.aula0502

fun main() {
    parImpar(5)
}

fun parImpar (x: Int) {
    if (x%2==0) {
        println("Par")
    } else {
        println("Impar")
    }
}