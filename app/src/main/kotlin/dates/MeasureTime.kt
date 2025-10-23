package dates

import kotlin.system.measureTimeMillis

fun main(){

    val time = measureTimeMillis {
        for (i in 1..1_000_000){
            val x = i * i
        }
    }

    println("Execution time: $time ms")
}