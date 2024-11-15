package ru.job4j.lambda

import java.util.*
import java.util.function.Function
import java.util.stream.Collectors

val list = listOf(1, 2, 3, 4)
val filtered = list.filter { it % 2 == 0 }

fun count(list: ArrayList<Int>): Int? {
    return list
        .stream()
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .reduce(0, ) { acc, value -> acc + value }
}

fun findSingleNumbers(array: Array<Int>): Array<Int> {
    return Arrays.stream(array)
        .collect(Collectors.groupingBy(Function.identity()))
        .values
        .stream()
        .filter { it.size == 1 }
        .flatMap { it.stream() }
        .collect(Collectors.toList()).toTypedArray()
}

fun main() {
    println(filtered)
    println(count(ArrayList(list)))
    findSingleNumbers(arrayOf(1, 2, 2, 3))
        .forEach {
            print("$it ") // 1 3
        }
}