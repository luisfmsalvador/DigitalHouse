fun main(){
    var alunos = ArrayList<Aluno>()

    alunos.add(Aluno("Luis",123))
    alunos.add(Aluno("Fernando",456))
    alunos.add(Aluno("Mateus",789))

    var alunoPesquisa = Aluno("Salvador",123)

    println(alunos.contains(alunoPesquisa))
}