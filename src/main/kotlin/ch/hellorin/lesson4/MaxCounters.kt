package ch.hellorin.lesson4

fun solutionMaxCounters(N: Int, A: IntArray): IntArray {
    var intArray = IntArray(N)

    // Keep the maximum value
    var maxValue = 0

    // Min value of all counters
    var minValue = 0
    for (a in A) {
        if (a == N+1) { // Set the min value for all counters
            minValue = maxValue
        } else {
            intArray[a-1] = Math.max(intArray[a-1], minValue) + 1
            maxValue = Math.max(maxValue, intArray[a-1])
        }
    }

    // Ensure that all counters have the min value if under it
    for (i in 0 until intArray.size) {
        if (intArray[i] < minValue) {
            intArray[i] = minValue
        }
    }

    return intArray
}