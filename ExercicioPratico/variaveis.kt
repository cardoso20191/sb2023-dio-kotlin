fun main() {
    var a: String = "initial"
        println(a)
        a = "final"
        println(a)  //a é uma váriavel multavel por isso ele pode ser reatribuído
            val b: Int = 1
            val c = 3 //Inferencia do próprio kotlin, ele entende o tipo de dado utilizado e atribui o tipo
        println(b) // as variaveis b e c é do tipo val, ou seja ela é do tipo imutavel não podendo ser reatribuída.
        println(c)
}