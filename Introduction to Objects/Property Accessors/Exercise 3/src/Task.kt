// PropertyAccessors/Task3.kt
package propertyAccessorsExercise3
import atomictest.eq

class MessageStorage {
    private val _messages = mutableListOf<String>()
    public val messages: List<String>
        get() {
            return _messages
        }

    public fun addMessage(message: String) {
        _messages.add(message)
    }

}

fun main() {
/*
  val messageStorage = MessageStorage()
  messageStorage.addMessage("first")
  messageStorage.addMessage("second")
  messageStorage.messages eq listOf("first", "second")
  // doesn't compile:
//  messageStorage.messages.remove("first")
*/
}