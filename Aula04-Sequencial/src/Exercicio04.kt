import java.text.NumberFormat
import java.util.Locale

fun main() {
    val localeBR = Locale("pt", "BR")
    val dinheiro = NumberFormat.getCurrencyInstance(localeBR)

    val limitePeso = 50;
    val multaQuiloExcedente = 4;

    print("Digite o peso dos peixes: ")
    var pesoPeixes = readLine()!!.toFloat()

    if (pesoPeixes > 50) {
        var pesoExcedente = pesoPeixes - limitePeso
        var valorMulta = pesoExcedente * multaQuiloExcedente
        println("Excedeu $pesoExcedente Kg")
        print("O valor a ser pago é de " + dinheiro.format(valorMulta))
    } else {
        print("O peso dos peixes pesacados não foi excedido")
    }
}