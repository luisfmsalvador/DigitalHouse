import java.text.NumberFormat
import java.util.Locale

fun main() {
    val localeBR = Locale("pt", "BR")
    val dinheiro = NumberFormat.getCurrencyInstance(localeBR)

    println("Informe o valor gasto para cada um dos CDs para o cálculo de média.")
    print("Quando desejar parar de informar os CDs, digite SAIR: ")

    var soma = 0.0
    var qtdeNumeros = 0
    do {
        var valorDigitado = readLine()

        if (valorDigitado.equals("SAIR")) {
            break
        } else {
            soma += valorDigitado!!.toDouble()
            qtdeNumeros++
        }
    } while(true)
    var media = soma / qtdeNumeros
    println("O total investido foi de " + dinheiro.format(soma))
    println("A valor médio gasto nos CDs foi de " + dinheiro.format(media))
}