package ru.job4j.tracker

import java.lang.System.`in`
import java.util.*

class ConsoleInput : Input {

    private val scanner = Scanner(`in`)

    override fun ask(question: String): String {
        println(question)
        return scanner.nextLine()
    }
}