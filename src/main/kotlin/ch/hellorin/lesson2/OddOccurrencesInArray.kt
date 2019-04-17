package ch.hellorin.lesson2

fun solutionOddOccurrencesInArray(A: IntArray): Int {
    var i = 0

    val iterator = A.iterator()
    while (iterator.hasNext()) {
        // Works if we know that we have necessarily paired element
        // The xor cancels each pair and leaves only the one missing
        i = i xor iterator.nextInt()
    }

    return i
}