// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(val limit: Int) {
    private val _container = mutableListOf<Any>()
    val size: Int
    get() = _container.size

    val full: Boolean
        get() = size == limit

    fun add(any: Any) {
        if(full) throw IllegalStateException("The container is full")
        _container += any
    }
}

fun main() {
/*
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
*/
}