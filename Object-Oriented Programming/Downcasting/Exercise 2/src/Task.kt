// DownCasting/DownCastEx2.kt
package downcastingExercise2
import downcasting.*
import atomictest.eq

val group: List<Creature> = listOf(
        Human(), Human(), Dog(), Alien(), Dog()
)

fun main() {
    downcasting.group
            .filterIsInstance<Dog>()
            .map(Dog::bark)
    downcasting.group
            .filterIsInstance(Dog::class.java)
            .map(Dog::bark)
}