fun main(){
    println("-----> Consumo de combustível")
    print("Informe o nome do carro: ")
    var nomeCarro = readLine()!!.toString()
    print("Informe qual o consumo do carro (medidos em km / litro): ")
    var consumoCarro = readLine()!!.toInt()

    var carro = Carro(nomeCarro,consumoCarro)

    println("Passeando com o meu ${carro.nome}")
    do {
        mensagem()
        var acao = readLine()!!.toInt()
        when(acao) {
            1 -> {
                print("Informe quantos quilometros você irá andar: ")
                var quilometros = carro.andar(readLine()!!.toInt())
            }
            2 -> {
                print("Informe quantos litros você irá abastecer: ")
                var litros = carro.adicionaGasolina(readLine()!!.toInt())
            }
            3 -> carro.obterGasolina()
            9 -> break
        }
    } while(true)
}

fun mensagem(){
    println("Escolha a ação desejada: ")
    println("1- Andar com o carro ")
    println("2- Adicionar a combustível")
    println("3- Obter dados de combustível no tanque")
    println("9- Finalizar o passeio")
}