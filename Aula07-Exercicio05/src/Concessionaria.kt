class Concessionaria {
    var nome: String= ""
    var cnpj: String= ""

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor:Double):Venda{
        println("\nVenda realizada com sucesso! ")
        println("++++++ Dados da venda ++++++")
        println("Nome do cliente: ${cliente.nomeCompleto}")
        println("Contato do cliente: ${cliente.contato}")
        println("Veículo comprado: ${veiculo.marca} / ${veiculo.modelo} - Ano: ${veiculo.anoFabricacao}")
        println("Detalhes do veículo: ${veiculo.cor} - Km: ${veiculo.quilometragem}")
        println("Valor da venda: $valor")
        return Venda(cliente, veiculo, valor)
    }
}