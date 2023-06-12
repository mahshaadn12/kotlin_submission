package exercise2

fun main() {
    val evenNumbers = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            evenNumbers.add(i)
        }
    }

    println(evenNumbers)
}