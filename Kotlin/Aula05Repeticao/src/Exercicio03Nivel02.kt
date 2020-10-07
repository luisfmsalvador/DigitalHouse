fun main() {
    print("Informe um número inteiro para a tabuada: ")
    var tabuada = readLine()!!.toInt()

    for (num in 1..10) {
        println("$tabuada x $num = " + tabuada*num)
    }
}
