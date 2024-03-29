// ExtensionFunctions/Task2.kt
package extensionFunctionsExercise2

import atomictest.eq

fun Int.isOdd(): Boolean = this xor 1 == this - 1

fun Int.isEven(): Boolean = !this.isOdd()

fun main() {
    1.isOdd() eq true
    2.isEven() eq true
    13.isEven() eq false
}