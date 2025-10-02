The bug in this code is that it does not initialize the `sideLength` property when the object is constructed. This causes a null pointer exception when trying to access the property's value. To fix this, we can add an initializer for the `sideLength` property in the primary constructor:
```kotlin
class EquilateralTriangle(name: String, sideLength: Double) : NamedShape() {
    private var numberOfSides = 3
    var sideLength: Double = sideLength
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Side length must be positive")
            }
        }
    var perimeter: Double
        get() = 3.0 * sideLength
        set(value) {
            sideLength = value / 3.0
        }
}
```
Also, the `numberOfSides` property should be initialized in the primary constructor as well:
```kotlin
class EquilateralTriangle(name: String, sideLength: Double) : NamedShape() {
    private var numberOfSides = 3
    var sideLength: Double = sideLength
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Side length must be positive")
            }
        }
    var perimeter: Double
        get() = 3.0 * sideLength
        set(value) {
            sideLength = value / 3.0
        }
}
```