package ch.hellorin.lesson1

import ch.hellorin.lesson1.solutionLesson1
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class Lesson1Test {
    @Test
    fun `test with 9`() = Assert.assertEquals(2, solutionLesson1(9))

    @Test
    fun `test with 529`() = Assert.assertEquals(4, solutionLesson1(529))

    @Test
    fun `test with 20`() = Assert.assertEquals(1, solutionLesson1(20))

    @Test
    fun `test with 15`() = Assert.assertEquals(0, solutionLesson1(15))

    @Test
    fun `test with 32`() = Assert.assertEquals(0, solutionLesson1(32))
}