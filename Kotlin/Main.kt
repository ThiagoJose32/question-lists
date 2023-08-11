import com.sun.source.tree.IfTree
import java.util.Scanner

fun main(args: Array<String>) {
/*
    println("Verificar a idade")
    val diaNascimento:Int = 23 // val define constantes
    var anoAtual:Int = 2023 // Declarando variável com um tipo
    var anoAtuale = 2023 // Declarando uma variável onde o compilador irá inferir seu tipo

    var scanner = Scanner(System.`in`)

    print("Digite um número: ")
    var anoNascimento = scanner.nextInt()

    var idade = anoAtual - anoNascimento
    println("A idade é: $idade")
*/
/*--------------------------------------------
    println("Verificar se número é par ou ímpar")
    print("Digite um número: ")
    var numero = scanner.nextInt()

    if(numero % 2 == 0) {
        println("O número $numero digitado é par")
    } else {
        println("O número $numero é impar")
    }
*/
/*--------------------------------------------
    var lista = arrayOf(1, 2, 3, 4, 5) // Criar array já preenchido
    for(num in lista) { // Para cada item da lista o for vai colocar esse valor na variável 'num'
        println(num)
    }
*/
    for(num in 1..100) { // Vai de 1 a 100 incrementando
        print(num)
    }
    for(num in 100 downTo 1 step 2) { // Vai de 100 a 1 decrementando e pulando de 2 em 2
        print(num)
    }
}