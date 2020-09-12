fun main() {
    print("Informe o primeiro número: ")
    var numA = readLine()!!.toInt()

    print("Informe o segundo número: ")
    var numB = readLine()!!.toInt()

    print("Informe o terceiro número: ")
    var numC = readLine()!!.toInt()

    print("Informe o quarto número: ")
    var numD = readLine()!!.toInt()

    println(maiorNumero(numA,numC,numD) || maiorNumero(numB,numC,numD))
}

fun maiorNumero(num1:Int,num2:Int,num3:Int):Boolean {
    return (num1 > num2) && (num1 > num3)
}