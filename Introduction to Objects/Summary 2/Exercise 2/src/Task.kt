// Summary2/Task2.kt
package summaryIIExercise2
import atomictest.eq

// add Boring2 class
class Boring2(val a: Double = 1.618, val b: String = "ratio", val c: Int = 11) {
  fun a() = a
  fun b() = b
  fun c() = c
}

fun main() {
  val boring = Boring2()
  boring.a() eq 1.618
  boring.b() eq "ratio"
  boring.c() eq 11
}