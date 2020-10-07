fun main(){
    var animais = arrayListOf<String>("Pato","Cachorro","Gato")

    //println("Animal da posição 3: ${animais[3]}")

    try{
        println("Animal da posição 3: ${animais[3]}")
    } catch (e:IndexOutOfBoundsException) {
        println("Impossível acessar esta posição no vetor")
        println(e.message)
    }
}