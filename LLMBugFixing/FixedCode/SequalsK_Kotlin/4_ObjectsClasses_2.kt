Delete lines of code:
```
class Square(var sideLength: Double, name: String) : NamedShape(name) {
    override fun simpleDescription(): String {
        return "A square with sides of length ${sideLength}."
    }
}
```
Insert library import statements:
```
import kotlin.math.sqrt

class Square(var sideLength: Double, name: String) : NamedShape(name) {
    override fun area(): Double {
        return sideLength * sideLength
    }
    init {
        numberOfSides = 4
    }
}
```
Insert skeleton code for Kotlin-specific concepts or keywords, such as the 'when' expression, 'set' statement, the 'in' or '!in' keyword and the '.let' concept:
```
class Square(var sideLength: Double, name: String) : NamedShape(name) {
    override fun simpleDescription(): String {
        return when {
            sideLength > 0 -> "A square with sides of length ${sideLength}."
            else -> throw IllegalArgumentException("Side length must be positive")
        }
    }
    set(value) {
        if (value < 0) throw IllegalArgumentException("Side length must be positive")
        sideLength = value
    }
}
```