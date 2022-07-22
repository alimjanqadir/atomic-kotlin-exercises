// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var maxValue = 0
  for(item in list) {
    if(item > maxValue) maxValue = item
  }
  return maxValue
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}