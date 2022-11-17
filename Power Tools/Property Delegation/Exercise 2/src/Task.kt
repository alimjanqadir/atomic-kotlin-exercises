// PropertyDelegation/PropDelegationSoln3.kt
package propertyDelegationExercise2

import atomictest.eq
import kotlin.reflect.KProperty

class Delegator {
    var strings: List<String> by List(8) { "$it" } // replace with 'by list'
}

operator fun List<String>.setValue(thisRef: Delegator, property: KProperty<*>, value: List<String>) {
    thisRef.strings = value
}

operator fun List<String>.getValue(thisRef: Delegator, property: KProperty<*>): List<String> = thisRef.strings

fun main() {
    val x = Delegator()
    x.strings eq "[0, 1, 2, 3, 4, 5, 6, 7]"
    x.strings = listOf("99", "17")
    x.strings eq "[99, 17]"
}