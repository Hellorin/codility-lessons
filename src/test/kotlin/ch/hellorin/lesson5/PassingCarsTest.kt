package ch.hellorin.lesson5

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PassingCarsTest {
    @Test
    fun `test with {0,1,0,1,1}`() = Assert.assertEquals(5, solutionPassingCars(intArrayOf(0,1,0,1,1)))
}