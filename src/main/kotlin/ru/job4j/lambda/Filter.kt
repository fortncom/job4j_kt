package ru.job4j.lambda

const val NUM_1 = 1
const val NUM_2 = 2
const val NUM_3 = 3
const val NUM_4 = 4

val numbers = listOf(NUM_1, NUM_2, NUM_3, NUM_4)
val filtered = numbers.filter { it % 2 == 0 }

fun count(list: ArrayList<Int>): Int? {
    return list
        .stream()
        .filter { it % 2 == 0 }
        .map { it + 1 }
        .reduce(0, ) { acc, value -> acc + value }
}

fun findSingleNumbers(array: Array<Int>): Array<Int> {
    return array.groupBy { it }
        .filter { it.value.size == 1 }
        .keys
        .toTypedArray()
}
