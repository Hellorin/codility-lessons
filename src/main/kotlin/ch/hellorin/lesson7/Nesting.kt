package ch.hellorin.lesson7

import java.util.*

fun solutionNesting(S: String): Int {
    var stack = Stack<Char>()

    for (s in S) {
        when(s) {
            '(' -> stack.push(s)
            ')' -> {
                if (stack.empty()) {
                    return 0
                }
                if (stack.peek() == '(') {
                    stack.pop()
                } else {
                    return 0
                }
            }
        }
    }

    return if (stack.empty()) 1 else 0
}