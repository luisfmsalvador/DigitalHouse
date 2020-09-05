import java.text.NumberFormat
import java.util.Locale

fun main() {
    val localeBR = Locale("pt", "BR")
    val dinheiro = NumberFormat.getCurrencyInstance(localeBR)

    print("Quanto vale a sua hora? ")
    var valorHora = readLine()!!.toDouble()

    print("Quantas horas você trabalhou? ")
    var horasTrabalhadas = readLine()!!.toDouble()

    var valorAReceber = valorHora * horasTrabalhadas
    print("Você receberá " + dinheiro.format(valorAReceber))
}