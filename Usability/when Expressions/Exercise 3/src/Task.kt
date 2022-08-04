// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var unMatchCounter = 0
  for(ch in input) {
    when (ch) {
      '(' -> unMatchCounter += 1
      ')' -> unMatchCounter -= 1
      ' ' -> continue
      else -> throw IllegalArgumentException()
    }
    if(unMatchCounter < 0) return false
  }
  return unMatchCounter == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}