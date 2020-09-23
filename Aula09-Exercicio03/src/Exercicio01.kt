fun main(){
    var estoque = Estoque("Camiseta do Corinthians",10,3)
    do {
        when(montaMenu()){
            1 -> {
                print("Informe o novo nome do produto: ")
                estoque.mudarNome(readLine()!!.toString())
            }
            2 -> {
                print("Informe a nova quantidade mínima: ")
                estoque.mudarQtdMinima(readLine()!!.toInt())
            }
            3->{
                print("Qual a quantidade a adicionar do estoque? ")
                estoque.repor(readLine()!!.toInt())
            }
            4->{
                print("Qual a quantidade a baixar do estoque? ")
                estoque.darBaixa(readLine()!!.toInt())
            }
            5->{
                println(estoque.mostra())
            }
            6->{
                if (estoque.precisaRepor()) {
                    println("Precisa repor o estoque")
                } else {
                    println("Não precisa repor o estoque")
                }
            }
            9->break
        }
        print("\nPressiona alguma tecla para voltar ao menu")
        readLine()
    }while(true)
}

fun montaMenu():Int{
    println("Escolha a opção abaixo: ")
    println("1- Mudar nome do item")
    println("2- Mudar quantidade mínima")
    println("3- Repor estoque")
    println("4- Dar baixa")
    println("5- Mostrar dados do produto")
    println("6- Verificar se precisa de reposição")
    println("9- Finalizar")

    print("\nOpção: ")

    return readLine()!!.toInt()
}