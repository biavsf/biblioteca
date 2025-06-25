package br.gov.sp.etec.aula0502

fun main() {
    println(maior(17, 4))
}

fun maior(numUM:Int, numDois:Int):Int{
    var maiorNum = maior(7, 10)
    if (numUM > numDois) {
        return(numUM)
    } else {
        return(numDois)
    }
}