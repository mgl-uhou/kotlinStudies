package control

fun main () {
    multiplicationTable(5)
}

fun multiplicationTable(number: Int){
    for(i in 1..10){
        println("$number x $i = ${number * i}")
    }
}