package ru.job4j.oop

class Tracker {

    private val items: MutableList<Item> = ArrayList()
    private var ids = 1

    fun add(item: Item): Item {
        item.setId(ids++)
        items.add(item)
        return item
    }

    fun findById(id: Int): Item? {
        val index = indexOf(id)
        return if (index != -1) items[index] else null
    }

    fun findByName(key: String): List<Item> {
        val quantity = 0
        val rsl: MutableList<Item> = ArrayList()
        for (index in items.indices) {
            val item = items[index]
            if (item.getName() == key) {
                rsl.add(item)
            }
        }
        return rsl
    }

    fun findAll(): List<Item> {
        return items
    }

    fun replace(id: Int, item: Item): Boolean {
        val index = indexOf(id)
        if (index != -1) {
            item.setId(id)
            items[index] = item
            return true
        }
        return false
    }

    fun delete(id: Int): Boolean {
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
            if (items[index].getId() == id) {
                rsl = index
                break
            }
        }
        return rsl
    }
}