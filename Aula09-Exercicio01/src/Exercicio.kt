fun main(){
    do {
        var opcao = montaMenu()

        when(opcao){
            1 -> {
            }
        }
    } while(true)
}

fun montaMenu():Int{
    println("*-*-*-*-*-*-*-ESCOLA FELIZ-*-*-*-*-*-*-*")
    println("Escolha a opção desejada:")
    println("1 - Cadastrar professor")
    println("2 - Cadastrar aluno")
    println("3 - Cadastrar matéria")
    println("4 - Cadastrar aula")
    println("5 - Cadastrar curso")
    println("6 - Cadastrar turma")

    return readLine()!!.toInt()
}