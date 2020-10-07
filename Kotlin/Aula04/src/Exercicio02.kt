import java.text.NumberFormat
import java.util.Locale

fun main() {
    val localeBR = Locale("pt", "BR")
    val dinheiro = NumberFormat.getCurrencyInstance(localeBR)

    print("Informe qual o seu salário por hora: ")
    var salarioHora = readLine()!!.toFloat()

    print("Informe a quantidade de horas trabalhadas: ")
    var qtdeHorasTrabalhadas = readLine()!!.toFloat()

    var salarioBruto = salarioHora * qtdeHorasTrabalhadas
    var valorIR = salarioBruto * 11 / 100
    var valorINSS = salarioBruto * 8 / 100
    var valorSindicato = salarioBruto * 5 / 100
    var salarioLiquido = salarioBruto - valorIR - valorINSS - valorSindicato

    println("+ Salário Bruto   : " + dinheiro.format(salarioBruto))
    println("- IR (11%)        : " + dinheiro.format(valorIR))
    println("- INSS (8%)       : " + dinheiro.format(valorINSS))
    println("- Sindicato (5%)  : " + dinheiro.format(valorSindicato))
    println("= Salário Líquido : " + dinheiro.format(salarioLiquido))
}