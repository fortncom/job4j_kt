package ru.job4j.tracker.action

import ru.job4j.tracker.Input
import ru.job4j.tracker.Item
import ru.job4j.tracker.Tracker

class AddAction : Action {

    override fun name() = "Create a new Item"

    override fun execute(tracker: Tracker, input: Input): Boolean {
        println("=== Create a new Item ====")
        val item = Item(name = input.ask("Enter name"))
        tracker.add(item)
        println("Item created: $item")
        return true
    }
}
