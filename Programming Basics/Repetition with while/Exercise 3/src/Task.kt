// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var i = 0
  var sum = 0
  while(i <= n) {
    if(i % 2 == 0) sum += i
    i += 1
  }
  return sum
}

fun main() {
  println(sumOfEven(10))  // 30
}