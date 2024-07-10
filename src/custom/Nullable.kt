package custom

fun main() {

}

fun notNullableVariable() {
//    var name: String = null
//    println(name)
}

fun nullableVariable() {
    var name: String? = null
    name = "Alex"

    println(name)
}

// Mendapatkan panjang karakter sebuah string
fun getLengthOfString() {
    var title: String? = null
//    val length = title.length

//    println("Panjang Karakter: $length")
}


fun getName(isFlag: Boolean): String? {
    if (isFlag == false) {
        return null
    }

    return "Alex"
}
