package oop

import kotlin.random.Random

// By default, classes in Kotlin are final and cannot be inherited.
// The 'open' keyword allows a class to be subclassed or inherited from.
// This is fundamental for creating class hierarchies and reusing code.
open class User(
    val id: Int,
    val name: String,
    email: String,
) {
    var email = email
        private set

    fun setEmail(email: String) {
        if (email.length < 10) return println("E-mail invalid")
        this.email = email
    }

    open fun showInfo(){
        println("Name: $name \nE-mail: $email")
    }
}

class Employee(
    id: Int,
    name: String,
    email: String,
    var position: String
) : User(id, name, email) {
    override fun showInfo(){
        println("Name: $name\nE-mail: $email\nPosition: $position")
    }
}

class Customer(
    id: Int,
    name: String,
    email: String,
    var loyaltyPoints: Int,
) : User(id, name, email) {
    override fun showInfo() {
        println("Name: $name\nE-mail: $email\nLoyalty Points: $loyaltyPoints")
    }
}

// An abstract class is a class that cannot be instantiated on its own.
// It serves as a blueprint for other classes to inherit from.
// Abstract classes can have both abstract and non-abstract properties and functions.
abstract class Vehicle(val model: String, val year: Int, val brand: String){
    // An abstract function is a function without a body.
    // It must be implemented by any non-abstract class that inherits from the abstract class.
    abstract fun makeSound()

    override fun toString(): String {
        return "Model: ${this.model} \nYear: ${this.year} \nBrand: ${this.brand} "
    }
}

class Car(
    model: String,
    year: Int,
    brand: String
) : Vehicle(model, year, brand) {
    override fun makeSound() {
        println("vruuuunnn vruuuun")
    }
}

fun main() {
    val employee = Employee(
        Random.nextInt(1, 9999),
        "Miguel Laurentino",
        "mfl10@gmail.com",
        "Manager"
    )
    println(employee.id)
    employee.showInfo()

    val costumer = Customer(
        id = Random.nextInt(1, 99999),
        name = "Valdemar Souza",
        loyaltyPoints = 10,
        email = "vald.sz@gmail.com"
    )
    println(costumer.id)
    costumer.showInfo()

    println("")
    for (i in 1..15){
        print("=-")
    }
    println("=")

    // It is not possible to create an instance of an abstract class directly.
    // The following line would cause a compilation error because Vehicle is abstract.
    // val car = Vehicle("Ka", 2012, "Ford")
    // car.makeSound()

    val car = Car("Ka", 2012, "Ford")
    println(car)
    for (i in 1..15){
        print("=-")
    }
    println("=")
    println()
    car.makeSound()
}