import kotlin.collections.MutableMap as mapOf

fun main() {
    val peca1 = Pertence("VW", "XPTO")
    val peca2 = Pertence("VW", "R2D2")
    val peca3 = Pertence("FIAT", "PTRT")
    val peca4 = Pertence("FIAT", "PUIW")
    val peca5 = Pertence("FORD", "WQRT")
    val peca6 = Pertence("FORD", "VCTE")

    val listaPecas = listOf<Peca>(peca1,peca2,peca3)
    val pecas = mutableMapOf(1 to listaPecas)

    val guardaVolumes1 = GuardaVolumes(pecas,1)

    guardaVolumes1.mostrarPecas()

    guardaVolumes1.devolverPecas(1)

    guardaVolumes1.mostrarPecas()
}