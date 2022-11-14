// CreatingGenerics/CreatingGenericsSoln3.kt
package creatingGenericsExercise3

import variance.Cat

interface InBox<in T> {
    fun put(item: T)
}

interface OutBox<out T> {
    fun get(): T
}

class Box<T>(private var item: T) : InBox<T>, OutBox<T> {
    override fun put(item: T) {
        this.item = item
    }

    override fun get(): T = item

}

fun main() {
    val catBox: Box<Cat> = Box(Cat())
    val outBoxAny: OutBox<Any> = catBox
    val a: Any = outBoxAny.get()
    val inBoxAny: InBox<Any> = Box(217)
    val inBoxCat: InBox<Any> = inBoxAny
    inBoxCat.put(Cat())
}