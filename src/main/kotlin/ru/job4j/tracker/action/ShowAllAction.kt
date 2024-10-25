package ru.job4j.tracker.action

import ru.job4j.tracker.Input
import ru.job4j.tracker.Item
import ru.job4j.tracker.Tracker

class ShowAllAction : Action {

    override fun name() = "Show all items"

    override fun execute(tracker: Tracker, input: Input): Boolean {
        println("=== Show all items ====")
        val items: List<Item> = tracker.findAll()
        if (items.size > 0) {
            for (item in items) {
                println(item)
            }
        } else {
            println("Store is empty")
        }
        return true
    }
}
