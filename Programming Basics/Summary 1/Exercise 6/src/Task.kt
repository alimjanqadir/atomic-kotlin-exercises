// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var i = 1
  for(ch in s) {
    if(i % 5 == 0 && ch != ' ') {
      println(ch)
    }
    if(ch != ' ') i += 1
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
/* Output:
e
k
*/