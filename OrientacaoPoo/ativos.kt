fun main() {
    //println("Informe a quantidade de ativos:")
    val quantidadeAtivos = readLine()?.toIntOrNull()

    if (quantidadeAtivos == null || quantidadeAtivos <= 0) {
        //println("Quantidade de ativos inválida.")
        return
    }

    val ativos = mutableListOf<String>()

    for (i in 1..quantidadeAtivos) {
        //println("Informe o tipo do ativo ${i}:")
        val ativo = readLine()
        if (ativo != null && ativo.isNotBlank()) {
            ativos.add(ativo)
        } else {
            //println("Tipo de ativo inválido. Pulando para o próximo.")
        }
    }

    if (ativos.isEmpty()) {
        //println("Nenhum ativo informado.")
        return
    }

    ativos.sort()

    for (ativo in ativos) {
        println(ativo)
    }
}
