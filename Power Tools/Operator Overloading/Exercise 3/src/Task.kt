// OperatorOverloading/OpOverloadingSoln3.kt
package operatorOverloadingExercise3

import atomictest.*

class Repository<T>(val initSize: Int = 0) {
    private val list = mutableListOf<T>()

    operator fun plusAssign(item: T) {
        list += item
    }

    operator fun set(index: Int, item: T) {
        require(index >= 0 && index < list.size)
        requireNotNull(list[index])
        list[index] = item
    }

    operator fun get(index: Int): T {
        require(index >= 0 && index < list.size)
        requireNotNull(list[index])
        return list[index]
    }

    override fun toString() = "$list"

}

fun main() {
/*
  val r = Repository<Int>(5)
  (1..7).forEach {
    r += it * 10
    trace(r)
  }
  trace("r[4]: ${r[4]}")
  r[4] = 99
  trace("r[4]: ${r[4]}")
  trace(r)
  capture { r[7] } eq
    "IllegalArgumentException: get() " +
    "index 7 out of range"
  capture { r[7] = 100 } eq
    "IllegalArgumentException: set() " +
    "index 7 out of range"
  val r2 = Repository<Int>(5)
  capture { r2[3] } eq
    "IllegalArgumentException: get() " +
    "accessing null element"
  capture { r2[3] = 100 } eq
    "IllegalArgumentException: set() " +
    "accessing null element"
  trace eq """
    10, null, null, null, null
    10, 20, null, null, null
    10, 20, 30, null, null
    10, 20, 30, 40, null
    10, 20, 30, 40, 50
    10, 20, 30, 40, 50, 60
    10, 20, 30, 40, 50, 60, 70
    r[4]: 50
    r[4]: 99
    10, 20, 30, 40, 99, 60, 70
  """
*/
}