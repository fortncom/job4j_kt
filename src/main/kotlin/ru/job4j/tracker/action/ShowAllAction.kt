package ru.job4j.tracker.action

import ru.job4j.tracker.Input
import ru.job4j.tracker.Tracker

class ShowAllAction : Action {

    override fun name() = "Show all items"

    override fun execute(tracker: Tracker, input: Input): Boolean {
        println("=== Show all items ====")
        tracker.findAll()
            .ifEmpty {
                println("Store is empty")
                listOf()
            }
            .forEach {
                println("$it")
            }
        return true
    }
}
