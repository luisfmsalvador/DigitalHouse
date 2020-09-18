class ContaCorrente(conta:Int, saldo: Double, val taxaDeOperacao: Double): ContaBancaria(conta,saldo) {

    override fun sacar(valor:Double):Boolean {
        if (taxaDeOperacao + valor > saldo) {
            return false
        } else {
            saldo -= taxaDeOperacao
            saldo -= valor
            return true
        }
    }

    override fun depositar(valor:Double):Boolean {
        if (taxaDeOperacao + valor > saldo) {
            return false
        } else {
            saldo -= taxaDeOperacao
            saldo += valor
            return true
        }
    }

    override fun mostrarDados() {
        println(conta.toString().padEnd(10) +
                "C".padEnd(5) +
                "%.2f".format(saldo).padStart(15) +
                "%.2f".format(taxaDeOperacao).padStart(15))
    }
}