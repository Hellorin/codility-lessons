package ch.hellorin.lesson6

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class DistinctTest {
    @Test
    fun `test {2,1,1,2,3,1}`() = Assert.assertEquals(3, solutionDistinct(intArrayOf(2,1,1,2,3,1)))
}