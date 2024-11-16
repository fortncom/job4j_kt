package ru.job4j.lambda

import java.util.*

data class Campaign(
    var name: String = "",
    var address: Address? = null,
    var created: Date = Date())

fun printCompaigns(compaigns: List<Campaign>) = compaigns.map { it.toString() }.toList()

