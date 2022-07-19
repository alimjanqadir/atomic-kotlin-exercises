// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  sum(1, 2, 3) eq 6
  sum(2, 3, 4) eq 9
  sum(4, 5, 6) eq 15
  sum(7, 8, 9) eq 24
  sum(7, 8, 9) neq 25

}