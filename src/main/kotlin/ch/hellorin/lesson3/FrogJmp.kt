package ch.hellorin.lesson3

fun solutionFrogJmp(X: Int, Y: Int, D: Int): Int {
    return Math.ceil((Y - X) / D.toDouble()).toInt()
}