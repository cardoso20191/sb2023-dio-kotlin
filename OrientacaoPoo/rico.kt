fun main() {
    //println("Informe o saldo total da conta:")
    val saldoTotal = readLine()?.toIntOrNull()

    //println("Informe o valor do saque:")
    val valorSaque = readLine()?.toIntOrNull()

    if (saldoTotal == null || valorSaque == null) {
        //println("Valores invalidos.")
        return
    }

    if (saldoTotal >= valorSaque) {
        val novoSaldo = saldoTotal - valorSaque
        println("Saque realizado com sucesso. Novo saldo: $novoSaldo")
    } else {
        println("Saldo insuficiente. Saque nao realizado!")
    }
}