package ru.job4j.oop

open class Profession(var name: String = "",
                      var surname: String = "",
                      var education: String = "") {

    open fun getFullName() = "%s %s".format(name, surname)
    open fun action() = "work"
}

class Doctor(name: String,
             surname: String,
             education: String,
             var diagnosis: String = "") : Profession(name, surname, education) {

    override fun getFullName() = "Doctor's name: %s %s".format(name, surname)
    override fun action(): String {
        return "action from doctor %s".format(super.action())
    }
}


class Engineer(name: String,
               surname: String,
               education: String,
               var computer: String = "") : Profession(name, surname, education) {

    override fun getFullName() = "Engineer's name: %s %s".format(name, surname)
    override fun action(): String {
        return "action from engineer %s".format(super.action())
    }
}

