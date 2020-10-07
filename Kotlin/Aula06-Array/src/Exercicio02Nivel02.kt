fun main() {
    println("Qual o valor do saque?")
    var saque = readLine()!!.toInt()

    if (saque<10 || saque>600) {
        println("Valor de saque inválido")
    } else {
        val notas = arrayOf(100, 50, 10, 5, 1)
        for (index in 0..4) {
            if (saque / notas[index] > 0) {
                println((saque / notas[index]).toString() + " nota(s) de R$ ${notas[index]}")
                saque -= notas[index] * (saque / notas[index])
            }
        }
    }
}