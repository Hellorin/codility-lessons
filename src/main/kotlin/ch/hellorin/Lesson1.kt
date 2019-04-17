package ch.hellorin

import java.lang.Integer.max

fun solutionLesson1(N: Int): Int {
    var tempN = N

    var seenAOne = false

    var maxCount = 0

    var curCount = 0

    while (tempN != 0) {
        if (tempN and 1 == 1) {
            seenAOne = true
            maxCount = max(maxCount, curCount)
            curCount = 0
        } else {
            if (seenAOne) {
                curCount += 1
            }
        }
        tempN = tempN shr 1
    }

    return maxCount
}