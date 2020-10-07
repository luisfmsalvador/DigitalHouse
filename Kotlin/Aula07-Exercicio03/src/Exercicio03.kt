fun main(){
    var atletaA = Atleta("José da Silva", 100, 85)
    var atletaB = Atleta("Carlos Oliveira", 80, 100)

    var maratona = Prova(85, 100)
    var meiaMaratona = Prova(45, 50)
    var marchaAtletica = Prova(100, 30)

    if (maratona.realizarProva(atletaA)) {
        println("Atleta ${atletaA.nome} irá realizar a maratona. Sua energia está em ${atletaA.energia}")
    } else {
        println("Atleta ${atletaA.nome} não tem energia suficiente para realizar a maratona")
    }

    if (maratona.realizarProva(atletaB)) {
        println("Atleta ${atletaB.nome} irá realizar a maratona. Sua energia está em ${atletaB.energia}")
    } else {
        println("Atleta ${atletaB.nome} não tem energia suficiente para realizar a maratona")
    }

    if (meiaMaratona.realizarProva(atletaA)) {
        println("Atleta ${atletaA.nome} irá realizar a maratona. Sua energia está em ${atletaA.energia}")
    } else {
        println("Atleta ${atletaA.nome} não tem energia suficiente para realizar a maratona")
    }

    if (meiaMaratona.realizarProva(atletaB)) {
        println("Atleta ${atletaB.nome} irá realizar a maratona. Sua energia está em ${atletaB.energia}")
    } else {
        println("Atleta ${atletaB.nome} não tem energia suficiente para realizar a maratona")
    }

    if (marchaAtletica.realizarProva(atletaA)) {
        println("Atleta ${atletaA.nome} irá realizar a maratona. Sua energia está em ${atletaA.energia}")
    } else {
        println("Atleta ${atletaA.nome} não tem energia suficiente para realizar a maratona")
    }

    if (marchaAtletica.realizarProva(atletaB)) {
        println("Atleta ${atletaB.nome} irá realizar a maratona. Sua energia está em ${atletaB.energia}")
    } else {
        println("Atleta ${atletaB.nome} não tem energia suficiente para realizar a maratona")
    }

}