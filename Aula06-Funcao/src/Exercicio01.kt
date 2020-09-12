import kotlin.random.Random

fun main(){
    print(soma(Random.nextInt(1, 10), Random.nextInt(1, 10), Random.nextInt(1, 10)))
}

fun soma(numero1:Int,numero2:Int,numero3:Int):Int = numero1 + numero2 + numero3