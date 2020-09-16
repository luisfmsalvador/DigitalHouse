class JogadorDeFutebol(var nome:String, var energia: Int, var experiencia: Int) {
    var alegria: Int
    var gols: Int

    init {
        alegria = 0
        gols = 0
    }

    fun fazerGol() {
        energia = energia - 5
        alegria = alegria + 10
        gols++

        println("GOOOOL!")
    }

    fun correr() {
        energia = energia - 10
        println("Cansei")
    }


}