fun main() {
    println("=== Null Safety in Kotlin ===")

    // 🔸 Normal declaration (cannot be null)
    val name: String = "Miguel"
    println("Name: $name")

    // 🔸Nullable declaration
    val lastName: String? = null
    println("Last Name: $lastName")

    // 🔹 Safe Call Operator (?.)
    println("Last Name length (safe call): ${lastName?.length}") // Doesn't break, returns null

    // 🔹 Elvis Operator (?:)
    val lastNameSize = lastName?.length ?: 0 // If null, it's 0
    println("Last Name length with Elvis operator: $lastNameSize")

    // 🔹 Not-null assertion (!!)
    // Caution: Force access as non-null. If it's null → NullPointerException.
    try {
        println("Forcing access: ${lastName!!.length}")
    } catch (e: Exception) {
        println("Expected error with '!!': ${e.message}")
    }

    // 🔹 let → Execute the block code if it's non-null
    val nickname: String? = "Migs"
    nickname?.let {
        println("Nickname exists and it is: $it")
    }

    val nicknameNull: String? = null
    nicknameNull?.let {
        println("Doesn't run because it's null")
    }

    // 🔸 Smart Cast
    if (lastName != null) {
        println("Smart Cast working: ${lastName.length}")
    } else {
        println("Last Name is null, smart cast doesn't word")
    }

    // 🔸 Function with Nullable Parameter
    checksText(null)
    checksText("Kotlin")

    // 🔸 Elvis + throw (A mandatory case)
    val user: String? = null
    val userValid = user ?: throw IllegalArgumentException("User cannot be null")
    println("User is validated: $userValid")
}

// 🔸 Function that handles with Nullable
fun checksText(text: String?) {
    text?.let {
        println("Text has ${it.length} characters")
    } ?: println("Text is null")
}
