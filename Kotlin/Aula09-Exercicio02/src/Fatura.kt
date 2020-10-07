class Fatura {
    var itens = ArrayList<Item>()

    fun getTotalFatura():Double{
        var valorTotal = 0.0
        itens.forEach {
            valorTotal += it.precoUnitario * it.quantidade
        }
        return valorTotal
    }
}