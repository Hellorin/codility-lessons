package ch.hellorin.lesson4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class FrogRiverOneTest {
    @Test
    fun `test with {1,3,1,4,2,3,5,4}`() {
        solutionFrogRiverOne(5, intArrayOf(1,3,1,4,2,3,5,4))
    }
}