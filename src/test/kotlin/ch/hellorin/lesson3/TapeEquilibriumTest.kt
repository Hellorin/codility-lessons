package ch.hellorin.lesson3

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class TapeEquilibriumTest {
    @Test
    fun `test with {3,1,2,4,3}`() = Assert.assertEquals(1, solutionTapeEquilibrium(intArrayOf(3,1,2,4,3)))

    @Test
    fun `test with {1,3}`() = Assert.assertEquals(2, solutionTapeEquilibrium(intArrayOf(1,3)))
}