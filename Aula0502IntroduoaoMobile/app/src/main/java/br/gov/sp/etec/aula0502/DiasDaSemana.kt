package br.gov.sp.etec.aula0502

fun main() {
    println("Escreva o dia da semana")
    println("Obs: tudo em letras minúsculas")
    var dia = readln()
    when(dia) {
        "segunda" -> println("O prato do dia é Virada Paulista")
        "terça" -> println("O prato do dia é Bife à Rolê")
        "quarta" -> println("O prato do dia é feijoada")
        "quinta" -> println("O prato do dia é massa")
        "sexta" -> println("O prato do dia é peixe")
        "sabado" -> println("O prato do dia é feijoada")
        "domingo" -> println("O prato do dia é massa, churrasco ou frango")
        else -> println("Opção inválida")
    }
}