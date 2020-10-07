fun main() {
    var jogadorA = JogadorDeFutebol("Ronaldinho Gaúcho", 50, 100)
    var jogadorB = JogadorDeFutebol("Ramiro", 80, 15)

    var treinamento = SessaoDeTreinamento()
    treinamento.treinarA(jogadorA)
    treinamento.treinarA(jogadorB)
}