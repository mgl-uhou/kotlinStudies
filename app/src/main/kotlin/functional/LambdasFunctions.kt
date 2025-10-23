package functional

fun main(){
    // Using Lambdas Functions
    println(calc(9, 9, {a, b -> a * b}))

    val lambda1: (Int, Int) -> Int = {a, b -> a + b}
    val lambda2 = {a: Int, b: Int -> a - b}
    val testFunc = fun(a: Int, b: Int) = a * b
    val lambda3 = {a: Int, b: Int ->
        println("Starting the operation")
        a + b // Auto return the last instruction
    }
    val lambda4: (Int, Int) -> Int = {a, b ->
        println("Starting the operation")
        a * b // It was typed, then the last instruction must return an integer
    }

    println(calc(5, 3) {a, b -> a - b}) // Can call the lambda function after the parenthesis

    println(lambda1)
    println(lambda2(10, 3))
    println(testFunc)
    println(lambda2)
    println(lambda3(3, 4))
    println(lambda4(3, 4))
}