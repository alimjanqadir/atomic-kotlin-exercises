// InnerClasses/InnerEx3.kt
package innerClassesExercise3

interface Selector<T> {
    fun end(): Boolean
    fun current(): T
    fun next()
}

class Container<T>(iterable: Iterable<T>) : Iterable<T> {
    private val items = iterable.toMutableList()

    fun selector(): Selector<T> = object : Selector<T> {
        var i = 0

        override fun end(): Boolean = current() == items.size;

        override fun current(): T = items[i]

        override fun next() {
            if(i < items.size) i += 1
        }
    }


    override fun iterator(): Iterator<T> = object : Iterator<T> {
        var i = 0
        override fun hasNext(): Boolean = i < items.size
        override fun next(): T = items[i++]
    }
}


fun main() {
/*
  traceAll(Container(0..9).selector())
  trace eq "0 1 2 3 4 5 6 7 8 9"
  traceAll2(Container(0..9))
  trace eq "0 1 2 3 4 5 6 7 8 9"
  traceAll(Container(List(10){ it * it })
    .selector())
  trace eq "0 1 4 9 16 25 36 49 64 81"
  traceAll2(Container(List(10){ it * it }))
  trace eq "0 1 4 9 16 25 36 49 64 81"
*/
}