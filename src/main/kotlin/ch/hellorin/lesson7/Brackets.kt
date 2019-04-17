package ch.hellorin.lesson7

import java.util.*

fun solutionBrackets(S: String) : Int {
    var map = mutableMapOf(
            '}' to '{',
            ']' to '[',
            ')' to '(')

    var stack = Stack<Char>()

    for (s in S) {
        when(s) {
            '{', '[', '(' -> stack.push(s)
            '}', ']', ')' -> {
                if (stack.empty()) {
                    return 0
                }
                if (stack.peek() == map[s]) {
                    stack.pop()
                } else {
                    return 0
                }
            }
        }
    }

    return if (stack.empty()) 1 else 0
}