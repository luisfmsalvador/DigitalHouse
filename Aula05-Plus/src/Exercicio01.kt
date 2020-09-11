fun main() {
  //Uma academia deseja fazer um senso entre seus clientes para descobrir
    // o mais alto, o mais baixo, a mais gordo e o mais magro,
    // para isto você deve fazer um programa que pergunte a cada um dos clientes da academia seu código,
    // sua altura e seu peso.
    // O final da digitação de dados deve ser dada quando o usuário digitar 0 (zero) no campo código.
    // Ao encerrar o programa também deve ser informados os códigos e valores do clente mais alto,
    // do mais baixo, do mais gordo e do mais magro,
    // além da média das alturas e dos pesos dos clientes

    var maisAltos = ""
    var maiorAltura = Double.MIN_VALUE
    var maisBaixos = ""
    var menorAltura = Double.MAX_VALUE
    var maisGordos = ""
    var maiorPeso = Double.MIN_VALUE
    var maisMagros = ""
    var menorPeso = Double.MAX_VALUE
    var qtdeClientes = 0
    var somaAlturas = 0.0
    var somaPesos = 0.0

    do {
        print("Informe seu código de cliente: ")
        var codigo = readLine()!!.toInt()

        if (codigo == 0){
            break
        }

        print("Informe sua altura: ")
        var altura = readLine()!!.toDouble()
        somaAlturas += altura

        print("Informe seu peso: ")
        var peso = readLine()!!.toDouble()
        somaPesos += peso

        qtdeClientes++

        when {
            (altura > maiorAltura) -> {
                maiorAltura = altura
                maisAltos = codigo.toString() + ";"
            }
            (altura == maiorAltura) -> maisAltos += codigo.toString() + ";"
        }

        when {
            (altura < menorAltura) -> {
                menorAltura = altura
                maisBaixos = codigo.toString() + ";"
            }
            (altura == menorAltura) -> maisBaixos += codigo.toString() + ";"
        }

        when {
            (peso > maiorPeso) -> {
                maiorPeso = peso
                maisGordos = codigo.toString() + ";"
            }
            (peso == maiorPeso) -> maisGordos += codigo.toString() + ";"
        }

        when {
            (peso < menorPeso) -> {
                menorPeso = peso
                maisMagros = codigo.toString()
            }
            (peso == menorPeso) -> maisMagros += ";" + codigo.toString()
        }
    } while(true)

    if (somaPesos != 0.0 && somaAlturas != 0.0) {
        var mediaPeso = somaPesos / qtdeClientes
        println("A média de peso dos clientes é $mediaPeso")

        var mediaAltura = somaAlturas / qtdeClientes
        println("A média de altura dos clientes é $mediaAltura")

        if (maisAltos.split(";").count() == 1) {
            println("A maior altura dos clientes é $maiorAltura e o código do cliente mais alto é $maisAltos")
        } else {
            println("A maior altura dos clientes é $maiorAltura e os códigos dos clientes mais altos são $maisAltos")
        }

        if (maisBaixos.split(";").count() == 1) {
            println("A menor altura dos clientes é $menorAltura e o código do cliente mais baixo é $maisBaixos")
        } else {
            println("A menor altura dos clientes é $menorAltura e os códigos dos clientes mais baixos são $maisBaixos")
        }

        if (maisGordos.split(";").count() == 1) {
            println("O maior peso dos clientes é $maiorPeso e o código do cliente mais gordo é $maisGordos")
        } else {
            println("O maior peso dos clientes é $maiorPeso e os códigos dos clientes mais gordo são $maisGordos")
        }

        if (maisMagros.split(";").count() == 1) {
            println("O menor peso dos clientes é $menorPeso e o código do cliente mais magro é $maisMagros")
        } else {
            println("O menor peso dos clientes é $menorPeso e os códigos dos clientes mais magros são $maisMagros")
        }
    } else {
        println("Não foram informados dados para obter as informaçõs desejadas")
    }
}