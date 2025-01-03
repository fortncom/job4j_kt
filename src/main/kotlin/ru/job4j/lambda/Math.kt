package ru.job4j.lambda

val inc = { x: Int -> x + 1}
val dec = { x: Int -> x - 1}
val square = { x: Int -> x * x}

fun main() {
    println(inc(1))
    println(dec(1))
    println(square(2))
}
