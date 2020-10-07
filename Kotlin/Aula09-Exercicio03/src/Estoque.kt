class Estoque(var nome: String, var qtdAtual: Int, var qtdMinima:Int) {

    init {
        if (qtdAtual < 0){
            qtdAtual = 0
        }

        if (qtdMinima < 0) {
            qtdMinima = 0
        }
    }
    fun mudarNome(nome: String){
        this.nome =nome
    }

    fun mudarQtdMinima(qtdMinima: Int){
        this.qtdMinima = qtdMinima
    }

    fun repor(qtd: Int){
        qtdAtual += qtd
    }

    fun darBaixa(qtd: Int){
        qtdAtual -= qtd
    }

    fun mostra()= "Nome: $nome - Quantidade mínima: $qtdMinima - Quantidade atual: $qtdAtual"

    fun precisaRepor()= qtdAtual <= qtdMinima
}