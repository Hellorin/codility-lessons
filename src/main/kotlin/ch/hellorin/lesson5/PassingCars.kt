package ch.hellorin.lesson5

fun solutionPassingCars(A: IntArray): Int {
    var carsGoingEast = 0
    var carsPassing = 0

    for (i in A) {
        if (i == 1) {
            // Count pairs so add all cars going east when found a car going west
            carsPassing += carsGoingEast
        } else {
            carsGoingEast++
        }
    }

    // As requested in the problem statement
    if (carsPassing > 1000000000 ) return -1

    // Avoid overflow
    if (carsPassing < 0) return -1

    return carsPassing
}