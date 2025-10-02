To fix the bug in this code snippet, we can modify the `set` method of the `numberOfSides` property to ensure that the value set is always positive. Here's the fixed version of the code:
```kotlin
class NamedShape(name: String) : Shape() {
    override var numberOfSides: Int = 0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Number of sides must be positive")
            }
        }
    var name: String = name
}
```
In the original code, the `set` method only checks if the new value is greater than 0. However, this is not sufficient to ensure that the value set is always positive. We can fix this by adding a check for a non-positive value and printing an error message if such a value is encountered.

Additionally, we can remove the `get` method of the `numberOfSides` property as it's not needed.
```kotlin
class NamedShape(name: String) : Shape() {
    override var numberOfSides: Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Number of sides must be positive")
            }
        }
    var name: String = name
}
```