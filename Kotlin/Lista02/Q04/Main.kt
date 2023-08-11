package Lista02.Q04

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var numeros = ArrayList<Int>()
    var qtdNumeros = 10
    var maiorNumero:Int

    for(num in 1..qtdNumeros) {
        print("Digite o numero $num"+"º numero: ")
        numeros.add(scanner.nextInt())
    }

    maiorNumero = numeros[0]
    for(num in numeros) {
        if(maiorNumero < num) {
            maiorNumero = num
        }
    }
    print("Maior numero: $maiorNumero")
}