fun main() {
    print("Informe um número inteiro: ")
    var numeroInteiro = readLine()!!.toInt()
    var count = 1

    while(count<=100){
        if (numeroInteiro >= 0){
            println(numeroInteiro)
            count++
        }
        numeroInteiro++
    }
}