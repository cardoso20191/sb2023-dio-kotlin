fun main() {

    
    //print("Informe o saldo atual: ")
    val saldoAtual = readLine()!!.toFloat()

    //print("Informe o valor do deposito: ")
    val valorDeposito = readLine()!!.toFloat()

    //print("Informe o valor da retirada: ")
    val valorRetirada = readLine()!!.toFloat()

    val saldoAtualizado = saldoAtual + valorDeposito - valorRetirada

    val saldoFormatado = String.format("%.1f0", saldoAtualizado)
    
    println("Saldo atualizado: R$$saldoFormatado")

    }

