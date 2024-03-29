// NothingType/NothingTypeSoln1.kt
package theNothingTypeExercise1

import atomictest.*

class Failure(val msg: String) : Exception("Failure: $msg")

fun fail(msg: String): Nothing {
    trace(msg)
    throw Failure(msg)
}

fun require(test: Boolean) {
    if (!test) fail("require() failed")
}

fun check(test: Boolean) {
    if (!test) fail("check() failed")
}

fun main() {
    require(true)
    check(true)
    capture {
        require(false)
    } eq "Failure: require() failed"
    capture {
        check(false)
    } eq "Failure: check() failed"
    trace eq """
    require() failed
    check() failed
  """
}