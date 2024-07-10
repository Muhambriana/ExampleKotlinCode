package Custom


fun main() {
    mutableVariable()
    immutableVariable()
}

fun mutableVariable() {
    val nilai: Int = 40
//     nilai = 99

    println("$nilai")
}

fun immutableVariable() {
    var nilai: Int = 40
    nilai = 99

    println("$nilai")
}