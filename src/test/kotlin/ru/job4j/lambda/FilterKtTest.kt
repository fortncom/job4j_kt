package ru.job4j.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class FilterKtTest {

    @Test
    fun filter() {
        val rsl = filtered
        assertThat(rsl).isEqualTo(arrayListOf(2,4))
    }

    @Test
    fun count() {
        val rsl = count(ArrayList(numbers))
        assertThat(rsl).isEqualTo(8)
    }

    @Test
    fun findSingleNumbers() {
        val rsl = findSingleNumbers(arrayOf(NUM_1, NUM_2, NUM_2, NUM_3))
        assertThat(rsl).isEqualTo(arrayOf(1,3))
    }
}
