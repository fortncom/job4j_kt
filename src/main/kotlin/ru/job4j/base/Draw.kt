package ru.job4j.base

fun draw(size: Int) {
    for (i in 1 .. size) {
        for (j in 1 .. size) {
            if (i == j || i + j == size + 1) print("X") else print(" ")
        }
        println()
    }
}

fun main() {
    draw(7)
}