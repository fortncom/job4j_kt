package ru.job4j.tracker.action

import ru.job4j.tracker.Input
import ru.job4j.tracker.Tracker

class ExitAction : Action {

    override fun name() = "Exit"

    override fun execute(tracker: Tracker, input: Input) = false
}
