package oop

//import kotlin.reflect.full.memberProperties

class Car1 {
    // secondary constructor, fixed
    var name: String = "Car"
    var motor: Double = 2.0
    val colour: String

    init {
        colour = "Silver"
    }

    fun start(): Unit {
        println("Rundundundundundundundundundun")
    }
}

class Car2(name: String, var year: Int = 2000){ // primary constructor, dynamic
    var name: String = name
}

class Car3(
    var colour: String,
    var year: Int
){
    // lateinit var registrationNumber: String
    var registrationNumber: String = ""

    // Secondary constructor must always call the primary constructor
    constructor(colour: String, year: Int, registrationNumber: String): this(colour, year){
        this.registrationNumber = registrationNumber
    }
}

fun car(){
    val car1: Car1 = Car1()

    car1.name = "Mustang"
    car1.motor = 2.4
    println(car1.colour)
    println(car1.motor)
    car1.start()

    println(car1)

    val car2: Car2 = Car2("Cayenne")
    println(car2.name)
    println(car2.year)
    car2.year = 2012
    println(car2.year)

    val car3 = Car3("Black", 2024) // -> Using the primary constructor
    println(car3.registrationNumber) // -> Problem with lateinit, it must be initialized
    val myCar3 = Car3("Dark Blue", 2023, "xpto") // -> Using the secondary constructor
    println(myCar3.registrationNumber)
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
