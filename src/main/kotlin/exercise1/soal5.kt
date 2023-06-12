fun groupDetail(groupId: Int, groupMember: List<String>, session: String) {
    println("Group ID: $groupId")
    println("Group Member: ${groupMember.joinToString(", ")}")
    println("Session: $session")
}

fun main() {
    val groupId = 6
    val groupMember = listOf("April", "Mitha", "Sutan", "Mahsha","Miftah")
    val session = "Afternoon"

    groupDetail(groupId, groupMember, session)
}