package ru.job4j.tracker

import java.util.*

class StartUI {

    companion object {
        fun init(scanner: Scanner, tracker: Tracker) {
            var run = true
            while (run) {
                showMenu()
                print("Select: ")
                val select = scanner.nextLine().toInt()
                if (select !in 0..2) {
                    println("Invalid value selected: $select")
                    continue;
                }
                println("User selected: $select")
                when (select) {
                    0 -> createItem(tracker, scanner)
                    1 -> showAllItem(tracker)
                    2 -> run = exit()
                }
            }
        }

        private fun showMenu() {
            val menu = arrayOf("Add new Item", "Show all items", "Exit Program")
            println("Menu:")
            for (i in menu.indices) {
                println("$i. ${menu[i]}")
            }
        }

        private fun createItem(tracker: Tracker, scanner: Scanner) {
            println("=== Create a new Item ====")
            print("Enter name: ")
            val name: String = scanner.nextLine()
            val item = Item(name = name)
            tracker.add(item)
            println("Item created: $item")
        }

        private fun showAllItem(tracker: Tracker) {
            println("=== Show all items ====")
            val items: List<Item> = tracker.findAll()
            if (items.size > 0) {
                for (item in items) {
                    println(item)
                }
            } else {
                println("Store is empty")
            }
        }

        private fun exit() = false
    }
}



fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val tracker = Tracker()
    StartUI.init(scanner, tracker)
}
