package ru.job4j.lambda

import java.util.*
import java.util.function.Function
import java.util.stream.Collectors

const val NUM_1 = 1
const val NUM_2 = 2
const val NUM_3 = 3
const val NUM_4 = 4

val list = listOf(NUM_1, NUM_2, NUM_3, NUM_4)
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

const val NUMBER_1 = 1
const val NUMBER_2 = 2
const val NUMBER_3 = 3
const val NUMBER_4 = 4

fun main() {
    println(filtered)
    println(count(ArrayList(list)))
    findSingleNumbers(arrayOf(NUMBER_1, NUMBER_2, NUMBER_3, NUMBER_4))
        .forEach {
            print("$it ") // 1 3
        }
}
