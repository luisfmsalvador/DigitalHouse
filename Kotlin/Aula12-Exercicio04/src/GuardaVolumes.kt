class GuardaVolumes(var pecas: MutableMap<Int, List<Peca>>, var contador: Int) {


    fun guardarPecas(listaDePecas:MutableList<Peca>):Int{
        val contador = pecas.size + 1
        pecas.put(contador,listaDePecas)
        return contador
    }

    fun mostrarPecas(){
        cabecalho()

        pecas.forEach{
            print(it.key.toString().padEnd(10))

            it.value.forEach { print("".padEnd(10) + it.marca.padEnd(20)+it.modelo.padEnd(20)+"\n")}
        }
    }

    fun mostrarPecas(numero:Int){
        cabecalho()

        val filteredPecas = pecas.filter { (key, value) -> key.equals(numero)}
        filteredPecas.forEach{
            print(it.key.toString().padEnd(10))

            it.value.forEach { print(it.marca.padEnd(20)+it.modelo.padEnd(20)+"\n")}
        }
    }

    fun devolverPecas(numero: Int){
        pecas.remove(numero)
    }

    fun cabecalho(){
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
        println("Número do guarda-volumes: ${contador}")
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-")
        println("ID".padEnd(10) + "Marca".padEnd(20) + "Modelo".padEnd(20))
    }
}