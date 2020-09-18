class Banco: IImprimivel {
    var contasBancarias = ArrayList<ContaBancaria>()

    fun inserir(conta: ContaBancaria) {
        contasBancarias.add(conta)
        println("\nConta inserida com sucesso!")
    }
    
    fun remover(conta: ContaBancaria) {
        contasBancarias.remove(conta)
        println("\nConta removida com sucesso!")
    }

    fun procurarConta(contaNumero: Int): ContaBancaria? {
        var conta : ContaBancaria? = null

        contasBancarias.forEach{
            if (it is ContaPoupanca) {
                var contaPoupanca = it

                if (contaPoupanca.conta == contaNumero){
                    conta = it
                }
            } else if (it is ContaCorrente){
                var contaCorrente = it

                if (contaCorrente.conta == contaNumero){
                    conta = it
                }
            }
        }

        return conta
    }

    override fun mostrarDados() {
        contasBancarias.forEach{
            it.mostrarDados()
        }
    }
}