
Here is a possible solution to fix the bug(s) in the code:
```kotlin
class ObservedTriangle {
    var triangle: EquilateralTriangle
        set(value) {
            println("New value for triangle!")
            field = value
        }

    constructor(size: Double, name: String) {
        triangle = EquilateralTriangle(size, name)
    }
}
```
The bug in the original code is that the setter method for the `triangle` property has a typo in its parameter name. The correct parameter name should be `value`, not `newValue`. This is causing the compiler to report an error when trying to assign a new value to the `triangle` property.

To fix this bug, we can simply change the parameter name in the setter method to match the correct one. We also need to remove the unnecessary `Ꮻ` character before `newValue`.