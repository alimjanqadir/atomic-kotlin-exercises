// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(content: String) {
    var i = 0
    while(i < content.length) {
        println(content[i])
        i += 1
    }
}

fun main() {
  displayContent("abc")
}
/* Expected output:
a
b
c
*/