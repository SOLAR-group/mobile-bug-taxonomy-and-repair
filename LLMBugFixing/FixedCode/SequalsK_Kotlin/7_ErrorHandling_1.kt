```kotlin
enum class PrinterError(val rawValue: Error) {
    outOfPaper(0),
    noToner(1),
    onFire(2);
}
```
The code above contains two bugs:

1. The `rawValue` parameter of the enum constructor should be a String, not an Int.
2. The `outOfPaper`, `noToner`, and `onFire` values are not in the correct order.

Here's the corrected code:
```kotlin
enum class PrinterError(val rawValue: String) {
    outOfPaper("0"),
    noToner("1"),
    onFire("2");
}
```