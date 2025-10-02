import java.io.IOException
import java.lang.Exception

// Error enum
sealed class PrinterError {
    data class outOfPaper(val error: String): Exception()
    data class noToner(val error: String): Exception()
    data class onFire(val error: String): Exception()
}

// Error throwing
@Throws (IOException::class)
fun send(job: Int, printerName: String): String {
    if (printerName == "Never Has Toner") {
        throw Exception(PrinterError.noToner("noToner"))
    }
    return "Job sent"
}

// Error catching
fun errorCatching(): String {
    return try {
        send(job = 1040, "Bi Sheng")
    } catch (err: Exception) {
        "There has been an error"
    }
}

fun errorCatching_2(): String {
    try {
        return send(job = 1040, "Bi Sheng")
    } catch (err: Exception) {
        return "There has been an error"
    }
}

// Optional handling
val printerSuccess = try {
    send(1884, "Mergenthaler")
} catch (e: Exception) {}
val printerFailure = try {
    send(1885, "Never Has Toner")
} catch (e: Exception) {}

// Defer
var fridgeIsOpen = false
val fridgeContent = arrayOf("milk", "eggs", "leftovers")

fun fridgeContains(food: String): Boolean {
    fridgeIsOpen = true

    val result = fridgeContent.contains(food)
    return result
}

fun useDefer() {
    try {
        fridgeContains("banana")
    } catch (err: Exception) {}
    finally {
        fridgeIsOpen = false
    }
}