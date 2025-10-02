package transpilation

// Class definition
class Shape {
    var numberOfSides = 0
    fun simpleDescription(): String {
        return "A shape with ${numberOfSides} sides."
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
open class NamedShape(var name: String) {
    var numberOfSides: Int = 0
    {
        // for cleanup before object is deallocated
    }

    open fun simpleDescription(): String {
        return "A shape with ${numberOfSides} sides."
    }
}

// Subclasses
class Square(var sideLength: Double, name: String) : NamedShape(name) {
    init {
        numberOfSides = 4
    }

    fun area(): Double {
        return sideLength * sideLength
    }

    override fun simpleDescription(): String {
        return "A square with sides of length ${sideLength}."
    }
}

// Getter/Setter
class EquilateralTriangle(var sideLength: Double, name: String) : NamedShape(name) {
    init {
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
        return "An equilateral triangle with sides of length ${sideLength}."
    }
}

// Will Set
class ObservedTriangle {
    var triangle: EquilateralTriangle
        set(ᏫnewValue) {
            println("New value for triangle!")
            field = ᏫnewValue
        }

    constructor(size: Double, name: String) {
        triangle = EquilateralTriangle(size, name)
    }
}

// Will Set accessing other variable
class TriangleAndSquare {
    var triangle: EquilateralTriangle
        set(ᏫnewValue) {
            square.sideLength = ᏫnewValue.sideLength
            field = ᏫnewValue
        }

    var square: Square
        set(ᏫnewValue) {
            triangle.sideLength = ᏫnewValue.sideLength
            field = ᏫnewValue
        }

    constructor(size: Double, name: String) {
        square = Square(size, name)
        triangle = EquilateralTriangle(size, name)
    }
}

// Optional accessing
val optionalSquare: Square? = Square(2.5, "optional square")
val sideLength = optionalSquare?.sideLength