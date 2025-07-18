package oop

class Piece(var id: Long, var name: String){

    override fun equals(other: Any?): Boolean = when {
        this === other        -> true
        other !is Piece       -> false
        else                  -> this.id == other.id && this.name == other.name
    }

    override fun hashCode(): Int {
        return this.id.hashCode() + this.name.hashCode() * 31
    }

    override fun toString(): String {
        // When printing an object of Piece class (println(object))
        // It will be printed ⬇️
        return "ID: ${this.id} \nName: ${this.name}"
    }
}

fun main(){

    val piece1 = Piece(923456789423, "Cama Box Casal")
    println(piece1)
}