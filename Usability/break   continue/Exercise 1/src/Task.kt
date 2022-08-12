// BreakAndContinue/Task1.kt
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
    var sum = 0
    for(s in n) {
        when (val number = s.toIntOrNull()) {
            0 -> {
                trace("Sum: $sum")
                break
            }
            null -> {
                trace("Not a number: $s")
                continue
            }
            else -> sum += number
        }
    }
}

fun main() {
    readNumbers("1", "a", "3", "10", "0", "19")
    trace eq """
    Not a number: a
    Sum: 14
  """
}
