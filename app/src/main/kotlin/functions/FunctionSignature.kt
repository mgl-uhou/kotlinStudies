package functions

fun main(){
    var resultAdd: (Int, Int) -> Int // Function Signature
    resultAdd = ::addition // Function attribution
    // Use :: to reference a function without calling it
    println(resultAdd(2, 2))
    println(addition(2, 2))
}

fun addition(n1: Int, n2: Int): Int = n1 + n2