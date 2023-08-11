package Lista01.Q01

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var numero:Int

    print("Digite o numero: ")
    numero = scanner.nextInt()

    if (numero % 2 == 0) {
        print("$numero é Par")
    } else {
        print("$numero é Ímpar")
    }
}