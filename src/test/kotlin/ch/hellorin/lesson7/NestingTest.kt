package ch.hellorin.lesson7

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class NestingTest {
    @Test
    fun `test with correct structure1`() = Assert.assertEquals(1, solutionNesting("(()(())())"))

    @Test
    fun `test with incorrect structure1`() = Assert.assertEquals(0, solutionNesting("())"))

    @Test
    fun `test with empty string`() = Assert.assertEquals(1, solutionNesting(""))
}