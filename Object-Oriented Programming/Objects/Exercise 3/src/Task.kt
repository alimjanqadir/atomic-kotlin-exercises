// Objects/ObjectEx3.kt
package objectsExercise3

import atomictest.*

interface AdventureGame {
    interface Environment
    interface Character

    val environment: Environment
    val characters: MutableList<Character>
    fun populate()
}

class Jungle : AdventureGame.Environment {
    object Factory {
        fun create() = Jungle()
    }
}

class Monkey : AdventureGame.Character {
    object Factory {
        fun create() = Monkey()
    }
    override fun toString() = "${Monkey::class.simpleName}"
}

class Snake : AdventureGame.Character {
    object Factory {
        fun create() = Snake()
    }
}

object MonkeysVsSnakes : AdventureGame {
    override val environment = Jungle.Factory.create()
    override val characters =
            mutableListOf<AdventureGame.Character>()

    override fun populate() {
      characters += Monkey.Factory.create()
      characters += Snake.Factory.create()
    }
}

fun main() {
    MonkeysVsSnakes.populate()
    MonkeysVsSnakes.characters eq
            "[Monkey, Snake]"
}