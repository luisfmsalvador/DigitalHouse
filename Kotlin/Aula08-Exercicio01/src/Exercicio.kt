fun main() {
    val banco = Banco()
    val relatorio = Relatorio()

    do {
        mensagemBanco()

        when (readLine()!!.toInt()) {
            1 -> banco.inserir(cadastrarConta())
            2 -> {
                val conta = banco.procurarConta(buscarConta())
                if (conta == null) {
                    println("Conta inexistente")
                } else {
                    menu()

                    do {
                        when (readLine()!!.toInt()) {
                            1 -> {
                                print("Informe o valor do depósitc: ")
                                if (conta.depositar(readLine()!!.toDouble())){
                                    println("Depósito realizado com sucesso")
                                } else {
                                    println("Saldo insuficiente para o depósito")
                                }
                            }
                            2 -> {
                                print("Informe o valor do saque: ")
                                if (conta.sacar(readLine()!!.toDouble())){
                                    println("Saldo realizado com sucesso")
                                } else {
                                    println("Saldo insuficiente para o saque")
                                }
                            }
                            3 -> {
                                print("Informe o número da conta para transaferência: ")
                                var numeroContaTransferencia = readLine()!!.toInt()
                                var contaTransferencia = banco.procurarConta(numeroContaTransferencia)

                                if (contaTransferencia==null){
                                    println("Conta não existe!")
                                } else {
                                    print("Informe o valor da transferência: ")
                                    var valorTransferencia = readLine()!!.toDouble()

                                    conta.sacar(valorTransferencia)
                                    contaTransferencia.depositar(valorTransferencia)
                                }
                            }
                            4 -> relatorio.gerarRelatorio(conta)
                        }
                        break
                    } while (true)
                }
            }
            3 -> {
                var conta = banco.procurarConta(buscarConta())
                if (conta == null) {
                    println("Conta inexistente")
                } else {
                    banco.remover(conta)
                }
            }
            4 -> {
                relatorio.cabecalho()
                banco.contasBancarias.forEach { relatorio.gerarRelatorio(it) }
            }
            5 -> {
                println("Obrigado por utilizar nosso sistema. Até mais!")
                break
            }
        }
        println("\nPRESSIONE ENTER PARA ENTRAR NO MENU NOVAMENTE")
        readLine()
    } while (true)
}

fun mensagemBanco() {
    println("--------BANCO VEM SER FELIZ--------")
    println("Escolha uma opção:")
    println("   1 - Criar conta")
    println("   2 - Selecionar conta")
    println("   3 - Remover conta")
    println("   4 - Gerar relatório")
    println("   5 - Finalizar\n")
    print("Opção: ")
}

fun menu(){
    println("Escolha uma opção do menu:")
    println("   1 - Depositar")
    println("   2 - Sacar")
    println("   3 - Transferir")
    println("   4 - Gerar relatório\n")
    print("Opção: ")
}

fun cadastrarConta():ContaBancaria {
    var tipoConta = ""
    do {
        print("Informe o tipo da conta (P - poupança / C - corrente): ")
        tipoConta = readLine()!!.toString().toUpperCase()

        if (tipoConta!="P" && tipoConta!="C"){
            println("Tipo inválido!")
        }
    } while(tipoConta!="P" && tipoConta!="C")

    print("Informe o número da conta: ")
    var numeroConta = readLine()!!.toInt()

    print("Informe o saldo da conta: ")
    var saldoConta = readLine()!!.toDouble()

    if (tipoConta == "C") {
        print("Informe a taxa da conta: ")
        var taxa = readLine()!!.toDouble()
        return ContaCorrente(numeroConta,saldoConta,taxa)
    } else {
        print("Informe o limite da conta: ")
        var limite = readLine()!!.toDouble()
        return ContaPoupanca(numeroConta,saldoConta,limite)
    }
}

fun buscarConta():Int{
    print("Informe o número da conta: ")
    return readLine()!!.toInt()
}