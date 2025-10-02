enum class ServerResponse {
    RESULT("success", "result"), FAILURE("error", "failure");

    fun simpleDescription(): String = when (this) {
        RESULT -> "result"
        else -> "failure"
    }
}