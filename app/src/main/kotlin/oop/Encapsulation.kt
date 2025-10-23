package oop

// Kotlin Visibility Modifiers:
// - public: (default) Visible everywhere.
// - internal: Visible within the same module (e.g., a Gradle project).
// - protected: Visible within the class and its subclasses.
// - private: Visible only within the same class or file.

/**
 * Represents a bank account with basic deposit and withdrawal functionalities.
 * The balance is encapsulated and can only be modified through its methods.
 */
class BankAccount(
    // 'owner' is public and read-only.
    val owner: String,
    // 'agency' and 'accountNumber' are fully private.
    private val agency: Int,
    private val accountNumber: Long
) {
    // The balance has a public getter but a private setter.
    var balance: Double = 0.0
        private set

    fun deposit(amount: Double) {
        if (isInvalid(amount)) {
            println("Deposit amount must be positive.")
            return
        }
        balance += amount
        println("Deposit of $$amount successful.")
    }

    fun withdraw(amount: Double) {
        if (isInvalid(amount)) {
            println("Withdrawal amount must be positive.")
        } else if (isGreaterThanBalance(amount)) {
            println("Insufficient balance to withdraw $$amount.")
        } else {
            balance -= amount
            println("Withdrawal of $$amount successful.")
        }
    }

    /**
     * Checks if the transaction amount is valid (greater than zero).
     */
    private fun isInvalid(amount: Double): Boolean = amount <= 0

    /**
     * Checks if the requested amount exceeds the current balance.
     */
    private fun isGreaterThanBalance(amount: Double): Boolean = amount > balance

    override fun toString(): String {
        return "Owner: $owner\nAgency: $agency\nAccount: $accountNumber\nBalance: $$balance"
    }
}

fun main() {
    val myAccount: BankAccount = BankAccount("Miguel Laurentino", 321, 8343_9871_8756_8374)
    myAccount.deposit(300.00)
    // With a public getter, you can access 'balance' directly.
    println("My current balance: $${myAccount.balance}")

    myAccount.withdraw(50.00)
    println("My current balance: $${myAccount.balance}")

    // This withdrawal will now print a clear "Insufficient balance" message.
    myAccount.withdraw(300.00)
    println("My current balance: $${myAccount.balance}")

    // This will print "Withdrawal amount must be positive."
    myAccount.withdraw(-900.00)
    println(myAccount)
}