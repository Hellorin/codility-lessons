package ch.hellorin.lesson6

fun solutionMaxProductOfThree(A: IntArray): Int {
    A.sort()

    return Math.max(
            A.takeLast(3).fold(1) { total, element -> total * element },
            A.take(2).fold(1) { total, element -> total * element } * A.last()
    )
}