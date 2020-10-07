fun main(){
    var array1 = arrayOf(1, 3, 5, 7, 9)
    var array2 = arrayOf(0, 2, 4, 6, 8)
    var array3 = arrayListOf<Int>()
    for(index in 0..4){
        array3.add(array1[index])
        array3.add(array2[index])
    }
    println(array3)
}