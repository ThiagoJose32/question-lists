package Lista01.Q05

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var base:Float
    var altura:Float
    var area:Float
    var perimetro:Float

    print("Digite a base: ")
    base = scanner.nextFloat()
    print("Digite a altura: ")
    altura = scanner.nextFloat()

    area = base * altura
    println("Área: $area")
    perimetro = (base * 2) + (altura * 2)
    print("Perímetro: $perimetro")
}