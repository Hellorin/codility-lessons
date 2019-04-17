package ch.hellorin.lesson6

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MaxProductOfThreeTest {

    @Test
    fun `test with {-3,1,2,-2,5,6}`() = Assert.assertEquals(60, solutionMaxProductOfThree(intArrayOf(-3,1,2,-2,5,6)))

    @Test
    fun `test with {-5, 5, -5, 4}`() = Assert.assertEquals(125, solutionMaxProductOfThree(intArrayOf(-5, 5, -5, 4)))
}