// ManipulatingLists/Task2.kt
package manipulatingListsExercise2
import atomictest.eq

fun <T> List<T>.zipWithIndex(): List<Pair<T, Int>> =
  mapIndexed{i, e -> e to i}

fun main() {
  val list = listOf('a', 'b', 'c')
  list.zipWithIndex() eq
    "[(a, 0), (b, 1), (c, 2)]"
}