// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var result = ""
  for(char in 'a'..'z') {
    result += char
  }
  return result
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}