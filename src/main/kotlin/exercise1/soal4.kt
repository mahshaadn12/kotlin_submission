package exercise1

fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Shasa", "Hasan", "Reza")
    val countOfGroup = 6

    val total = mentor.size + countOfGroup

    return total
}

fun main() {
    myProfile()

    val myGroup: String = "Wobilotation"
    println("My Group is: $myGroup")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")
}