package oop

class Car {
    var motor: Double = 2.0
    val colour: String = "Prata"

    fun start(): Unit {
        println("Rundundundundundundundundundun")
    }
}

fun main(){
    var mustang: Car = Car()

    mustang.motor = 2.4
    println(mustang.colour)
    println(mustang.motor)
    mustang.start()
}