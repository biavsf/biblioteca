package br.gov.sp.etec.aula0502

class Carro() {
    var cor: String = ""
    var modelo: String = ""

    fun Acelerar () {
    println("Acelerando. . .")
    }

    fun frear () {
        println("Freando. . .")
    }

    fun exibirDados () {
        println("Modelo: $modelo")
        println("Cor: $cor")
    }

}

fun main() {
    var c = Carro()
    c.cor = "Branco"
    c.modelo = "HB20"
    c.Acelerar()
    c.exibirDados()

    var f = Carro ()
    f.modelo = "Fiat"
    f.cor = "Vermelho"
    f.frear()
    f.exibirDados()
}