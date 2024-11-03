package ru.job4j.tracker

import ru.job4j.tracker.action.Action
import ru.job4j.tracker.action.AddAction
import ru.job4j.tracker.action.ExitAction
import ru.job4j.tracker.action.ShowAllAction

class StartUI {

    companion object {
        fun init(tracker: Tracker, actions: Array<Action>, input: Input) {
            var run = true
            while (run) {
                showMenu(actions)
                val question = "Select: "
                val select = input.ask(question).toInt()
                if (select !in 0..2) {
                    println("Invalid value selected: $select")
                    continue;
                }
                println("User selected: $select")
                val action = actions.get(select)
                run = action.execute(tracker, input)
            }
        }

        private fun showMenu(actions: Array<Action>) {
            println("Menu:")
            for ((index, value) in actions.withIndex()) {
                println("$index. ${value.name()}")
            }
        }
    }
}



fun main(args: Array<String>) {
    val tracker = Tracker()
    val consoleInput = ConsoleInput()
    val actions = arrayOf(AddAction(), ShowAllAction(), ExitAction())
    StartUI.init(tracker, actions, consoleInput)
}








