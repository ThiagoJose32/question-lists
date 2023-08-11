package Lista01.Q03

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var resultado:Float = 0F

    for(num in 1..3) {
        print("Digite a altura: ");
        resultado = resultado + scanner.nextFloat()
    }

    print("Média: " + resultado/3)
}