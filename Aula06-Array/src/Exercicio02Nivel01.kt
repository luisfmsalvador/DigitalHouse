fun main() {
    var array = Array(10, { i -> i * 10})

    array.reverse()
    for (num in array) {
        println(num)
    }
}