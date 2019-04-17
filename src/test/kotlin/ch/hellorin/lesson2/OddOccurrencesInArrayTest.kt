package ch.hellorin.lesson2

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class OddOccurrencesInArrayTest {
    @Test
    fun `test with {9,3,9,3,7}`() = Assert.assertEquals(7, solutionOddOccurrencesInArray(intArrayOf(9, 3, 9, 3, 7)))

    @Test
    fun `test with {1,2,1,3,2}`() = Assert.assertEquals(3, solutionOddOccurrencesInArray(intArrayOf(1, 2, 1, 3, 2)))
}