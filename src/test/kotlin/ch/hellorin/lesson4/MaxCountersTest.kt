package ch.hellorin.lesson4

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MaxCountersTest {
    @Test
    fun `test with {3,4,4,6,1,4,4} and N=5`() = Assert.assertArrayEquals(intArrayOf(3,2,2,4,2), solutionMaxCounters(5, intArrayOf(3,4,4,6,1,4,4)))
}