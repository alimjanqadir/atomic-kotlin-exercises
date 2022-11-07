// Tests/unittesting/UnitTestingSoln1.kt
package unitTestingExercise1

import atomictest.eq
import sealedclasses.Bus
import sealedclasses.Train
import sealedclasses.travel
import kotlin.test.*


@Test
fun `train travel`() {
    val result = travel(Train("S1"))
    assertEquals("Train S1", result)
}

@Test
fun `bus travel`() {
    val result = travel(Bus("11", 90))
    assertEquals("Bus 11: size 90", result)
}

