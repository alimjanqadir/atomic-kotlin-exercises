// LocalFunctions/Task1.kt
package localFunctionsExercise1
import atomictest.eq

fun f(): Int {
  fun g() = 47

  return g()
}

fun main() {
  f() eq 47
}