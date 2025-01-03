package ru.job4j.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun whenNameContainsIvanAndBalancePositive_thenReturn() {
        val accounts = listOf(
            Account("Ivan", 10L),
            Account("Ivanov", 10L),
            Account("Ivan", 0L),
            Account("Tom", 10L),
            Account("Tom", 0L)
        )
        val rsl = accounts.filter {
            it.name.contains("Ivan") && it.balance > 0
        }
        val expected = listOf(
            Account("Ivan", 10L),
            Account("Ivanov", 10L)
        )
        assertThat(rsl).isEqualTo(expected)
    }
}
