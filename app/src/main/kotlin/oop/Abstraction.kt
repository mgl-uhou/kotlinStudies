package oop

/*
* Abstraction means showing only the important details of an
* object to the outside world and hiding its internal complexity.
*
* You interact with what it does, not how it does it.
*/

// Abstract class = a blueprint
abstract class Shape {
    abstract fun draw() // No implementation here
}

class Circle : Shape() {
    override fun draw() {
        println("Drawing a circle...")
    }
}

fun main() {
    val shape: Shape = Circle()
    shape.draw() // We know it draws, but no how it's done inside.
}