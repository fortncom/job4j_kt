package ru.job4j.lambda.bank

data class User(val passport: String,
                val username: String,
                var email: String = "")