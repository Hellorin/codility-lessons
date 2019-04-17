package ch.hellorin.lesson4

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class PermCheckTest {
    @Test
    fun `test with {4,1,3,2}`() = Assert.assertEquals(1, solutionPermCheck(intArrayOf(4,1,3,2)))

    @Test
    fun `test with {4,1,3}`() = Assert.assertEquals(0, solutionPermCheck(intArrayOf(4,1,3)))
}