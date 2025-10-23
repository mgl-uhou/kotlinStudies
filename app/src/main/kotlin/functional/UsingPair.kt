package functional

data class Student (val name: String, val firstNote: Double, val secondNote: Double)

fun main(){
    val student = Student("Miguel", 10.00, 5.00)
    val (avg, status) = avgStudent(student)

    println("Name: ${student.name}")
    println("Average: $avg")
    println("Status: $status")
}

fun avgStudent(student: Student): Pair<Double, String> {
    val avg: Double = (student.firstNote + student.secondNote) / 2
    var status: String = ""
    if (avg >= 6) {
        status = "Approved"
    } else {
        status = "Reproved"
    }

    return Pair(avg, status)
}