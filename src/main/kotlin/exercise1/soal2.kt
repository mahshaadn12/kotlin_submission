package exercise1


fun groupDetail(groupId: Int, groupMember: List<Any>, session: String): Any {
    return "Kelompok: $groupId, anggota: $groupMember, sesi tampil : $session"
}

fun main() {
    val groupId = 1
    val groupMember = listOf("Lisa", "Jennie", "Rose", "Jisoo")
    val session = "14.30-15.00"

    println(groupDetail(groupId, groupMember, session))
}