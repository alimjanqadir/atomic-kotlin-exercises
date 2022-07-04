// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var sum = 0
  var i = 0
  while(i <= number) {
    sum += i
    i += 1
  }

  return sum
}

fun main() {
  println(sum(10))  // 55
}