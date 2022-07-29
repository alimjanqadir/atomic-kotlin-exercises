// Summary2/Task4.kt
package summaryIIExercise4
import java.lang.IllegalArgumentException

class Dictionary {
    val translations: Map<String, List<String>>
    get() = _translations

    private val _translations = mutableMapOf<String, List<String>>()
    fun addTranslations(word: String, translations: String) {
        if(_translations.containsKey(word))
            throw IllegalArgumentException("Dictionary already has translations for '$word'")

        _translations[word] = translations.split(" ")
    }
}

fun main() {
/*
  val dictionary = Dictionary()
  dictionary.addTranslations("apple", "Apfel")
  dictionary.addTranslations("cake", "Kuchen Torte")

  dictionary.translations eq mapOf("apple" to listOf("Apfel"),
    "cake" to listOf("Kuchen", "Torte"))

  capture {
    dictionary.addTranslations("cake", "Törtchen")
  } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"
*/

  // shouldn't compile:
//  dictionary.translations.remove("apple")
}