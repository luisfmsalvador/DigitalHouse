class Prova(val dificuldade: Int,val energiaNecessaria: Int) {

    fun realizarProva(atleta: Atleta):Boolean {
        if (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria) {
            atleta.energia -= energiaNecessaria
            return true
        } else {
            return false
        }
    }
}