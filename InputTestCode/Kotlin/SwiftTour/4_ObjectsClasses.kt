package ObjectClasses

import java.lang.Exception

// Class definition
class Shape {
    var numberOfSides = 0
    fun simpleDescription(): String {
        return "A shape with $numberOfSides sides."
    }
}

// Object instantiation
var shape = Shape()

// Accessing properties
fun accessClassProperties() {
    shape.numberOfSides = 7
}

// Accessing methods
fun accessClassMethods(): String {
    shape.numberOfSides = 2

    return shape.simpleDescription()
}
// Initializer and Deinitializer
// Superclasses
open class NamedShape {
    var numberOfSides: Int = 0
    var name: String

    constructor(name: String) {
        this.name = name
    }

    protected fun finalize() {
        // https://kotlinlang.org/docs/java-interop.html#finalize
    }

    open fun simpleDescription(): String {
        return "A shape with $numberOfSides sides."
    }
}

// Subclasses
class Square : NamedShape {
    var sideLength: Double

    constructor(name: String, sideLength: Double): super(name) {
        this.sideLength = sideLength
        numberOfSides = 4

    }

    fun area(): Double {
        return sideLength * sideLength
    }

    override fun simpleDescription(): String {
        return "A square with sides of length $sideLength."
    }
}

// Getter/Setter
class EquilateralTriangle: NamedShape {
    var sideLength: Double = 0.0

    constructor(sideLength: Double, name: String): super(name) {
        this.sideLength = sideLength
        numberOfSides = 3
    }

    var perimeter: Double
        get() {
            return 3.0 * sideLength
        }
        set(newValue) {
            sideLength = newValue / 3.0
        }


    override fun simpleDescription(): String {
        return "An equilateral triangle with sides of length $sideLength."
    }
}

// Will Set
class ObservedTriangle {
    var triangle: EquilateralTriangle
        set(newValue) {
            println("New value for triangle!")

            field = newValue
        }

    constructor(size: Double, name: String) {
        triangle = EquilateralTriangle(size, name)
    }
}

// Will Set accessing other variable
class TriangleAndSquare {
    var triangle: EquilateralTriangle
        set(newValue) {
            try {
                willSetTriangle(newValue)
            } catch (err: Exception) {
                println(err.localizedMessage)
            }

            field = newValue
        }

    private fun willSetTriangle(newValue: EquilateralTriangle) {
        square.sideLength = newValue.sideLength
    }

    var square: Square
        set(newValue) {
            try {
                willSetSquare(newValue)
            } catch (err: Exception) {
                println(err.localizedMessage)
            }

            field = newValue
        }

    private fun willSetSquare(newValue: Square) {
        triangle.sideLength = newValue.sideLength
    }

    constructor(size: Double, name: String) {
        triangle = EquilateralTriangle(size, name)
        square = Square(name, size)
    }
}

// Optional accessing
val optionalSquare: Square? = Square("optional square", 2.5)
val sideLength = optionalSquare?.sideLength
