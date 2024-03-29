// ExtensionLambdas/ExtensionLambdasSoln1.kt
package extensionLambdasExercise1
import atomictest.eq

fun createString(
  build: StringBuilder.() -> Unit
): String {
  val sb = StringBuilder()
  sb.build()
  return sb.toString()
}

fun <T> createList(
  build: ArrayList<T>.() -> Unit
): List<T> {
  val list = arrayListOf<T>()
  list.build()
  return list.toList()
}

fun <K, V> createMap(
  build: HashMap<K, V>.() -> Unit
): Map<K, V> {
  val map = hashMapOf<K, V>()
  map.build()
  return map
}

@OptIn(ExperimentalStdlibApi::class)
fun main() {
  createString {
    (1..10).forEach { append(it) }
  } eq buildString {
    (1..10).forEach { append(it) }
  }
  createList<String> {
    (1..10).forEach { add(it.toString()) }
  } eq buildList {
    (1..10).forEach { add(it.toString()) }
  }
  createMap<Char, Int> {
    ('a'..'j').forEachIndexed { n, c ->
      put(c, n)
    }
  } eq buildMap {
    ('a'..'j').forEachIndexed { n, c ->
      put(c, n)
    }
  }
}