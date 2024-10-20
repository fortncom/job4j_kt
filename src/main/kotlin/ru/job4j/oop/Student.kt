package ru.job4j.oop

class Student(var name: String = "",
              var surname: String = "",
              var phone: String = "",
              var email: String = "") {

    fun show() {
        println("$name $surname $phone $email")
    }
}
