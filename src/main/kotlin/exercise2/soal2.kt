package exercise2

fun main() {
    val monthMap = mapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "Mar" to "Maret",
        "Apr" to "April",
        "May" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Aug" to "Agustus",
        "Sep" to "September",
        "Oct" to "October",
        "Nov" to "November",
        "Dec" to "Desember"
    )

    monthMap.forEach { (key, value) ->
        println("$key -> $value")
    }

    val monthNow = "Jun" // bulan sekarang
    val birthMonth = "Dec" // bulan kelahiran

    println("It's $monthNow now, And I was born in ${monthMap[birthMonth]}")
}