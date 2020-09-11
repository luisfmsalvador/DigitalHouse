fun main() {
    print("Informe a primeira nota: ")
    var nota1 = readLine()!!.toDouble()

    print("Informe a segunda nota: ")
    var nota2 = readLine()!!.toDouble()

    var media = ((nota1 + nota2) / 2).toDouble()

    if (media == 10.0) {
        print("Aprovado com distinção")
    } else if (media >= 7.0) {
        print("Aprovado")
    } else {
        print("Reprovado")
    }
}