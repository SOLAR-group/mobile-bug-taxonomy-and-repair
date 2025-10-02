
Here is a possible fix for the bug in the code:
```
enum class ServerResponse {
    RESULT("success", "result"), FAILURE("error", "failure");

    fun simpleDescription(): String = when (this) {
        RESULT -> "result"
        else -> "failure"
    }
}
```
The bug in the code is that the `simpleDescription()` function returns a string that is always either "result" or "failure", regardless of the actual value of the `ServerResponse` enum. To fix this, we need to use the `this` keyword to refer to the current instance of the enum, and then check its value in the `when` expression.

Here's the fixed code:
```
enum class ServerResponse {
    RESULT("success", "result"), FAILURE("error", "failure");

    fun simpleDescription(): String = when (this) {
        RESULT -> "result"
        else -> "failure"
    }
}
```