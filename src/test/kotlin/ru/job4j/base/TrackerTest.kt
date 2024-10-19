package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import ru.job4j.oop.Item
import ru.job4j.oop.Tracker

class TrackerTest {

    @Test
    fun whenAddNewItem() {
        val tracker = Tracker()
        val item = Item(name = "test1")
        tracker.add(item)
        val result: Item? = tracker.findById(item.id)
        assertThat(result?.name).isEqualTo(item.name)
    }

    @Test
    fun whenFindByName() {
        val tracker = Tracker()
        val item = Item(name = "name")
        tracker.add(item)
        val result: List<Item> = tracker.findByName("name")
        assertThat(result.size).isEqualTo(1)
        assertThat(result[0]).isEqualTo(item)
    }

    @Test
    fun whenReplace() {
        val tracker = Tracker()
        val bug = Item(name = "Bug")
        tracker.add(bug)
        val id = bug.id
        val bugWithDesc = Item(name = "Bug with description")
        tracker.replace(id, bugWithDesc)
        assertThat(tracker.findById(id)?.name).isEqualTo("Bug with description")
    }

    @Test
    fun whenDelete() {
        val tracker = Tracker()
        val bug = Item(name = "Bug")
        tracker.add(bug)
        val id = bug.id
        tracker.delete(id)
        assertThat(tracker.findById(id)).isEqualTo(null)
    }


}