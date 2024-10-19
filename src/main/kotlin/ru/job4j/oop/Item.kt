package ru.job4j.oop

import java.time.LocalDateTime

class Item {
    private var id = 0
    private var name: String? = null
    private val created: LocalDateTime = LocalDateTime.now()

    fun Item() {
    }

    fun Item(name: String?) {
        this.name = name
    }

    fun Item(id: Int, name: String?) {
        this.id = id
        this.name = name
    }

    fun getCreated(): LocalDateTime {
        return created
    }

    fun getId(): Int {
        return id
    }

    fun setId(id: Int) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }
}