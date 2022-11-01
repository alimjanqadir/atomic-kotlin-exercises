// CompanionObjects/CompanionEx1.kt
package companionObjectsExercise1

import atomictest.*

interface Vendor {
    fun pencil()
    fun pen()
}

interface VendorFactory {
    fun create(): Vendor
}

class Vendor1 : Vendor {
    companion object {
        val factory = object : VendorFactory {
            override fun create() = Vendor1()
        }
    }

    override fun pencil() {
        trace("Vendor1 pencil")
    }

    override fun pen() {
        trace("Vendor1 pen")
    }
}

fun consumer(factory: VendorFactory) {
    val vendor = factory.create()
    vendor.pencil()
    vendor.pen()
}

class Vendor2 : Vendor {
    init {
        pencil()
        pen()
    }

    companion object {
        val factory = object : VendorFactory {
            override fun create() = Vendor1()
        }
    }

    override fun pencil() {
        trace("Vendor2 pencil")
    }

    override fun pen() {
        trace("Vendor2 pen")
    }
}

fun main() {
    /*
  // Implementations are interchangeable:
    consumer(Vendor1.factory)
    consumer(Vendor2.factory)
    trace eq """
    Vendor1 pencil
    Vendor1 pen
    Vendor2 pencil
    Vendor2 pen
    """
  */
}