package ch.hellorin.lesson3

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PermMissingElemTest {
    @Test
    fun `test with {2,3,1,5}`() = Assert.assertEquals(4, solutionPermMissingElem(intArrayOf(2,3,1,5)))

    @Test
    fun `test with {1,3}`() = Assert.assertEquals(2, solutionPermMissingElem(intArrayOf(3,1)))

    @Test
    fun `test with {1}`() = Assert.assertEquals(2, solutionPermMissingElem(intArrayOf(1)))

    @Test
    fun `test with {3,2}`() = Assert.assertEquals(1, solutionPermMissingElem(intArrayOf(3,2)))

    @Test
    fun `test with {2,1}`() = Assert.assertEquals(3, solutionPermMissingElem(intArrayOf(2,1)))
}