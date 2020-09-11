fun main () {
    print("Informe um número: ")
    var numero = readLine()!!.toInt()

    if (numero%2 == 0) {
        print("Número par")
    } else {
        print("Numero ímpar")
    }
}