// BaseClassInit/Task3.kt
package baseClassInitializationExercise3

import atomictest.trace

open class Animal(open val sound: String = "???")

class Cat(sound: String = "meow") : Animal(sound)

class Dog(sound: String = "woof"): Animal(sound)

fun main() {
/*
  val animal = Animal()
  trace(animal.sound)
  val cat = Cat()
  trace(cat.sound)
  val dog = Dog()
  trace(dog.sound)
*/
    trace eq "??? meow woof"
}