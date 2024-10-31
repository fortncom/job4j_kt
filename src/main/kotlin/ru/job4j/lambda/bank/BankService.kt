package ru.job4j.lambda.bank

import ru.job4j.lambda.Account

class BankService {

    private val users: HashMap<User, ArrayList<Account?>> = HashMap()

    fun addUser(user: User?) {
        user?: return
        users.putIfAbsent(user, ArrayList())
    }

    fun findByRequisite(passport: String?, requisite: String?): Account? {
        val user: User = findByPassport(passport) ?: return null
        return users[user]!!.stream()
            .filter { account: Account? -> account?.requisite == requisite }
            .findFirst()
            .orElse(null)
    }

    fun addAccount(passport: String?, account: Account?) {
        val user: User = findByPassport(passport) ?: return
        users[user]!!.add(account)
    }


    fun findByPassport(passport: String?): User? {
        for (user in users.keys) {
            if (user.passport == passport) {
                return user
            }
        }
        return null
    }

    fun transferMoney(
        srcPassport: String?, srcRequisite: String?,
        destPassport: String?, descRequisite: String?, amount: Double
    ): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
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
    var user: User? = bank.findByPassport("3211")
    println(user?.username)
    user = bank.findByPassport("321")
    println(user?.username)
}
