fun main() {
    println("Bem vindo ao ByteBank");
    val titular = "Gustavo Molina";
    val numeroConta = 1208;
    var saldo = 5000.0;
    saldo += 3000;
    // saldo = 0.0;
    //saldo -=10000;

    println("Titular da conta: $titular");
    println("Nº da Conta: $numeroConta");
    println("Saldo: $saldo");

    when {
        saldo > 0.0 -> println("Conta é Positiva");
        saldo == 0.0 -> println("Conta é Neutra");
        else -> println("Conta é Negativa");
    }
}