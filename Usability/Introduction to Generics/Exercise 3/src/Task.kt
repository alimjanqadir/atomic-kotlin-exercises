// IntroGenerics/Task3.kt
package introductionToGenericsExercise3

import atomictest.eq

class CountingSet<E> {
    private val _map = mutableMapOf<E, Int>()

    fun add(e: E) {
        _map[e] = (_map[e] ?: 0) + 1
    }

    fun count(e: E) = _map[e] ?: 0

    fun toSet(): Set<E> = _map.keys
}

fun main() {
/*
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
*/
}