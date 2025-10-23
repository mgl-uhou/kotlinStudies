package dates

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    val now = LocalDateTime.now()
    val format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
    val dateFormated = now.format(format)
    println(dateFormated)
}