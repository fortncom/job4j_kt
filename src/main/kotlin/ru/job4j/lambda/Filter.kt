package ru.job4j.lambda

val list = listOf(1, 2, 3, 4)
val filtered = list.filter { it % 2 == 0 }

fun main() {
    println(filtered)
}