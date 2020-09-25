fun main() {
    val valores = mutableSetOf<Int>()
    valores.add(1)
    valores.add(10)
    valores.add(12)
    valores.add(14)
    valores.add(16)
    valores.add(17)

    val prova = Prova()
    prova.somaTotal(valores)
}