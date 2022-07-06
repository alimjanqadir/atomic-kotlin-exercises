// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(ch: Char): Boolean =
        ch in 'a'..'z' || ch in 'A'..'Z'
                || ch in '0'..'9' || ch == '_'

fun isValidIdentifier(s: String): Boolean {
    if(s.isEmpty() || s.first() in '0'..'9') return false
    for(ch in s) {
        if(!isValidIdentifier(ch)) return false
    }
    return true
}

fun main() {
  println(isValidIdentifier("name"))  // true
  println(isValidIdentifier("0name"))  // false
}