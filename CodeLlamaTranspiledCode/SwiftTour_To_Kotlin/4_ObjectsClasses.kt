package llm
// ```kotlin
class Shape {
    var numberOfSides: Int = 0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Number of sides must be positive")
            }
        }

    fun simpleDescription(): String {
        return "A shape with $numberOfSides sides."
    }
}

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

class Square : NamedShape() {
    constructor(name: String, sideLength: Double): this(name) {
        numberOfSides = 4
        field = sideLength
    }

    override var numberOfSides: Int = 0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Number of sides must be positive")
            }
        }
    var sideLength: Double = 0.0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Side length must be positive")
            }
        }
    fun area(): Double {
        return sideLength * sideLength
    }
}

class EquilateralTriangle : NamedShape() {
    constructor(name: String, sideLength: Double): this(name) {
        numberOfSides = 3
        field = sideLength
    }

    override var numberOfSides: Int = 0
        get() = field
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("Number of sides must be positive")
            }
        }
    var sideLength: Double = 0.0
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

class ObservedTriangle {
    var triangle: EquilateralTriangle? = null
        willSet {
            println("New value for triangle!")
        }
}

class TriangleAndSquare {
    var triangle: EquilateralTriangle? = null
        willSet {
            square.sideLength = newValue?.sideLength ?: 0.0
        }
    var square: Square? = null
        willSet {
            triangle.sideLength = newValue?.sideLength ?: 0.0
        }
}

val optionalSquare: Square? = Square(name = "optional square", sideLength = 2.5)
val sideLength = optionalSquare?.sideLength
// ```