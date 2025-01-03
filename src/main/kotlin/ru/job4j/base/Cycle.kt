package ru.job4j.base

const val SIZE = 10

fun createArray() {
    val names = arrayOfNulls<String>(SIZE)
    names[0] = "Petr Arsentev"
    for ((index, name) in names.withIndex()) {
        println("$index " + name?.length)
    }
}

fun defragment(array: Array<String?>): Array<String?> {
    var currentPosition = 0
    for ((index, name) in array.withIndex()) {
        if (name == null) continue
        else {
            array[currentPosition++] = name
            array[index] = null
        }
    }
    return array;
}
