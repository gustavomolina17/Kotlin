fun main() {
    println("Bem vindo ao ByteBank")
    
    val contaMolina = Conta()
    contaMolina.titular = "Molina"
    contaMolina.numero = 1010
    contaMolina.saldo = 1000000.0

    val contaGustavo = Conta()
    contaGustavo.titular = "Gustavo"
    contaGustavo.numero = 1012
    contaGustavo.saldo = 5000.0

    println(contaGustavo.titular)
    println(contaGustavo.numero)
    println(contaGustavo.saldo)

    println(contaMolina.titular)
    println(contaMolina.numero)
    println(contaMolina.saldo)

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaLacos(){
    var i = 0
    while(i < 3){
        val titular: String = "Molina $i"

            i++
        }

for (i in 3 downTo 1) {
    val titular: String = "Molina $i"
    val numeroConta: Int = 1000 + i
    var saldo = i + 10.0

    println("titular $titular")
    println("número da conta $numeroConta")
    println("saldo da conta $saldo")
    println()
}
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("conta é positiva")
    } else if (saldo == 0.0) {
        println("conta é neutra")
    } else {
        println("conta é negativa")
    }
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}

