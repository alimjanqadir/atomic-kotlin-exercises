// NestedClasses/NestedEx4.kt
package nestedClassesExercise4

import atomictest.eq
import nestedClassesExercise4.Seat.*

abstract class Seat {
    class Coach : Seat() {
        override fun upgrade() = Premium()
        override fun meal() = "Bag Meal"
    }

    class Premium : Seat() {
        override fun upgrade() = Business()
        override fun meal() = "Bag Meal with Cookie"
    }

    class Business : Seat() {
        override fun upgrade() = First()
        override fun meal() = "Hot Meal"
    }

    class First : Seat() {
        override fun upgrade() = First()
        override fun meal() = "Private Chef"
    }

    abstract fun upgrade(): Seat
    abstract fun meal(): String

    override fun toString() = "${this::class.simpleName}"
}

class Ticket(
        val name: String,
        val seat: Seat = Coach()
) {
    fun upgrade(): Seat {
        return seat.upgrade()
    }

    fun meal(): String {
        return seat.meal()
    }

    override fun toString() = "$seat"
}

fun main() {
    val tickets = listOf(
            Ticket("Jerry"),
            Ticket("Summer", Seat.Premium()),
            Ticket("Squanchy", Seat.Business()),
            Ticket("Beth", Seat.First())
    )
    tickets.map(Ticket::meal) eq
            "[Bag Meal, Bag Meal with Cookie, " +
            "Hot Meal, Private Chef]"
    tickets.map(Ticket::upgrade) eq
            "[Premium, Business, First, First]"
    tickets eq
            "[Coach, Premium, Business, First]"
    tickets.map(Ticket::meal) eq
            "[Bag Meal, Bag Meal with Cookie, " +
            "Hot Meal, Private Chef]"
}