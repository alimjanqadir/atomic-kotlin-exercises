// IfExpressions/Task1.kt
package ifExpressionsExercise1

fun checkSign(number: Int): String =
  if(number < 0)
    "negative"
  else if (number > 0)
    "positive"
  else
    "zero"

fun main() {
  println(checkSign(-19))  // negative
}