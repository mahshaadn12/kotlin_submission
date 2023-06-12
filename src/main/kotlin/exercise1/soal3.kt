package exercise1

fun myGroup(): String {
    val groupMembers = listOf("April", "Mitha", "Sutan", "Miftah", "Mahsha") // daftar anggota grup
    val myName = groupMembers[4] // Mengakses item yang berisi nama diri sendiri

    return myName
}

fun main() {
    val result = myGroup()
    println(result)
}