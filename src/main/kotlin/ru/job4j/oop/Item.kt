package ru.job4j.oop

import java.time.LocalDateTime

data class Item(var id : Int = 0, var name : String = "", val created: LocalDateTime = LocalDateTime.now())
