package ru.job4j.lambda.bank

import ru.job4j.lambda.Account

class BankService {

    private val users: HashMap<User, ArrayList<Account?>> = HashMap()

    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }

    fun findUserByPassport(passport: String): User? {
        return users.keys.find { it.passport == passport }
    }

    fun addAccount(passport: String, account: Account) {
        val user: User = findUserByPassport(passport) ?: return
        users[user]!!.add(account)
    }

    fun findAccountByRequisite(passport: String, requisite: String): Account? {
        val user: User = findUserByPassport(passport) ?: return null
        return users[user]?.firstOrNull { it?.requisite == requisite }
    }

    fun transferMoney(srcPassport: String, srcRequisite: String,
                      destPassport: String, descRequisite: String, amount: Double): Boolean {
        val source = findAccountByRequisite(srcPassport, srcRequisite)
        val dest = findAccountByRequisite(destPassport, descRequisite)
        val rsl = source != null && dest != null
        if (rsl) {
            source!!.balance = (source.balance - amount).toLong()
            dest!!.balance = (dest.balance + amount).toLong()
        }
        return rsl
    }
}


fun main() {
    val bank = BankService()
    bank.addUser(User("321", "Petr Arsentev"))
    var user: User? = bank.findUserByPassport("3211")
    println(user?.username)
    user = bank.findUserByPassport("321")
    println(user?.username)
}
