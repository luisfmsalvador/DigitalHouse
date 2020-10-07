fun main() {
    print("Informe o primeiro número do intervalo: ")
    var numIni = readLine()!!.toInt()

    print("Informe o segundo número do intervalo: ")
    var numFin = readLine()!!.toInt()

    when {
        numIni < numFin -> {
            for (num in numIni..numFin) {
                println("$num")
            }
        }
        numIni > numFin -> {
            for (num in numIni downTo numFin) {
                println("$num")
            }
        }
        else ->
            print("Não existe intervalo entre os números informados")
    }

}