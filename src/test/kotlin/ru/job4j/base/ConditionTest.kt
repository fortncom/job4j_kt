package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ConditionTest {

    @Test
    fun when12_then2() {
        assertThat(max(1, 2)).isEqualTo(2)
    }

    @Test
    fun when32_then3() {
        assertThat(max(3, 2)).isEqualTo(3)
    }

    @Test
    fun when123_then3() {
        assertThat(max(1, 2, 3)).isEqualTo(3)
    }

    @Test
    fun when243_then4() {
        assertThat(max(2, 4, 3)).isEqualTo(4)
    }

    @Test
    fun when543_then4() {
        assertThat(max(5, 4, 3)).isEqualTo(5)
    }
}
