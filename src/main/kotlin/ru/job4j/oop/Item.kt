package ru.job4j.oop

import java.time.LocalDateTime

data class Item(var id : Int = 0, var name : String = "", var created: LocalDateTime = LocalDateTime.now())
