// CompanionObjects/CompanionEx2.kt
package companionObjectsExercise2

import atomictest.*

interface BoardGame {
    fun move(): Boolean

    companion object {
        fun createBoard() {
            trace("BoardGame.createBoard()")
        }
    }
}

interface GameFactory {
    fun create(): BoardGame
}

class Checkers private constructor() : BoardGame {
    private var moves = 0

    companion object Factory : GameFactory {
        const val max = 3
        override fun create() = Checkers()
    }

    override fun move(): Boolean {
        trace("move ${moves++}")
        return moves != max
    }
}

class Chess private constructor() : BoardGame {
    private var moves = 0

    companion object Factory : GameFactory {
        const val max = 3
        override fun create() = Chess()
    }

    override fun move(): Boolean {
        trace("move ${moves}")
        return ++moves != max
    }
}

fun playGame(factory: GameFactory) {
    val s = factory.create()
    while (s.move())
    ;
}

fun main() {
/*
  playGame(Checkers.Factory)
  playGame(Chess.Factory)
  trace eq """
  BoardGame.createBoard()
  Checkers move 0
  Checkers move 1
  Checkers move 2
  BoardGame.createBoard()
  Chess move 0
  Chess move 1
  Chess move 2
  Chess move 3
  """
*/
}