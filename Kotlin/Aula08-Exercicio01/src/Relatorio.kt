class Relatorio {

    fun cabecalho(){
        println("Conta".padEnd(10) +
                "Tipo".padEnd(5) +
                "Saldo".padStart(15) +
                "Taxa/Limite".padStart(15))
        traco()
    }

    fun gerarRelatorio(objeto: IImprimivel){
        objeto.mostrarDados()
    }

    fun traco(){
        println("-".padEnd(45,'-'))
    }
}