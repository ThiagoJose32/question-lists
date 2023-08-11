package Lista02.Q03

import java.util.Scanner

fun main() {
    var scanner = Scanner(System.`in`)
    var alturas = ArrayList<Float>()
    var media = 0.0
    var qtdAlturas = 5
    for(num in 1..qtdAlturas) {
        print("Digite a idade da pessoa $num: ");
        alturas.add(scanner.nextFloat())
    }
    for(num in alturas) {
        media += num
        println("Valor $num foi adicionado no indice " + alturas.indexOf(num))
    }
    print("Media: " + String.format("%.2f", media/qtdAlturas))
}