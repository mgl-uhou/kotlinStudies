package functions

fun main() {
    // GLOSSARY (var, val, fun, class, double, String, int, false, true, null, ?, ?., ?:)
    // Nullables
    // Functions with or without parameters
    // Named parameters
    // Function Overloading (real overloading)

    val response: Int = additionInt(10, 4)
    println(response)

    println(operations(x = 2, y = 69))        // Two numbers
    println(operations(2, 69, 5)) // Three numbers

    canUDrive(18)

    userRegister(name= "Bruce", age = 18)
    userRegister("Amy", 22)
    userRegister(isAdmin = true, name = "Tiago", age = 26)
    userRegister("Jefferson", 23)
}

// Type function Unit: It's a Function without return. (It's the default function type. Don't need to declare it.)
fun additionInt(x: Int, y: Int): Int {
    return x + y
}

/**
 * This function has:
 * - Scoped functions (functions inside another)
 * - Inline body examples
 * - Function Overloading examples (two operations functions)
 * - Inline if/else
 */

// ▶️ Version with two parameters (Function Overloading)
fun operations(x: Int, y: Int): List<Int> {
    // Scoped functions with inline body
    fun addition(x: Int, y: Int): Int = x + y
    fun subtraction(x: Int, y: Int): Int = x - y

    return listOf(
        addition(x, y),
        subtraction(x, y)
    )
}

// ▶️ Overloaded version with three parameters
fun operations(x: Int, y: Int, z: Int): List<Int> {
    // Scoped functions with inline body
    fun addition(x: Int, y: Int, z: Int): Int = x + y + z
    fun subtraction(x: Int, y: Int, z: Int): Int = x - y - z

    return listOf(
        addition(x, y, z),
        subtraction(x, y, z)
    )
}

// Inline function with inline if/else
fun canUDrive(age: Int): Unit =
    if (age >= 18) println("You can drive!")
    else println("You cannot drive!")

// Default values
fun userRegister(name: String, age: Int, isAdmin: Boolean = false) {
    println("User was registered with name: $name, age: $age, admin: $isAdmin")
}