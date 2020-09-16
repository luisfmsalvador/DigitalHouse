class SessaoDeTreinamento() {
    var experiencia: Int = 0

    fun treinarA(jogador:JogadorDeFutebol){
        println("Iniciando o treinamento do jogador ${jogador.nome}")
        experiencia = jogador.experiencia
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("A experiência do jogador foi evoluída de ${jogador.experiencia} para ${++experiencia}")

        jogador.experiencia = experiencia
    }
}