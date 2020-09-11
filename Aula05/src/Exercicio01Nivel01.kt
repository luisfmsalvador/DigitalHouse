fun main() {
    print("Infomre o seu sexo: ")
    var sexo = readLine()!!.toUpperCase()

    when (sexo) {
        "F" -> print("Feminino")
        "M" -> print("Masculino")
        else -> print("Sexo inválido")
    }
}