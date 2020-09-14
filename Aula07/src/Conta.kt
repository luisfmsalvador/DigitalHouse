class Conta(val numeroConta: Int, var saldo: Double, titular: Cliente) {
    fun deposito(valor: Double) {
        this.saldo = this.saldo + valor
        println("Depósito realizado com sucesso. ")
        println("+ Novo saldo da conta: ${this.saldo}")
    }

    fun saque(valor: Double) {
        if (valor > this.saldo) {
            println("Não foir possível realizar o saque. Saldo insuficiente")
        } else {
            this.saldo = this.saldo - valor
            println("Saque realizado com sucesso. ")
            println("- Novo saldo da conta: ${this.saldo}")
        }
    }
}
