package custom

fun main() {
    breakForEachLoop()
}

fun getRange(): IntRange {
    return 1..10
}

fun getIntArray(): Array<Int> {
    val array = arrayOf(1,2,3,4,5)
    return array
}

fun getStringArray(): Array<String> {
    val array = arrayOf("Satu", "Dua", "Tiga", "Empat", "Lima")
    return array
}

fun getArray2(): Array<*> {
    val array = arrayOf(1,2,3,4,"ABC")
    return array
}

fun forLooping() {
    val listData = getIntArray()

    for (data in listData) {
        println(data)
    }
}

fun forEachLooping() {
    val listData = getIntArray()

    listData.forEach {
        println(it)
    }
}

fun forEachLooping2() {
    val listData = getIntArray()

    listData.forEach { value ->
        println(value)
    }
}

fun forLoopingWithIndex() {
    val listData = getIntArray()

    for ((index, value) in listData.withIndex()) {
        println("Index ke-$index isi value nya $value")
    }
}

fun forEachLoopingWithIndex() {
    val listData = getIntArray()

    listData.forEachIndexed { index, value ->
        println("Index ke-$index isi value nya $value")
    }
}

fun breakAndContinueForLoop() {
    val listData = getStringArray()

    // Hanya mencetak value dari array yang sama dengan "Tiga". Lalu break
    for (value in listData) {
        if (value == "Tiga") {
            println("Value = $value")
            break
        }
    }

    // Hanya mencetak value dari array yang index nya sama dengan 5. Lalu break
    for ((index, value) in listData.withIndex()) {
        if (index == 5) {
            println("Index ke-$index isi value nya $value")
            break
        }
    }

    // Hanya mencetak value dari index yang Genap
    for ((index, value) in listData.withIndex()) {
        if (index % 2 == 1) {
            continue
        }
        println("Index ke-$index isi value nya $value")
    }
}

fun breakForEachLoop() {
    val listData = getStringArray()


    // Hanya mencetak value dari array yang sama dengan "Tiga". Lalu Stop
//    run myBreak@{
//        listData.forEach { value ->
//            if (value == "Tiga") {
//                println("Value = $value")
//                return@myBreak
//            }
//        }
//    }

    listData.forEachIndexed { index, value ->
        if (index % 2 == 1) {
            return@forEachIndexed
        }
        println("Index ke-$index isi value nya $value")
    }
}


