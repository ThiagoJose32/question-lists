package Lista02.Q08

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var numeros = ArrayList<Int>()
    var qtdNumeros:Int
    var qtdPares = 0
    var qtdImpares = 0

    print("Quantos numeros deseja adicionar? ")
    qtdNumeros = scanner.nextInt()

    for (num in 1..qtdNumeros) {
        print("Digite o numero: ")
        numeros.add(scanner.nextInt())
    }

    for (num in numeros) {
        if (num % 2 == 0) {
            qtdPares++
        } else {
            qtdImpares++
        }
    }

    println("Quantidade de pares: $qtdPares")
    print("Quantidade de impares: $qtdImpares")
}