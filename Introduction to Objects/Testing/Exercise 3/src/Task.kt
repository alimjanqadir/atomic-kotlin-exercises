// Testing/Task3.kt
package testingExercise3
import atomictest.eq

fun squareArea(x: Int) = x * x

fun rectangleArea(x: Int, y: Int) = x * y

fun trapezoidArea(x: Int, y: Int, h: Int): Double = (x + y) / 2.0 * h

fun main() {
  squareArea(1) eq 1
  squareArea(2) eq 4
  squareArea(5) eq 25
  // add more tests
  rectangleArea(5, 4) eq 20
  trapezoidArea(5, 8, 6) eq 39
}