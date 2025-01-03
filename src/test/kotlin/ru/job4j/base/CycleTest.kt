package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CycleTest {

    @Test
    fun defragment_when35() {

        val numbers = arrayOfNulls<String>(5)
        numbers[2] = "3"
        numbers[4] = "5"

        val rsl = arrayOfNulls<String>(5)
        rsl[0] = "3"
        rsl[1] = "5"

        assertThat(defragment(numbers)).isEqualTo(rsl)
    }
}
