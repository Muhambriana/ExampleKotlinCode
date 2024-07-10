package Custom

fun main() {

    val name = "Muham"
    val age = 23
    val user = setUser(name, age)
//    val user = getUser(name, age)
//    println(user)
}

// Function tanpa mengembalikan nilai
fun setUser(name: String, age: Int) {
    println("Nama anda adalah $name, dan umur anda sekarang adalah $age tahun")
}

// Function dengan memngembalikan nilai
fun getUser(name: String, age: Int): String {
    return "Nama anda adalah $name, dan umur anda sekarang adalah $age tahun"
}