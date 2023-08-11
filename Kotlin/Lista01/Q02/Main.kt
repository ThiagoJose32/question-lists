package Lista01.Q02

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var idade:Int
    var anoAtual:Int

    print("Digite a idade: ")
    idade = scanner.nextInt()

    print("Digite o ano atual: ")
    anoAtual = scanner.nextInt()

    print("Ano de nascimento: " + (anoAtual-idade))
}