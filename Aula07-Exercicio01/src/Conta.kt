import java.text.NumberFormat
import java.util.Locale

class Conta(val numeroConta: Int, var saldo: Double, titular: Cliente) {
    val localeBR = Locale("pt", "BR")
    val dinheiro = NumberFormat.getCurrencyInstance(localeBR)

    fun deposito(valor: Double) {
        this.saldo = this.saldo + valor
        println("Depósito realizado com sucesso. ")
        println("+ Novo saldo da conta: ${dinheiro.format(this.saldo)}\n")
    }

    fun saque(valor: Double) {
        if (valor > this.saldo) {
            println("Não foi possível realizar o saque. Saldo insuficiente\n")
        } else {
            this.saldo = this.saldo - valor
            println("Saque realizado com sucesso. ")
            println("- Novo saldo da conta: ${dinheiro.format(this.saldo)}\n")
        }
    }
}
