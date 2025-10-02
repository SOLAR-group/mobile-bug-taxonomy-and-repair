package original
// Ranges

fun withinRange(x: Int, y: Int): Boolean {
    return x in 1..y + 1
}

fun outOfRange(list: List<String>): Boolean {
    return list.size !in list.indices
}

fun iterateOverRange(): Int {
    var testValue = 0

    for (x in 1..5) {
        testValue += x
    }

    return testValue
}

fun iterateOverProgression(): Int {
    var testValue = 0

    for (x in 10 downTo 1 step 3) {
        testValue += x
    }

    return testValue
}