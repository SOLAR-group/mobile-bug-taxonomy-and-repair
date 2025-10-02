enum class PrinterError(val errorName: String) {
    OUT_OF_PAPER("outOfPaper"),
    NO_TONER("noToner"),
    ON_FIRE("onFire")
}

fun sendJob(job: Int, printerName: String): String? {
    return when (printerName) {
        "Never Has Toner" -> throw PrinterError.NO_TONER
        else -> "Job sent"
    }
}

fun errorCatching(): String {
    try {
        val printerResponse = sendJob(1040, "Bi Sheng")
        return printerResponse
    } catch (e: PrinterError) {
        return "Error"
    }
}

val printerSuccess = tryOrNull { sendJob(1884, "Mergenthaler") }
val printerFailure = tryOrNull { sendJob(1885, "Never Has Toner") }
