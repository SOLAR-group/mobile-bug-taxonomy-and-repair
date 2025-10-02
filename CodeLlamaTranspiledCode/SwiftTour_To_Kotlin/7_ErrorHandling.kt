package llm
// Here is the equivalent Kotlin code:
// ```kotlin
// Error Enum
enum class PrinterError(val errorName: String) {
    OUT_OF_PAPER("outOfPaper"),
    NO_TONER("noToner"),
    ON_FIRE("onFire")
}

// Error throwing
fun sendJob(job: Int, printerName: String): String? {
    return when (printerName) {
        "Never Has Toner" -> throw PrinterError.NO_TONER
        else -> "Job sent"
    }
}

// Error catching
fun errorCatching(): String {
    try {
        val printerResponse = sendJob(1040, "Bi Sheng")
        return printerResponse
    } catch (e: PrinterError) {
        return "Error"
    }
}

//Optional handling
val printerSuccess = tryOrNull { sendJob(1884, "Mergenthaler") }
val printerFailure = tryOrNull { sendJob(1885, "Never Has Toner") }

// Defer
var fridgeIsOpen: Boolean = false
val fridgeContent = listOf("milk", "eggs", "leftovers")

fun fridgeContains(food: String): Boolean {
    fridgeIsOpen = true
    try {
        return fridgeContent.contains(food)
    } finally {
        fridgeIsOpen = false // is always executed
    }
}

fun useDefer() {
    fridgeContains("banana")
}
// ```
// Note that the `try` block in Kotlin is used to catch a specific exception type, while the Swift code uses the `do-catch` statement to catch any thrown error. In Kotlin, you can also use the `runCatching` function to catch any thrown exception and return a nullable result instead of using the `try?` operator.

// Also, in Kotlin, the `defer` block is not necessary because it is automatically executed when the function returns.