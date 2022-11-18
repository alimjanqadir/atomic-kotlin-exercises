// PropertyDelegation/PropDelegationSoln1.kt
package propertyDelegationToolsExercise1

import atomictest.eq
import propertydelegation.FileDelegate
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Configuration(val map: MutableMap<String, Any>) {
    var user by map
    var id by map
    var project by map
}

fun main() {
    val config = Configuration(mutableMapOf(
            "user" to "Luciano",
            "id" to "Ramalho47",
            "project" to "MyLittlePython",
    ))
    config.project eq "MyLittlePython"
    config.user = "Crocubot"
    config.id = "C137"
    config.project = "WhirlyDirly"
    config.map eq "{user=Crocubot, " +
            "id=C137, project=WhirlyDirly}"
}