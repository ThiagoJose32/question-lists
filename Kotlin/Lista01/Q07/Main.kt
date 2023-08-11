package Lista01.Q07

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var salario:Float
    var imposto:Int

    print("Digite o salário: ")
    salario = scanner.nextFloat()

    if(salario > 5000.01) {
        imposto = 30
    } else if (salario > 3500.01) {
        imposto = 22
    } else if (salario > 2000.01) {
        imposto = 15
    } else {
        imposto = 0
    }

    println("Imposto: $imposto%")
}