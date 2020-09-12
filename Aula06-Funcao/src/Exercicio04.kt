import kotlin.random.Random

fun main() {
    var numeroJogada = 1
    var numeroPonto = 0

    print("Rolar dados? (s/n)")
    var snRolarDados = readLine()!!.toString().toUpperCase()

    while (snRolarDados == "S") {
        var numeroDado = rolarDados()
        if (numeroJogada == 1) {
            when (numeroDado) {
                7, 11 -> {
                    println("Parabéns você ganhou!")
                    break
                }
                2, 3, 12 -> {
                    println("Você perdeu! =(")
                    break
                }
                else -> {
                    print("Aperte enter para tentar novamente")
                    numeroPonto = numeroDado
                }
            }
        } else {
            when (numeroDado) {
                7 -> {
                    println("Você perdeu! =(")
                    break
                }
                numeroPonto -> {
                    println("Parabéns você ganhou!")
                    break
                }
                else -> {
                    print("Aperte enter para tentar novamente")
                }
            }
        }
        readLine()
        numeroJogada++
    }
    print("Muito obrigado por jogar. Até mais!")
}

fun rolarDados(): Int {
    var numeroDado = Random.nextInt(2, 12)
    print("Você tirou $numeroDado! ")
    return numeroDado
}