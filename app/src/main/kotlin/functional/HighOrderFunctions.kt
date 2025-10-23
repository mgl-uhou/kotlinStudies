package functional

fun main(){
    println(calc(4, 9, ::add))
    // Using Anonymous Functions
    println(calc(5, 9, fun(a: Int, b: Int) = a - b))
}

// High Order Functions have another function as an argument
fun calc(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int = operation(n1, n2)

fun add(n1: Int, n2: Int): Int = n1 + n2
