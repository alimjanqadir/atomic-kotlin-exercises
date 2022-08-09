// NonNullAssertions/Task2.kt
package nonNullAssertionsExercise2
import atomictest.*

 fun List<Int>.headPlusTail(): Triple<Int?, Int?, Int?> {
     if(isEmpty()) return Triple(null, null, null)
     val head = first()
     val tail = lastOrNull()
     return if(tail != null) {
         Triple(head, tail, head + tail)
     } else {
         Triple(head, null, head)
     }
 }

fun main() {
  val ints = mutableListOf<Int>()
    trace(ints.headPlusTail())
  for(i in -2..10) {
      if(i % 2 == 0) {
          ints.add(i)
      }
  }
    trace(ints.headPlusTail())
    ints.headPlusTail()
}