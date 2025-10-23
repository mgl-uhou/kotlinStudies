package control

fun main(){
    /*
        Crie uma função chamada gradeStatus(score: Int): String que receba uma nota de 0 a 100 e retorne uma string com o status do aluno, de acordo com a nota:
        90..100 → "Excellent"
        70..89 → "Good"
        50..69 → "Average"
        0..49 → "Fail"
        Fora desse intervalo → "Invalid score"
     */

    val studentGrade: Int = 100
    println("The Student Status Grade is: ${gradeStatus(studentGrade)}")
}

fun gradeStatus(score: Int): String{
    return when (score) {
        in 90..100 -> "Excellent"
        in 70..89 -> "Good"
        in 50..69 -> "Average"
        in 0..49 -> "Fail"
        else -> "Invalid score"
    }
}