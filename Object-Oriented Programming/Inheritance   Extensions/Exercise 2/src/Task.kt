// InheritanceExtensions/InhExtensionsEx1.kt
package inheritanceAndExtensionsExercise2
import atomictest.*

open class Dog {
  open fun speak() = trace("Bark!")
  open fun sit() = trace("Sitting...")
}

open class RealDog : Dog() {
  fun feed() = trace("Feed")
}

class ToyDog : Dog() {
  override fun speak() = trace("b.a.r.k.")
  fun changeBatteries() = trace("Change batteries")
}

fun Dog.play() {
  speak()
  sit()
}

fun RealDog.play() {
  play()
  feed()
}

fun ToyDog.play() {
  play()
  changeBatteries()
}

fun main() {
  val dog: Dog = ToyDog()
  dog.play()
  trace eq """
    TODO
  """
}