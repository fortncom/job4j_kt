package ru.job4j.oop

open class Profession(var name: String = "",
                      var surname: String = "",
                      var education: String = "")

class Doctor(name: String,
             surname: String,
             education: String,
             var diagnosis: String = "") : Profession(name, surname, education)


class Engineer(name: String,
               surname: String,
               education: String,
               var computer: String = "") : Profession(name, surname, education)

