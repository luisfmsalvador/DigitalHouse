fun main() {
    print("Informe a taxa do imposto (%): ")
    var taxaImposto = readLine()!!.toDouble()

    print("Informe o custo do item: ")
    var custoItem = readLine()!!.toDouble()

    println("O custo o item taxado é de " + "%.2f".format(somaImposto(taxaImposto,custoItem)))
}

fun somaImposto(taxaImposto:Double,custoItem:Double):Double = custoItem * (taxaImposto/100 + 1)