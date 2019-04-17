package ch.hellorin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class Lesson2Test {
    @Test
    fun `test with {3,8,9,7,6} and 0`() = Assert.assertArrayEquals(intArrayOf(3,8,9,7,6), solutionLesson2(intArrayOf(3,8,9,7,6),0))

    @Test
    fun `test with {} and 2`() = Assert.assertArrayEquals(intArrayOf(), solutionLesson2(intArrayOf(),2))

    @Test
    fun `test with {3,8,9,7,6} and 1`() = Assert.assertArrayEquals(intArrayOf(6,3,8,9,7), solutionLesson2(intArrayOf(3,8,9,7,6),1))

    @Test
    fun `test with {3,8,9,7,6} and 3`() = Assert.assertArrayEquals(intArrayOf(9,7,6,3,8), solutionLesson2(intArrayOf(3,8,9,7,6),3))

    @Test
    fun `test with {0,0,0} and 1`() = Assert.assertArrayEquals(intArrayOf(0,0,0), solutionLesson2(intArrayOf(0,0,0),1))

    @Test
    fun `test with {1,2,3,4} and 4`() = Assert.assertArrayEquals(intArrayOf(1,2,3,4), solutionLesson2(intArrayOf(1,2,3,4),4))

    @Test
    fun `test with {1,2,3,4} and -1`() = Assert.assertArrayEquals(intArrayOf(2,3,4,1), solutionLesson2(intArrayOf(1,2,3,4),-1))

    @Test
    fun `test with {1,2,3,4} and -4`() = Assert.assertArrayEquals(intArrayOf(1,2,3,4), solutionLesson2(intArrayOf(1,2,3,4),-4))

}