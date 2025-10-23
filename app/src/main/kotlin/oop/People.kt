package oop

class People {
    var firstName: String
    constructor(firstName: String){ // Secondary Constructor
        this.firstName = firstName
    }

    override fun equals(other: Any?): Boolean = when{ // == automatically calls this function
        /*if (this === other) return true
        if (other !is People) return false
        return this.firstName == other.firstName*/

        // Example with no when above

        this === other -> true
        other !is People -> false
        else -> this.firstName == other.firstName
    }

    override fun hashCode(): Int {
        return this.firstName.hashCode() * 31
    }
}

class People2(var firstName: String) {
    lateinit var lastName: String // In this case, it's necessary to use lateinit
    constructor(lastName: String, firstName: String):this(firstName){
        this.lastName = lastName
    }
}

fun main(){
    val person = People("Miguel")
    println(person.firstName)

    val person2 = People2(firstName = "Waleska")
    println(person2.firstName)
    person2.lastName = "Laurentino"
    println(person2.firstName + " " + person2.lastName)

    val p = People("Miguel")
    println(person)
    println(p)
    println(person == p)
    println(person.hashCode())
    println(person.hashCode() == p.hashCode())
}