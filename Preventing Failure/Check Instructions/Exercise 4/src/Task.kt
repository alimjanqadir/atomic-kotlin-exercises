// CheckInstructions/CheckInstructionsSoln4.kt
package checkInstructionsExercise4

import atomictest.*

class Tank(val capacity: Double) {
    var level: Double = 0.0
    val safetyGap = 0.02 * capacity
    val maxLevel: Double = capacity - safetyGap

    fun add(quantity: Double): Double {
        require(0 < quantity) {
            "quantity must be > 0, is $quantity"
        }

        var remainder = 0.0
        val total = level + quantity
        if (total <= maxLevel) {
            level += quantity
        } else {
            remainder = total - maxLevel
            level += maxLevel
        }
        check(level > 0) {
            "Incorrect level: $level"
        }

        check(level <= maxLevel) {
            "Safety level exceeded: $maxLevel"
        }

        check(remainder >= 0.0) {
            "Remainder is negative: $remainder"
        }
        return remainder
    }

    fun drain(quantity: Double) {
        require(0 < quantity) {
            "quantity must be > 0, is $quantity"
        }
        require(quantity <= level) {
            "rain exceeds tank amount: $quantity"
        }
        level -= quantity
        check(level >= 0.0) {
            "drain exceeds tank amount: $level"
        }
    }

}

fun main() {
/*
  val tank = Tank(100.0)
  tank.add(100.0) eq 2.0
  tank.level eq 98.0
  tank.drain(98.0)
  tank.level eq 0.0
  capture { tank.add(-1.0) } eq
    "IllegalArgumentException: " +
    "quantity must be > 0, is -1.0"
  capture { tank.drain(-7.0) } eq
    "IllegalArgumentException: " +
    "quantity must be > 0, is -7.0"
  capture { tank.drain(1.0) } eq
    "IllegalArgumentException: " +
    "drain exceeds tank amount: 1.0"
*/
}