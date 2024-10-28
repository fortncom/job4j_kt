package ru.job4j.lambda

val list = listOf(1, 2, 3, 4)
val filtered = list.filter { it % 2 == 0 }

fun count(list: ArrayList<Int>): Int? {
    return list
        .stream()
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .reduce(0, ) { acc, value -> acc + value }
}

fun main() {
    println(filtered)
    println(count(ArrayList(list)))
}