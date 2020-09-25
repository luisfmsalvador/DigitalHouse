fun main() {
    val AC = Estado("AC", "Acre")
    val AL = Estado("AL","Alagoas")
    val AP = Estado("AP", "Amapá")
    val AM = Estado("AM","Amazonas")
               // """BA","CE","ES","GO","MA","MT","MS","MG","PA",
                 //                   "PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO","DF")
    val estados = listOf<Estado>(AC,AL,AP,AM)

    val pessoa1 = Pessoa("Luis",AC)
    val pessoa2 = Pessoa("Pedro",AL)
    val pessoa3 = Pessoa("Josias",AC)
    val pessoa4 = Pessoa("Joao",AM)
    val pessoa5 = Pessoa("Lucas",AP)
    val pessoa6 = Pessoa("Miguel",AP)
    val pessoas = listOf<Pessoa>(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6)

    var agrupamento = mutableMapOf<Estado,MutableList<Pessoa>>()

    print(pessoas.groupBy { it.estado })
}