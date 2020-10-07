fun main() {
    var maiorNumero = Int.MIN_VALUE

    for (num in 1..3){
        print("Informe um número: ")
        maiorNumero = maxOf(maiorNumero,readLine()!!.toInt())
    }

    println("O maior número é $maiorNumero")
}