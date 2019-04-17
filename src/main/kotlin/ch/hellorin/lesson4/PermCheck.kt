package ch.hellorin.lesson4

fun solutionPermCheck(A: IntArray): Int {
    var valuesExistence = BooleanArray(A.size)

    for (a in A) {
        if (a <= 0 || a > A.size) return 0
        if (valuesExistence[a-1]) return 0

        valuesExistence[a-1] = true
    }
    return 1
}