// InKeyword/Task2.kt
package theInKeywordExercise2

fun sumOfEven(n: Int): Int {
  var s = 0
  for(i in 0..n step 2) {
    s += i
  }
  return s
}

fun main() {
  println(sumOfEven(10))  // 30
}