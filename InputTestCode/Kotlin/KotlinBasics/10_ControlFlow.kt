package original
// Control flow

fun forIn(items: Array<String>): String {
    var testString = "";

    for (item in items) {
        testString += item
    }

    return testString
}

fun forInIndex(items: Array<String>): Int {
    var testValue = 0

    for (index in items.indices) {
        testValue += index
    }

    return testValue
}

fun forInIndexPlaceholder(items: Array<String>): Int {
    var testValue = 0

    for (index in items.indices) {
        testValue += index
    }

    return testValue
}

fun whileLoop(): Int {
    var count = 0

    while (count < 15) {
        count += 1
    }

    return count
}

fun describe(obj: Any): String =
	when (obj) {
		1 -> "One"
		"Hello" -> "Greeting"
		is Long -> "Long"
		!is String -> "Not a string"
		else -> "Unknown"
	}

fun translateNumber(num: Int): String {
    when (num) {
        1 -> return "One"
        2 -> return "Two"
        3 -> return "Three"
        4 -> return "Four"
        5 -> return "Five"
        else -> return "Number not known."
    }
}