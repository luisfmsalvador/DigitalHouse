class Cliente(val nome:String, val sobrenome:String) {
    var nomeCompleto: String

    init {
        nomeCompleto = nome + " " + sobrenome
    }
}