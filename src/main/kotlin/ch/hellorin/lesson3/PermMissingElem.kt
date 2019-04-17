package ch.hellorin.lesson3

fun solutionPermMissingElem(A : IntArray): Int {
    var missingElement = 1
    A.sort()

    for (i in 0 until A.size) {
        if (A[i] == missingElement) {
            missingElement = A[i]+1
        }
    }

    return missingElement
}