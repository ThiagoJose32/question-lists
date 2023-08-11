package Lista02.Q05

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var numeros = ArrayList<Int>()
    var qtdNumero = 5
    var menorNumero:Int

    for(num in 1..qtdNumero) {
        print("Digite o numero $num"+"º numero: ")
        numeros.add(scanner.nextInt())
    }

    menorNumero = numeros[0]
    for(num in numeros) {
        if(menorNumero > num) {
            menorNumero = num
        }
    }
    print("Menor numero: $menorNumero")
}