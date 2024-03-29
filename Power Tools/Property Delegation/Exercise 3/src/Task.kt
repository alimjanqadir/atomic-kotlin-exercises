// PropertyDelegation/PropDelegationSoln4.kt
package propertyDelegationExercise3

import atomictest.eq
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Holder<E>: ReadWriteProperty<Holders, List<E>> {
    private var list = listOf<E>()

  override operator fun getValue(thisRef: Holders, property: KProperty<*>): List<E> = list

  override operator fun setValue(thisRef: Holders, property: KProperty<*>, value: List<E>) {
    list = value
  }
}

class Holders {
    var strings by Holder<String>()
    var ints by Holder<Int>()
    var bools by Holder<Boolean>()
}

fun main() {
/*
  val x = Holders()
  x.strings = listOf("99", "17")
  x.strings eq "[99, 17]"
  x.ints = listOf(12, 23, 34, 45)
  x.ints eq "[12, 23, 34, 45]"
  x.bools = listOf(true, true, false, true)
  x.bools eq "[true, true, false, true]"
*/
}