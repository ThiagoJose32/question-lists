package Lista02.Q06

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var idades = ArrayList<Int>()
    var indice:Int
    do {
        print("Digite a idade: ")
        idades.add(scanner.nextInt())
        indice = idades.size
    } while (idades[indice-1] != -1)
    print("FIM")
}