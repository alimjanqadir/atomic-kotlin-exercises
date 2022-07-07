// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(a: Int, b: Int) = a + b

fun g(a: String, b: String) = a + b

fun h() = println("h()")

fun main() {
  val f: Int = f(1, 2)
  val g: String = g("a", "b")
  val h: Unit = h()
  println("Int")
  println("String")
  println("Unit")
}