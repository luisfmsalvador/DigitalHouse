class Carro(val nome: String, val consumo:Int) {
    var quantidade: Double

    init {
        quantidade = 0.0
    }

    fun andar(quilometros: Int){
        if (quantidade - quilometros/consumo.toDouble() >= 0) {
            quantidade = quantidade - quilometros/consumo.toDouble()
        } else {
            println("Você não tem combustível suficiente para este passeio")
        }
    }

    fun obterGasolina(){
        println("A quantidade restante de combustível no $nome é de $quantidade")
    }

    fun adicionaGasolina(litros:Int){
        quantidade += litros
        println("Carro abastecido!")
    }
}