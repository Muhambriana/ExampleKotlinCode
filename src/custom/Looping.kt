package custom

fun main() {
    forEachLoopingWithIndex()
}

fun getRange(): IntRange {
    return 1..10
}

fun getArray(): Array<Int> {
    val array = arrayOf(1,2,3,4,5)
    return array
}

fun getArray2(): Array<*> {
    val array = arrayOf(1,2,3,4,"ABC")
    return array
}

fun forLooping() {
    val listData = getArray()

    for (data in listData) {
        println(data)
    }
}

fun forEachLooping() {
    val listData = getArray()

    listData.forEach {
        println(it)
    }
}

fun forEachLooping2() {
    val listData = getArray()

    listData.forEach { data ->
        println(data)
    }
}

fun forEachLoopingWithIndex() {
    val listData = getArray()

    listData.forEachIndexed { index, data ->
        println("Index ke-$index isi nilai nya $data")
    }
}


