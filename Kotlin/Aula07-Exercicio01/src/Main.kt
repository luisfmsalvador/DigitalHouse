fun main() {
    print("Informe o nome do cliente: ")
    var nome = readLine()!!.toString()

    print("Informe o sobrenome do cliente: ")
    var sobrenome = readLine()!!.toString()

    var cliente =  Cliente(nome, sobrenome)

    println("\nBem-vindo prezado(a) " + cliente.nomeCompleto)
    print("Por favor, informe o número da conta: ")
    var numeroConta = readLine()!!.toInt()

    print("Informe o saldo inicial da conta: ")
    var saldoInicial = readLine()!!.toDouble()

    var conta = Conta(numeroConta, saldoInicial, cliente)

    do {
        mensagem()
        var operacao = readLine()!!.toInt()
        when (operacao) {
            1 -> {
                print("Informe o valor do depósito: ")
                var deposito = readLine()!!.toDouble()

                conta.deposito(deposito)
            }
            2 -> {
                print("Informe o valor do saque: ")
                var saque = readLine()!!.toDouble()

                conta.saque(saque)
            }
            9 -> break
        }
    } while(true)
}

fun mensagem() {
    println("-Informe a operação desejada: ")
    println("--- 1 - Depósito")
    println("--- 2 - Saque")
    println("--- 9 - Sair")
    print("Informe a sua opção: ")
}
