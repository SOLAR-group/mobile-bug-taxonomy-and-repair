package transpilation

// Iterating Array
val individualScores = intArrayOf(75, 43, 103, 87, 12)
var teamScore = 0
fun iterateArray() {
    for (score in individualScores) {
        if (score > 50) {
            teamScore += 3
        } else {
            teamScore++
        }
    }
}

// Iterating Dictionary
val interestingNumbers = mapOf("Prime" to intArrayOf(2, 3, 5, 7, 11, 13), "Fibonacci" to intArrayOf(1, 1, 2, 3, 5, 8), "Square" to intArrayOf(1, 4, 9, 16, 25))
var largest = 0
fun iterateDictionary() {
    for ((key, numbers) in interestingNumbers) {
        for (number in numbers) {
            if (number > largest) {
                largest = number
            }
        }
    }
}

fun iterateDictionaryPlaceholder() {
    for ((_, numbers) in interestingNumbers) {
        for (number in numbers) {
            if (number > largest) {
                largest = number
            }
        }
    }
}

// While
var n = 2
fun useWhile() {
    while (n < 100) {
        n *= 2
    }
}

var m = 2
fun useRepeat() {
    do {
        m *= 2
    } while (m < 100)
}

// Range
var total = 0
fun useRange() {
    for (i in 0 until 4) {
        total += i
    }
}

// Optional values
fun checkOptionalValue(optionalString: String?): Boolean {
    return optionalString == null
}

// Optional in if
fun checkOptionalValueInIf(optionalName: String?): String {
    var greeting = "Hello!"
    optionalName?.let { name ->
        greeting = "Hello, ${name}"
    }

    return greeting
}

// Default value for optional values
fun checkDefaultValue(nickname: String?): String {
    val fullName: String = "John Appleseed"
    val informalGreeting = "Hi ${nickname ?: fullName}"
    return informalGreeting
}

// Switch statements
fun switchStatement(vegetable: String): String {
    when (vegetable) {
        "celery" -> return "Add some raisins and make ants on a log."
        "cucumber", "watercress" -> return "That would make a good tea sandwich."
        -> return "Is it a spicy ${x}?"
        else -> return "Everything tastes good in soup."
    }
}