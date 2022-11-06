// ResourceCleanup/ResourceCleanupSoln1.kt
package resourceCleanupExercise1

import atomictest.trace
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter

val text = """
Swing low, sweet chariot
Coming for to carry me home
""".trim()

fun writeAndRead() {
    val file = File("DataFiles/CleanupSoln1.txt")
    if (file.exists()) {
        file.delete()
    }
    file.createNewFile()
    file.appendText(text)
    trace(file.useLines { it.joinToString("\n") })
    file.forEachLine { trace(it) }
}

fun main() {
    writeAndRead()
    trace eq """
    Swing low, sweet chariot
    Coming for to carry me home
    Swing low, sweet chariot
    Coming for to carry me home
  """
}