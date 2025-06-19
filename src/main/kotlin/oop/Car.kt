package oop

//import kotlin.reflect.full.memberProperties

class Car {
    var name: String = "Car"
    var motor: Double = 2.0
    val colour: String = "Silver"

    fun start(): Unit {
        println("Rundundundundundundundundundun")
    }
}

fun main(){
    var car1: Car = Car()

    car1.name = "Mustang"
    car1.motor = 2.4
    println(car1.colour)
    println(car1.motor)
    car1.start()

    println(car1)
}

/*
fun printProperties(obj: Any){
    val kClass = obj::class
    println("Properties of ${kClass.simpleName}")
    for (prop in kClass.memberProperties) {
        val value = prop.getter.call(obj)
        println("${prop.name} = $value")
    }
}*/
