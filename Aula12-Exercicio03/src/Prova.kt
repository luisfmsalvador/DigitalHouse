class Prova {

    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        var total = 0
        conjuntoDeInteiros.forEach{
            total += it
        }
        println("Valor total: $total")
    }
}