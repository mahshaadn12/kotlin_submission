package exercise1

fun main() {
    myProfile()
}

fun myProfile() {
    val firstName: String = "Mahsha" // Ganti dengan nama depan Anda
    val lastName: String = "Adni" // Ganti dengan nama belakang Anda
    val age: Int = 21  // Ganti dengan umur Anda
    val Single: Boolean = true // Ganti dengan status pernikahan Anda (true jika single, false jika tidak)

    println("Nama depan: $firstName")
    println("Nama belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (Single) "Single" else "Tidak Single"}")
}