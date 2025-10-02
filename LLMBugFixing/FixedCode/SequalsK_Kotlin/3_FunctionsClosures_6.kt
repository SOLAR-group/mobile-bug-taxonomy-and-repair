To fix the bug in this Kotlin code snippet, you can replace the line `return number < 10` with `return number <= 10`. This will ensure that the function returns true if the input number is less than or equal to 10, rather than only returning true if the input number is strictly less than 10.

Here's the corrected code:
```kotlin
fun lessThanTen(number: Int): Boolean {
    return number <= 10
}
```