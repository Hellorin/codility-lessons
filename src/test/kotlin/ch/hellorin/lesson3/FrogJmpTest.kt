package ch.hellorin.lesson3

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class FrogJmpTest {
    @Test
    fun `test with x=10, y=85, d=30`() = Assert.assertEquals(3, solutionFrogJmp(10, 85, 30))
}