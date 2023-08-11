package Lista01.Q06

import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var n1:Int
    var n2:Int
    var operador:Char

    print("Digite o numero: ")
    n1 = scanner.nextInt()
    print("Digite o operador (+, -, * ou /: ")
    operador = scanner.next().single()
    print("Digite o numero: ")
    n2 = scanner.nextInt()

    var resultado = when(operador) {
        '+' -> n1+n2
        '-' -> n1-n2
        '*' -> n1*n2
        '/' -> n1/n2
        else -> "Operador inválido!"
    }
    if(resultado == "Operador inválido!") {
        print(resultado)
    } else {
        print("Resultado: $n1 $operador $n2 = $resultado")
    }
}
