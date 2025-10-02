package llm
// Here is the equivalent Kotlin code for the given Swift code:
// ```kotlin
// // Iterating Array
val individualScores = listOf(75, 43, 103, 87, 12)
var teamScore = 0

fun iterateArray() {
    for (score in individualScores) {
        if (score > 50) {
            teamScore += 3
        } else {
            teamScore += 1
        }
    }
}

// Iterating Dictionary
val interestingNumbers = mapOf(
    "Prime" to listOf(2, 3, 5, 7, 11, 13),
    "Fibonacci" to listOf(1, 1, 2, 3, 5, 8),
    "Square" to listOf(1, 4, 9, 16, 25)
)
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

// While
var n = 2

fun useWhile() {
    while (n < 100) {
        n *= 2
    }
}

// Repeat-while
var m = 2

fun useRepeat() {
    repeat(while (m < 100)) {
        m *= 2
    }
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

    if (optionalName != null) {
        greeting = "Hello, ${optionalName}"
    }

    return greeting
}

// Default value for optional values
fun checkDefaultValue(nickname: String?): String {
    val fullName = "John Appleseed"
    val informalGreeting = "Hi ${nickname ?: fullName}"

    return informalGreeting
}

// Switch statements
fun switchStatement(vegetable: String): String {
    when (vegetable) {
        "celery" -> return "Add some raisins and make ants on a log."
        "cucumber", "watercress" -> return "That would make a good tea sandwich."
        else -> {
            if (vegetable.endsWith("pepper")) {
                return "Is it a spicy ${vegetable}?"
            }
        }
    }

    return "Everything tastes good in soup."
}
// ```
// Note that in Kotlin, the `for` loop syntax is different from Swift's, and the `while` loop is replaced with a `repeat-while` loop. Also, Kotlin does not have built-in support for dictionaries, so we use the `mapOf()` function to create a map of lists instead. Finally, Kotlin uses the `?:` operator for conditional expressions instead of Swift's `if let`.