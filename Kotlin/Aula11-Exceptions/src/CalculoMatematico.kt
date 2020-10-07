import java.lang.ArithmeticException

class CalculoMatematico {
    fun divisao(dividendo:Int,divisor:Int):Int{
        if (divisor == 0) {
            throw ArithmeticException("Divisão por zero não permitida")
        } else {
            return dividendo / divisor
        }
    }
}