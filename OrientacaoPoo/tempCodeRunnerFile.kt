fun main() {
    print("Informe o saldo atual: ")
    val saldoAtual = readLine()!!.toFloat()

    print("Informe o valor do depósito: ")
    val valorDeposito = readLine()!!.toFloat()

    print("Informe o valor da retirada: ")
    val valorRetirada = readLine()!!.toFloat()

    val saldoAtualizado = saldoAtual + valorDeposito - valorRetirada

    println("Saldo atualizado: %.1f".format(saldoAtualizado))
}