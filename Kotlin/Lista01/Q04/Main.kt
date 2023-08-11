package Lista01.Q04

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var numeros = ArrayList<Int>()
    var numeroMaior = 0

    for(num in 1..2) {
        print("Digite o número: ");
        numeros.add(scanner.nextInt())
    }

    for(num in numeros) {
        if(numeroMaior < num) {
            numeroMaior = num
        }
    }
    print("Maior número: $numeroMaior")

}