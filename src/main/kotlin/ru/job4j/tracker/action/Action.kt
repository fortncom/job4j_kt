package ru.job4j.tracker.action

import ru.job4j.tracker.Input
import ru.job4j.tracker.Tracker

interface Action {

    fun name(): String

    fun execute(tracker: Tracker, input: Input): Boolean
}
