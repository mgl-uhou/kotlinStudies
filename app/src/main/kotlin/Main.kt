fun main() {
    // var is used to mutable variables
    // val is used to immutable variables
    // primitive types: String, Double, Int, Byte
//    println("Hello World!")

    // Special Characters
    // \n it's used for a line break
    // \t it's used for tab (4 blank spaces)

    // TEXT
    var name: String = "Miguel" // String is an array of character
    // var character: Char = "M" // Char is one character
    name = "Mikaelly"
    val nameSize = name.length
    val newName = name.uppercase() //name.lowercase()

    // NUMBER
    val price: Double = 3.14              // 64 bits
    val desconto: Float = 1.3f            // 32 bits
    var age: Int = 18                     // use 32 bits (it's used 99% of the time)
    val byte: Byte = 8                    // use only 8 bits
    val short: Short = 16                 // use 16 bits
    val long: Long = 41234703248975014L   // use 64 bits

    // BOOLEAN
    val isTrue: Boolean = true // use 1 byte (8 bits)

    // Camel Case Standard
    val avgMedia = 22.9
    val answer = avgMedia.toInt()

    val prod: Long = 1_000_345 // underlining is just for visualisation

    // Text Formating

    // 1.
    var message = "Hi Miguel. \nYour product is arrived."

    message = """
        Hi Miguel. 
        Your product is arrived.
    """.trimIndent()

    // 2.
    val csv = """
        Texto1, 
        Texto2
    """.replaceIndent(";")

    // 3.
    name = "Miguel"
    age = 18
    // println("Hello $name. You're $age years old. After 10 years you'll be ${age + 10} years old.")

    // CONDITIONS
    // ( <, >, <=, >=, !, ==, !=, &&, || )
    val nameProduct = "iPhone 15"
    // if(nameProduct.length < 3) println("Anything") // It's can be done
    if (nameProduct.length < 3) {
        println("You cannot register products with a name shorter than 3 characters.")
    } else if (nameProduct.length > 30) {
        println("You cannot register products with a name bigger than 30 characters.")
    }else {
        println("It's ok!")
    }

    // Accept null (nullable)
    var product: String? = "iMac"
    product = null

    // Null Verification
    if(product != null){
        val qtdCharProd = product.length
        println(qtdCharProd) // Don't print null
    }
    // Or
    var qtdCharProd: Int? = if(product != null) product.length else 0
    println(qtdCharProd) // Print 0 or some other number
    // Or
    qtdCharProd = product?.length
    println(qtdCharProd) // Print null yet
    // Or
    qtdCharProd = product?.length ?: 0 // the same as if else inline
    println(qtdCharProd) // Print 0 or some other number
}
