fun main() {
    print("Digite a altura: ")
    var altura = readLine()!!.toDouble()

    var alturaIdealHomem = (72.7 * altura) - 58
    var alturaIdealMulher = (62.1 * altura) - 44.7

    println("")
    println("Para homens: " + "%.2f".format(alturaIdealHomem))
    println("Para mulheres: " + "%.2f".format(alturaIdealMulher))
}