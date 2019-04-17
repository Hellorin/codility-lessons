package ch.hellorin.lesson4

fun solutionFrogRiverOne(X: Int, A: IntArray): Int {
    var set = mutableSetOf<Int>()

    set.addAll(1..X)

    for (i in 0 until A.size) {
        set.remove(A[i])
        if (set.isEmpty()) { // When this is empty, all leaves fell on the path to reach the destination
            return i
        }
    }

    return -1
}