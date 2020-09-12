fun main() {
    var array = Array(5, {i->0.0})
    for (num in 0..4) {
        print("Informe a sua altura: ")
        array[num] = readLine()!!.toDouble()
    }

    array.reverse()
    for (num in array) {
        println(num)
    }
}