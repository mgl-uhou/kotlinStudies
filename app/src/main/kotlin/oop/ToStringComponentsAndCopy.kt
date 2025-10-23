package oop

import kotlin.random.Random
import kotlin.random.nextLong

data class Product(var id: Long, var name: String){
    override fun toString(): String {
        return "ID: ${this.id}\nName: ${this.name}"
    }
}
//The following only needs to be created,
// if desired, in a common class.
// A data class automatically generates the copy,
// toString, Components, hashCode, and equals functions.
/*{

    override fun equals(other: Any?): Boolean = when {
        this === other        -> true
        other !is Product     -> false
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
*/

fun toStringComponentsAndCopy(){

    val product1 = Product(randomId(), "Cama King Casal")
    println(product1)

    val (id, name) = Product(id = randomId(), name = "Travesseiro")
    println("$id, $name")

    val product2 = product1.copy()
    println(product2)

    println(product1 == product2)
}

fun randomId(): Long = Random.nextLong(100000000000, 999999999999)
