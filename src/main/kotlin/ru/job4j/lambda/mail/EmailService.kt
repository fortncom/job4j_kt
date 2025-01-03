package ru.job4j.lambda.mail

class EmailService {

    fun emailTo(message: Message): String {
        return with(StringBuilder()) {
            append("Subject : ").append(message.email).append(" ")
            append("Body : Hello, ").append(message.email).append(" ")
            append("You win!")
        }.toString()
    }
}

fun main() {
    println(EmailService().emailTo(Message("test", "email@test.com")))
}
