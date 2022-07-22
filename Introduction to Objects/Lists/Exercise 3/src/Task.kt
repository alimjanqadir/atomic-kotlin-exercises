// Lists/Task3.kt
package listsExercise3
import atomictest.eq

fun checkAnagrams(s1: String, s2: String): Boolean {
  val counter = IntArray(26)
  for(i in s1.indices) {
    counter[s1[i] - 'a'] -= 1
  }

  for(i in s2.indices) {
    counter[s2[i] - 'a'] += 1
  }

  var result = true
  for(e in counter) {
    if (e != 0) {
      result = false
      break
    }
  }
  return result
}

fun main() {
  checkAnagrams("thing", "night") eq true
  checkAnagrams("leader", "dealer") eq true
  checkAnagrams("sector", "escort") eq true
  checkAnagrams("tablet", "battle") eq true
  checkAnagrams("friend", "finder") eq true
  checkAnagrams("senator", "treason") eq true
  checkAnagrams("terrain", "trainer") eq true
  checkAnagrams("teaching", "cheating") eq true

  checkAnagrams("pots", "stops") eq false
  checkAnagrams("escort", "sectors") eq false
  checkAnagrams("sections", "notices") eq false
}