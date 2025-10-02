package transpilation

// Error Enum
enum class PrinterError(val rawValue: Error) {
    outOfPaper(0),
    noToner(1),
    onFire(2);
}

// Error throwing
fun send(job: Int, @argLabel("toPrinter") printerName: String): String {
    if (printerName == "Never Has Toner") {
        throw PrinterError.noToner
    }

    return "Job sent"
}

// Error catching
fun errorCatching(): String {
    try {
        val printerResponse = send(1040, "Bi Sheng")
        return printerResponse
    } catch (error: Exception) {
        return "Error"
    }
}

//Optional handling
val printerSuccess = try {send(1884, "Mergenthaler")} catch(e: Throwable) {null}
val printerFailure = try {send(1885, "Never Has Toner")

// Defer
} catch(e: Throwable) {null}
var fridgeIsOpen = false
val fridgeContent = arrayOf("milk", "eggs", "leftovers")
fun fridgeContains(@argLabel("_") food: String): Boolean {
    fridgeIsOpen = true
    {
        fridgeIsOpen = false // is always executed
    }

    val result = fridgeContent.contains(food)
    return result
}

fun useDefer() {
    fridgeContains("banana")
}