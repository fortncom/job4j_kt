package ru.job4j.oop

class Tracker {

    private val items: MutableList<Item> = ArrayList()
    private var ids = 1

    internal fun add(item: Item): Item {
        items.add(item.copy(id = ids++))
        return item
    }

    internal fun findById(id: Int): Item? {
        val index = indexOf(id)
        return if (index != -1) items[index] else null
    }

    internal fun findByName(key: String): List<Item> {
        val rsl: MutableList<Item> = ArrayList()
        for (index in items.indices) {
            val item = items[index]
            if (item.name == key) {
                rsl.add(item)
            }
        }
        return rsl
    }

    internal fun findAll(): List<Item> {
        return items
    }

    internal fun replace(id: Int, item: Item): Boolean {
        val index = indexOf(id)
        if (index != -1) {
            items[index] = item.copy(id = 2)
            return true
        }
        return false
    }

    internal fun delete(id: Int): Boolean {
        val index = indexOf(id)
        if (index != -1) {
            items.removeAt(index)
            return true
        }
        return false
    }

    private fun indexOf(id: Int): Int {
        var rsl = -1
        for (index in items.indices) {
            if (items[index].id == id) {
                rsl = index
                break
            }
        }
        return rsl
    }
}