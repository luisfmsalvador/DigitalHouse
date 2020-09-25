fun main() {
    val loteriaDosSonhos = mapOf(0 to "Ovos",
                                               1 to "Água",
                                               2 to "Escopeta",
                                               3 to "Cavalo",
                                               4 to "Dentista",
                                               5 to "Fogo")

    val apelidosAmigos = mapOf("João" to listOf("Juan", "Fissura", "Maromba"),
                                                   "Miguel" to listOf("Nigth Watch", "Bruce Wayne", "Tampinha"),
                                                   "Maria" to listOf("Wonder Woman", "Mary", "Marillene"),
                                                   "Lucas" to listOf("Luquinha", "Jorge", "George"))

    loteriaDosSonhos.forEach { println("Key: ${it.key} - value: ${it.value}")}

    apelidosAmigos.forEach{
        print("\nNome: ${it.key} - Apelidos:")
        var virgula = ""
        it.value.forEach {
            print("$virgula ${it}")
            virgula = ","
        }
    }
}