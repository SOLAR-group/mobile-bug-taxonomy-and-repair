fun send(job: Int, @argLabel("toPrinter") printerName: String): String {
    if (printerName == "Never Has Toner") {
        throw PrinterError.noToner
    }

    return "Job sent"
}

val printerSuccess = try {send(1884, "Mergenthaler")} catch(e: Throwable) {null}
val printerFailure = try {send(1885, "Never Has Toner")
