package Lista02.Q07

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var numeros = ArrayList<Int>()
    var qtdNumeros:Int
    var maiorNumero:Int

    print("Quantos numeros deseja adicionar? ")
    qtdNumeros = scanner.nextInt()
    for (num in 1..qtdNumeros) {
        print("Digite o numero: ")
        numeros.add(scanner.nextInt())
    }

    maiorNumero = numeros[0]
    for (num in numeros) {
        if (maiorNumero < num) {
            maiorNumero = num
        }
    }

    print("Maior numero: $maiorNumero")
}