fun main() {
    print("Quanto você quer sacar? ")
    var saque = readLine()!!.toInt()
    var qtdeCedulas = 0

    if (saque >= 10 || saque <= 600) {
        qtdeCedulas = (saque / 100).toInt()
        saque = saque - qtdeCedulas * 100
        if (qtdeCedulas > 0) {
            println("$qtdeCedulas nota(s) de R$ 100,00")
        }

        qtdeCedulas = (saque / 50).toInt()
        saque = saque - qtdeCedulas * 50
        if (qtdeCedulas > 0) {
            println("$qtdeCedulas nota(s) de R$ 50,00")
        }

        qtdeCedulas = (saque / 10).toInt()
        saque = saque - qtdeCedulas * 10
        if (qtdeCedulas > 0) {
            println("$qtdeCedulas nota(s) de R$ 10,00")
        }

        qtdeCedulas = (saque / 5).toInt()
        saque = saque - qtdeCedulas * 5
        if (qtdeCedulas > 0) {
            println("$qtdeCedulas nota(s) de R$ 5,00")
        }

        qtdeCedulas = (saque).toInt()
        if (qtdeCedulas > 0) {
            println("$qtdeCedulas nota(s) de R$ 1,00")
        }
    } else {
        print("Valor inválido para saque")
    }
}