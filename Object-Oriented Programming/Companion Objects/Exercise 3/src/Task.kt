// CompanionObjects/CompanionEx3.kt
package companionObjectsExercise3

import kotlin.random.Random
import atomictest.*

data class ID(
        val name: String,
        val id: String = idGenerator()
) {
    companion object {
        val size = 10
        val random = Random(47)
        val source = ('A'..'Z') + ('a'..'z') + ('0'..'9')
        private fun idGenerator() = (0..9).map { source.random() }.joinToString()

        fun test(n: Int) = List(n) {
            ID(('a' + it).toString())
        }.joinToString(",\n")
    }
}

class Bank(val name: String) {
    private val applied =
            mutableListOf<Account>()
    private val accounts =
            mutableListOf<Account>()

    private class Account(val name: String) {
        var id: ID? = null
        private var number: Long? = null
        fun addID(verifiedID: ID) {
            id = verifiedID
        }

        companion object Numbers {
            val i = 1000L
            private fun nextAccountNumber(): Long = i + 1
        }

        fun finish() {
            number = nextAccountNumber()
        }

        override fun toString() = "$id $number"
    }

    fun applyForAccount(name: String) = applied.add(Account(name))

    fun addID(id: ID) {
        applied.first { it.name == id.name }.id = id
    }

    fun completeAccount(verifiedID: ID) {
        val account = applied.first { it.id == verifiedID }
        applied -= account
        accounts += account
    }

    override fun toString() =
            accounts.joinToString("\n")
}

fun main() {
    ID.test(4) eq """
  ID(name=a, id=weazblk9UF),
  ID(name=b, id=LCcPJtUGh5),
  ID(name=c, id=Acs5BzSj6m),
  ID(name=d, id=gHrshDvhwc)
  """
    val bank = Bank("Jerry's Savings & Loan")
    listOf(ID("Morty Smith"), ID("Beth Smith"),
            ID("Summer Smith")).forEach {
        bank.applyForAccount(it.name)
        bank.addID(it)
        bank.completeAccount(it)
    }
    bank eq """
  ID(name=Morty Smith, id=ePkc0HjTAU) 1000
  ID(name=Beth Smith, id=jjePlEO93w) 1001
  ID(name=Summer Smith, id=C8yaeFEgv6) 1002
  """
}