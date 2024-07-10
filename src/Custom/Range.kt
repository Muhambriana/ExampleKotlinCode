package Custom

fun main() {
    rangeDoubleDot()
}

fun rangeDoubleDot() {
    val range = 1..5
    // Akan mencetak angka terakhir dari range
    println(range.last)
}

fun rangeUntil() {
    val range = 1 until 5
    // Akan mencetak angka terakhir dari range
    println(range.last)
}