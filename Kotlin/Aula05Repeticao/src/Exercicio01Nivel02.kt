fun main() {
    println("Informe os números para obtenção da média. ")
    print("Quando não desejar mais informar os números, informe SAIR: ")
    var soma = 0
    var qtdeNumeros = 0
    do {
        var valorDigitado = readLine()

        if (valorDigitado.equals("SAIR")) {
            break
        } else {
            soma += valorDigitado!!.toInt()
            qtdeNumeros++
        }
    } while(true)
    var media = soma.toDouble() / qtdeNumeros
    print("A média dos números informados é $media")
}