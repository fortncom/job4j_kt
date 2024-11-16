package ru.job4j.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.util.*

class CampaignTest {

    @Test
    fun printCompaigns() {

        val campaigns = listOf(
            Campaign(
                name = "IT Systems",
                address = Address(
                    city = "Москва",
                    street = "Ленинградский проспект",
                    house = "7"
                ),
                created = Date(2024, 10, 26)
            ),
            Campaign(
                name = "TRS",
                address = Address(
                    city = "Санкт-Петербург",
                    street = "Невский проспект",
                    house = "12"
                ),
                created = Date(2024, 10, 25)
            )
        )

        val expected = campaigns.map { it.toString() }.toList()
        val rsl = printCompaigns(campaigns)

        assertThat(rsl).isEqualTo(expected)
    }
}