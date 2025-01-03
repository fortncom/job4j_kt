package ru.job4j.lambda.bank

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import ru.job4j.lambda.Account

class BankServiceTest {

    private lateinit var bank: BankService
    private lateinit var user: User
    private lateinit var account: Account

    @BeforeEach
    fun setUp() {
        bank = BankService()
        val name = "Petr Arsentev";
        val passport = "321"
        user = User(passport, name)
        bank.addUser(user)
        val requisite = "1B2C"
        account = Account(name, 1000L, requisite)
        bank.addAccount(passport, account)
    }

    @Test
    fun findAccountByRequisite() {
        val rsl = bank.findAccountByRequisite(user.passport, account.requisite)
        assertThat(rsl).isEqualTo(account)
    }

    @Test
    fun findUserByPassport() {
        val rsl: User? = bank.findUserByPassport(user.passport)
        assertThat(rsl).isEqualTo(user)
    }

    @Test
    fun transferMoney() {
        val name = "Anatoliy Gromov";
        val passport = "456"
        val requisite = "3D4E"
        val userDest = User(passport, name)
        bank.addUser(userDest)
        val accountDest = Account(name, 0L, requisite)
        bank.addAccount(passport, accountDest)
        val rsl = bank.transferMoney(user.passport, account.requisite, passport, requisite, 1000.0)
        assertThat(rsl).isEqualTo(true)
        assertThat(account.balance).isEqualTo(0)
        assertThat(accountDest.balance).isEqualTo(1000L)
    }
}
