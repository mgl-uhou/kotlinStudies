package oop

import kotlin.random.Random
import kotlin.random.nextLong

class Product(var id: Long, var name: String){

    override fun equals(other: Any?): Boolean = when {
        this === other        -> true
        other !is Product       -> false
        else                  -> this.id == other.id && this.name == other.name
    }

    override fun hashCode(): Int {
        return this.id.hashCode() + this.name.hashCode() * 31
    }

    override fun toString(): String {
        // When printing an object of product class (println(object))
        // It will be printed ⬇️
        return "ID: ${this.id} \nName: ${this.name}"
    }

    operator fun component1() = this.id
    operator fun component2() = this.name

    fun copy(id: Long = this.id, name: String = this.name) = Product(id, name)
}

fun main(){

    val product1 = Product(randomId(), "Cama King Casal")
    println(product1)

    val (id, name) = Product(id = randomId(), name = "Travesseiro")

    println("$id, $name")
}

fun randomId(): Long = Random.nextLong(100000000000, 999999999999)