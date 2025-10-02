In this code snippet, there is a bug in the `if` statement. The condition `optionalName != null` is checking if the variable `optionalName` is not equal to `null`, but it should be checking if the optional value is present or not.

Here's the fixed code:
```kotlin
fun checkOptionalValueInIf(optionalName: String?): String {
    var greeting = "Hello!"

    if (optionalName?.let{it} != null) {
        greeting = "Hello, ${optionalName}"
    }

    return greeting
}
```
The `?.let` operator is used to safely unwrap the optional value and check if it's present. If the value is present, then the block of code inside the `if` statement will be executed.

Also, note that I have removed the unnecessary variable `greeting2`.