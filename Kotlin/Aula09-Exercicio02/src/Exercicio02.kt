fun main(){
    var fatura = Fatura()

    println("-*-*-*-*-*-*-LOJA DE INFORMÁTICA JARARÉ*-*-*-*-*-*-*-")
    do {
        println("Informe a opção do menu: ")
        println("1- Cadastrar item")
        println("2- Obter valor total")
        println("3- Finalizar")
        print("\nOpção: ")
        var opcao = readLine()!!.toInt()
        when(opcao){
            1-> {
                print("Informe o código do item: ")
                var numero = readLine()!!.toInt()

                print("Informe o nome do item: ")
                var nome = readLine()!!.toString()

                print("Informe a quantidade do iten: ")
                var quantidade = readLine()!!.toInt()

                print("Informe o preço do item: ")
                var preco = readLine()!!.toDouble()

                fatura.itens.add(Item(numero,nome,quantidade,preco))

                println("Item cadastrado com sucesso")
            }

            2->{
                println("O valor total da fatura é ${fatura.getTotalFatura()}")
            }
            3-> break
        }
        println("Pressione alguma tecla para voltar ao menu")
        readLine()
    } while (true)
}
