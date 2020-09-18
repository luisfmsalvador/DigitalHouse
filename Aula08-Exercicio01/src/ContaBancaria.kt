abstract class ContaBancaria(var conta:Int, protected var saldo: Double) :IImprimivel{

    abstract fun sacar(valor:Double):Boolean

    abstract fun depositar(valor:Double):Boolean

    override fun mostrarDados() {
    }

    fun transferi(valor:Double, contaDestino: ContaBancaria){
        sacar(valor)
        contaDestino.depositar(valor)
    }

}