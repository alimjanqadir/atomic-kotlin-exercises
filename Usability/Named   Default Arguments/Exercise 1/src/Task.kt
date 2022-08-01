// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(
        val side1: Double = 1.0,
        val side2: Double = 2.0,
        val color: String = "yellow"
      ) {

  override fun toString() = "$color rectangle $side1 x $side2"
}

fun main() {
  println(Rectangle())

  val rect1 = Rectangle(side1 = 2.0, side2 = 3.0, color = "green")
  val rect2 = Rectangle(side2 = 2.0, side1 = 3.0, color = "green")
  val rect3 = Rectangle(color = "green", side1 = 2.0, side2 = 3.0)
}