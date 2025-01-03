package ru.job4j.base

fun draw(size: Int) {
    for (i in 1 .. size) {
        for (j in 1 .. size) {
            if (i == j || i + j == size + 1) print("X") else print(" ")
        }
        println()
    }
}

const val SIDE_LENGTH = 7

fun main() {
    draw(SIDE_LENGTH)
}
