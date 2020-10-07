fun main() {
    var calculoMatematico = CalculoMatematico()

    try {
        print(calculoMatematico.divisao(4,0))
    } catch (e:ArithmeticException){
        println(e.message)
    }
}