fun main() {
    var contador = 5
    var maiorNumero = Int.MIN_VALUE

    while (contador != 0) {
        print("Informe um número: ")
        var numero = readLine()!!.toInt()

        if (numero > maiorNumero) {
            maiorNumero = numero
        }
        contador--
    }

    print("O maior número digitado foi o número $maiorNumero")
}