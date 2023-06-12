package exercise3

fun evaluateScore(score: Int): String {
    var result: String = ""

    if (score >= 90) {
        result = "Selamat! Anda mendapatkan nilai A."
    } else if (score in 80..89) {
        result = "Anda mendapatkan nilai B."
    } else if (score in 70..79) {
        result = "Anda mendapatkan nilai C."
    } else if (score in 60..69) {
        result = "Anda mendapatkan nilai D."
    } else {
        result = "Anda mendapatkan nilai E."
    }

    return result
}

fun main() {
    val score = 92
    val evaluation = evaluateScore(score)
    println(evaluation)
}