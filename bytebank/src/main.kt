fun main() {
    println("Bem vindo ao Bytebank")

    val contaGustavo = Conta(titular = "Gustavo", numero = 1000)
    contaGustavo.deposita(500.0)

    val contaMolina = Conta(numero = 1001, titular = "Molina")
    contaMolina.deposita(800.0)

    println(contaMolina.titular)
    println(contaMolina.numero)
    println(contaMolina.saldo)

    println(contaGustavo.titular)
    println(contaGustavo.numero)
    println(contaGustavo.saldo)

    println("Depositando na conta do Gustavo")
    contaGustavo.deposita(50.0)
    println(contaGustavo.saldo)

    println("Depositando na conta do Molina")
    contaMolina.deposita(70.0)
    println(contaMolina.saldo)

    println("Sacando na conta do Gustavo")
    contaGustavo.saca(250.0)
    println(contaGustavo.saldo)

    println("Sacando na conta do Molina")
    contaMolina.saca(100.0)
    println(contaMolina.saldo)

    println("Saque em excesso na conta do Gustavo")
    contaGustavo.saca(100.0)
    println(contaGustavo.saldo)

    println("Saque em excesso na conta do Molina")
    contaMolina.saca(500.0)
    println(contaMolina.saldo)

    println("Transferência da conta do Molina para o Gustavo")

    if (contaMolina.transfere(destino = contaGustavo, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaGustavo.saldo)
    println(contaMolina.saldo)
}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
        val titular: String = "Alex $i"
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