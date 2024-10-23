package ru.job4j.oop

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SimpleLinkedListTest {

    lateinit var list: SimpleLinkedList<String>

    @BeforeEach
    fun setUp() {
        list = SimpleLinkedList()
    }

    @Test
    fun whenGet() {
        val item = "Item1"
        list.add(item)
        assertThat(list.get(0)).isEqualTo(item)
    }

    @Test
    fun whenAdd() {
        val item = "Item1"
        list.add(item)
        assertThat(list.size).isEqualTo(1)
    }

    @Test
    fun whenRemove() {
        val item = "Item1"
        list.add(item)
        list.remove(0)
        assertThat(list.size).isEqualTo(0)
    }

    @Test
    fun whenGetIteratorTwiceThenEveryFromBegin() {
        val item = "Item1"
        val item2 = "Item2"
        list.add(item)
        list.add(item2)

        val first: Iterator<String> = list.iterator()
        assertThat(first.hasNext()).isEqualTo(true)
        assertThat(first.next()).isEqualTo(item2)
        assertThat(first.hasNext()).isEqualTo(true)
        assertThat(first.next()).isEqualTo(item)

        val second: Iterator<String> = list.iterator()
        assertThat(second.hasNext()).isEqualTo(true)
        assertThat(second.next()).isEqualTo(item2)
        assertThat(second.hasNext()).isEqualTo(true)
        assertThat(second.next()).isEqualTo(item)
    }
}
