package Custom

fun main() {
    ifElseEkspression2()
}

fun getNilai(): Int {
    return 84
}

fun ifElseEkspression() {
    val nilai = getNilai()
    val kkm = 85

    if (nilai >= kkm) { // Jika nilai lebih dari sama dengan kkm
        println("Lulus")
    } else { // Jika nilai kurang dari kkm
        println("Tidak Lulus")
    }
}

fun tipsIfElseEkspression() {
    val nilai = getNilai()
    val kkm = 85

    if (nilai < kkm) { // Jika nilai lebih dari sama dengan kkm
        println("Tidak Lulus")
        return
    }
    println("Lulus")
}

// Menentukan grade IPK bedasarkan nilai
fun ifElseEkspression2() {
    val nilai = getNilai()
    var grade: String? = null

    if (nilai in 85..100) {
        grade = "A"
    } else if (nilai in 75..84) {
        grade = "B"
    } else if (nilai in 60..74) {
        grade = "C"
    } else if (nilai in 45..59) {
        grade = "D"
    } else if (nilai in 0..44) {
        grade = "E"
    } else {
        grade = null
    }

    println(grade)

}

fun whenExpression() {
    val nilai = getNilai()
    var grade: String? = null
    when (nilai) {
        in 85..100 -> {
            grade = "A"
        }
        in 75..84 -> {
            grade = "B"
        }
        in 60..74 -> {
            grade = "C"
        }
        in 45..59 -> {
            grade = "D"
        }
        in 0..44 -> {
            grade = "E"
        }
        else -> {
            grade = null
        }
    }

    println(grade)
}

fun whenExpression2() {
    val nilai = getNilai()
    val grade = when (nilai) {
            in 85..100 -> "A"
            in 75..84 -> "B"
            in 60..74 -> "C"
            in 45..59 -> "D"
            in 0..44 -> "E"
            else -> null
        }

    println(grade)
}

fun ekpressionsAndRange() {
    val nilai = getNilai()
    val batasAtas = 85
    val batasBawah = 45

    if (nilai in batasBawah until batasAtas) {
        println("Nilai Berada Diantara Batas Bawah Dan Batas Bawah")
    } else {
        println("Nilai Tidak Berada Diantara Batas Bawah Dan Batas Bawah")
    }
}