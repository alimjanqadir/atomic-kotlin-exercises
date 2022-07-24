// Varargs/Task3.kt
package variableArgumentListsExercise3
import atomictest.eq

fun listOfChunks(size: Int, vararg elements: String): List<List<String>> {
  val result = mutableListOf<List<String>>()
  var chunk = mutableListOf<String>()
  for((i, ch) in elements.withIndex()) {
    if(i > 0 && i % size == 0) {
      result.add(chunk)
      chunk = mutableListOf()
    }
    chunk.add(ch)
  }
  result.add(chunk)
  return result
}

fun main() {
  val chunks = listOfChunks(3, "a", "b", "c", "d", "e", "f", "g")
  chunks eq listOf(listOf("a", "b", "c"), listOf("d", "e", "f"), listOf("g"))
}