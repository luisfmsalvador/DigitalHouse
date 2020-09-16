fun main() {
    var concessionaria = Concessionaria()

    mensagem()

    var veiculo: Veiculo = cadastrarVeiculo()
    var cliente: Cliente = cadastrarCliente()

    print("Informe o valor da venda: ")
    var valor = readLine()!!.toDouble()

    var venda = concessionaria.registrarVenda(veiculo, cliente, valor)


/*    do {
        mensagem()
        var opcao = readLine()!!.toInt()

        when (opcao){
            1 ->
            2 -> cadastrarCliente()
            //3 -> fazerVenda()
            9 ->{
                println("Obrigado e volte sempre!")
                break
            }
        }
    } while(true)
*/

}

fun mensagem() {
    println("---------Concessionária CarroBoom--------")
/*    println("1 - Cadastrar veículo ")
    println("2 - Cadastrar Cliente ")
    println("3 - Realizar venda ")
    println("9 - Fechar sistema")*/
}

fun cadastrarCliente():Cliente {
    println("Cadastro de cliente ")

    print("Informe o nome do cliente: ")
    var nome = readLine()!!.toString()

    print("Informe o sobrenome do cliente: ")
    var sobrenome = readLine()!!.toString()

    print("Informe o contato do cliente: ")
    var contato = readLine()!!.toString()

    return Cliente(nome, sobrenome, contato)
}

fun cadastrarVeiculo():Veiculo {
    println("Cadastro de veículo ")

    print("Informe a marca do veículo: ")
    var marca = readLine()!!.toString()

    print("Informe o modelo do veículo: ")
    var modelo = readLine()!!.toString()

    print("Informe o ano de fabricação do veículo: ")
    var anoFabricacao = readLine()!!.toInt()

    print("Informe a cor do veículo: ")
    var cor = readLine()!!.toString()

    print("Informe a quilometragem do veículo: ")
    var quilometragem = readLine()!!.toInt()

    return Veiculo(marca, modelo, anoFabricacao, cor, quilometragem)
}
