package control

/**
 * continue -> go to next iteration
 * break -> stop the loop
 */

fun main() {
    val students = listOf("Miguel", "Ana", "Lucas")

    for (student in students) {
        println("$student is in the class")
    }

    var attempts = 0
    do {
        println("Attempt number: $attempts")
        attempts++
    } while (attempts < 3)

    println("Countdown:")

    var i = 1
    while (true){
        if(i == 6) break

        println(i)
        i++
    }

    for (i in 5 downTo 1) {
        println(i)
    }
    println("Go!")
}
