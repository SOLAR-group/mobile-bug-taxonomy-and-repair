
The bugs in this code snippet are:

1. The `numberOfSides` variable is not initialized properly. It should be set to 3 in the constructor.
2. The `perimeter` property getter and setter have inconsistent implementations. The getter returns 3 times the value of `sideLength`, while the setter sets `sideLength` equal to `newValue` divided by 3.
3. The `simpleDescription()` method does not return a description that accurately reflects the properties of the equilateral triangle. It should return a string that includes the length of each side, like "An equilateral triangle with sides of length $sideLength".

Here is the fixed code snippet:
```kotlin
class EquilateralTriangle(var sideLength: Double, name: String) : NamedShape(name) {
    init {
        numberOfSides = 3
    }

    var perimeter: Double
        get() = 3.0 * sideLength
        set(newValue) {
            sideLength = newValue / 3.0
        }

    override fun simpleDescription(): String {
        return "An equilateral triangle with sides of length $sideLength."
    }
}
```