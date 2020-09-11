fun main() {
    var qtdeSim = 0
    var qtdeNao = 0

    print("Telefonou para a vítima? ")
    if (readLine()!!.toString().toUpperCase() == "SIM") {
        qtdeSim++
    }

    print("Esteve no local do crime? ")
    if (readLine()!!.toString().toUpperCase() == "SIM") {
        qtdeSim++
    }

    print("Mora perto da vítima? ")
    if (readLine()!!.toString().toUpperCase() == "SIM") {
        qtdeSim++
    }

    print("Devia para a vítima? ")
    if (readLine()!!.toString().toUpperCase() == "SIM") {
        qtdeSim++
    }

    print("Já trabalhou com a vítima? ")
    if (readLine()!!.toString().toUpperCase() == "SIM") {
        qtdeSim++
    }

    print("Resultado da participação da pessoa no crime: ")
    when(qtdeSim) {
        2 -> print("Suspeita")
        3,4 -> print("Cúmplice")
        5 -> print("Assassino")
        else -> print("Inocente")
    }
}