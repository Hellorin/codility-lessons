package ch.hellorin

fun solutionLesson2(A: IntArray, K: Int): IntArray {
    // Handle corner cases
    if (A.isEmpty() || K % A.size == 0) {
        return A
    }

    // Handle K that are higher than the array A's size
    var simplifiedK = K % A.size

    // Handle negative rotation
    if (simplifiedK < 0) {
        simplifiedK = A.size - 2 - K
    }

    val copyOfRangeStart = A.copyOfRange(0, A.size-simplifiedK)
    var copyOfRangeEnd = A.copyOfRange(A.size-simplifiedK, A.size)
    return copyOfRangeEnd.plus(copyOfRangeStart)
}