fun errorCatching(): String {
    try {
        val printerResponse = send(1040, "Bi Sheng")
        return printerResponse
    } catch (error: Exception) {
        return "Error"
    }
}