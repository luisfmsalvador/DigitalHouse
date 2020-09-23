fun main() {
    var funcionarios = ArrayList<Funcionario>()

    funcionarios.add(Funcionario("Luis", 123))
    funcionarios.add(Funcionario("Fernando", 789))
    funcionarios.add(Funcionario("Mateus", 456))

    var funcionarioPesquisa = Funcionario("Salvador", 456)
    println(funcionarios.contains(funcionarioPesquisa))
}