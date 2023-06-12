fun divideNumbers(a: Int, b: Int): Int {
    return a / b
}

fun main() {
    val number1 = 1005
    val number2 = 25

    try {
        val result = divideNumbers(number1, number2)
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Terjadi kesalahan aritmatika: ${e.message}")
    } finally {
        println("Program selesai")
    }
}