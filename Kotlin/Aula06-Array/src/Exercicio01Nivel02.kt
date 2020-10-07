fun main() {
    val array = Array(6, {i -> 0})
    var totalVotos = 0

    println("Qual o melhor Sistema Operacional para uso em servidores?")
    println("As possíveis respostas são:")
    println("\t1- Windows Server")
    println("\t2- Unix")
    println("\t3- Linux")
    println("\t4- Netware")
    println("\t5- Mac OS")
    println("\t6- Outro")

    do{
        println("Qual o seu voto? (Para sair digite 0)")
        var voto = readLine()!!.toInt()
        when {
            voto == 0 -> break
            voto < 0 || voto > 6 -> println("Atenção, o voto tem que ser entre 1 e 6")
            else -> {
                array[voto - 1]++
                totalVotos++
            }
        }
    } while(true)

    println("Sistema Operacional \tVotos \t%")
    println("------------------- \t----- \t---")
    println("Windows Server      \t${array[0]}     \t" + "%.2f".format((array[0]/totalVotos.toDouble())*100) + "%")
    println("Unix                \t${array[1]}     \t" + "%.2f".format((array[1]/totalVotos.toDouble())*100) + "%")
    println("Linux               \t${array[2]}     \t" + "%.2f".format((array[2]/totalVotos.toDouble())*100) + "%")
    println("Netware             \t${array[3]}     \t" + "%.2f".format((array[3]/totalVotos.toDouble())*100) + "%")
    println("Mac OS              \t${array[4]}     \t" + "%.2f".format((array[4]/totalVotos.toDouble())*100) + "%")
    println("Outro               \t${array[5]}     \t" + "%.2f".format((array[5]/totalVotos.toDouble())*100) + "%")
}
