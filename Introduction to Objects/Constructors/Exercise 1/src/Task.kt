// Constructors/Task1.kt
package constructorsExercise1

class Floating(val d: Double) {
  override fun toString() = "$d"
}

fun main() {
  println(Floating(1.0))
}