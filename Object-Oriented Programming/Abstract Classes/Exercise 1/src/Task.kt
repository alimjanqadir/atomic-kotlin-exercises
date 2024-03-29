// Abstract/Task1.kt
package abstractClassesExercise1
import atomictest.trace

abstract class Shape {
  abstract fun draw()
  abstract fun erase()
}

class Circle: Shape() {
  override fun draw() {
    trace("Draw Circle")
  }

  override fun erase() {
    trace("Erase Circle")
  }
}

class Square: Shape() {
  override fun draw() {
    trace("Draw Square")
  }

  override fun erase() {
    trace("Erase Square")
  }
}

class Triangle: Shape() {
  override fun draw() {
    trace("Draw Triangle")
  }

  override fun erase() {
    trace("Erase Triangle")
  }
}

fun main() {
  val shapes = listOf(
    Circle(),
    Square(),
    Triangle(),
  )
/*
  shapes.forEach { it.draw() }
  shapes.forEach { it.erase() }
*/
  trace eq """
    Draw Circle
    Draw Square
    Draw Triangle
    Erase Circle
    Erase Square
    Erase Triangle
  """
}