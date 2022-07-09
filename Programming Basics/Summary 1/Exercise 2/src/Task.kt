// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var result = ""
  for(i in s.indices step 2) {
    result += s[i]
  }
  return result
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/