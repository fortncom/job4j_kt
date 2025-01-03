package ru.job4j.base

fun add(first : Int, second : Int) : Int {
    return first + second
}

fun subtract(first : Int, second : Int) : Int {
    return first - second
}

fun multiply(first : Int, second : Int) : Int {
    return first * second
}
fun divide(first : Int, second : Int) : Int {
    return first / second
}
const val ARG1 = 1
const val ARG2 = 1
const val ARG3 = 2
const val ARG4 = 4

fun main() {

    val plus = add(ARG1, ARG2)
    println("1 + 1 = $plus")

    val minus = subtract(ARG1, ARG2)
    println("1 - 1 = $minus")

    val multiplication = multiply(ARG1, ARG3)
    println("1 * 2 = $multiplication")

    val division = divide(ARG4, ARG3)
    println("4 / 2 = $division")
}
