package oop

class People {
    var firstName: String
    constructor(firstName: String){ // Secondary Constructor
        this.firstName = firstName
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

    val p = People("Mikaelly")
    println(person)
    println(p)
    println(person === p)
}