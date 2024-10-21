package ru.job4j.tracker

import java.time.LocalDateTime

data class Item(val id : Int = 0, val name : String = "", val created: LocalDateTime = LocalDateTime.now())
