// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(title: String, vararg numbers: Int) {
    println("$title${numbers.toList()}")
}

fun main() {
//  printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */