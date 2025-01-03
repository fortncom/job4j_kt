package ru.job4j.base.tracker

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import ru.job4j.tracker.Item
import ru.job4j.tracker.Tracker

class TrackerTest {

    @Test
    fun whenAddNewItem() {
        val tracker = Tracker()
        val item = Item(name = "test1")
        val rsl = tracker.add(item)
        assertThat(rsl.name).isEqualTo(item.name)
    }

    @Test
    fun whenFindByName() {
        val tracker = Tracker()
        val item = Item(name = "name")
        val rsl = tracker.add(item)
        assertThat(rsl.name).isEqualTo(item.name)
    }

    @Test
    fun whenReplace() {
        val tracker = Tracker()
        val bug = tracker.add(Item(name = "Bug"))
        val bugWithDesc = Item(name = "Bug with description")
        tracker.replace(bug.id, bugWithDesc)
        val rsl = tracker.findById(bug.id)
        assertThat(rsl?.name).isEqualTo("Bug with description")
    }

    @Test
    fun whenDelete() {
        val tracker = Tracker()
        val bug = tracker.add(Item(name = "Bug"))
        val rsl = tracker.delete(bug.id)
        assertThat(rsl).isEqualTo(true)
        assertThat(tracker.findById(bug.id)).isEqualTo(null)
    }


}
