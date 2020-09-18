class ContaPoupanca(conta:Int, saldo: Double, val limite: Double): ContaBancaria(conta,saldo) {

    override fun sacar(valor:Double):Boolean {
        if (valor > (limite + saldo)) {
            return false
        } else {
            saldo -= valor
            return true
        }
    }

    override fun depositar(valor:Double):Boolean {
        saldo += valor
        return true
    }

    override fun mostrarDados() {
        println(conta.toString().padEnd(10) +
                "P".padEnd(5) +
                "%.2f".format(saldo).padStart(15) +
                "%.2f".format(limite).padStart(15))
    }
}