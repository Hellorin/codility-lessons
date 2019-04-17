package ch.hellorin.lesson3

fun solutionTapeEquilibrium(A: IntArray): Int {
    var leftPart = A[0]
    var rightPart = A.sum()-A[0]
    var min = Math.abs(leftPart - rightPart)

    for (i in 1 until A.size-1) {
        leftPart += A[i]
        rightPart -= A[i]
        min = Math.min(Math.abs(leftPart - rightPart), min)
    }

    return min
}