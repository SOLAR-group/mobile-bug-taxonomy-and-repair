// Class definition
class Shape {
    var numberOfSides = 0
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

// Object instantiation
var shape = Shape()

// Accessing properties
func accessClassProperties() {
    shape.numberOfSides = 7
}

// Accessing methods
func accessClassMethods() -> String {
    shape.numberOfSides = 2
    return shape.simpleDescription()
}

// Initializer and Deinitializer
// Superclasses
class NamedShape {
    var numberOfSides: Int = 0
    var name: String

    init(name: String) {
        self.name = name
    }

    deinit {
        // for cleanup before object is deallocated
    }

    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

// Subclasses
class Square: NamedShape {
    var sideLength: Double

    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 4
    }

    func area() -> Double {
        return sideLength * sideLength
    }

    override func simpleDescription() -> String {
        return "A square with sides of length \(sideLength)."
    }
}

// Getter/Setter
class EquilateralTriangle: NamedShape {
    var sideLength: Double = 0.0

    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 3
    }

    var perimeter: Double { 
        get {
            return 3.0 * sideLength
        }
        set (newValue) {
            sideLength = newValue / 3.0
        }
    }

    override func simpleDescription() -> String {
        return "An equilateral triangle with sides of length \(sideLength)."
    }
}

// Will Set
class ObservedTriangle {
    var triangle: EquilateralTriangle {
        willSet {
            print("New value for triangle!")
        }
    }
    init(size: Double, name: String) {
        triangle = EquilateralTriangle(sideLength: size, name: name)
    }
}

// Will Set accessing other variable
class TriangleAndSquare {
    var triangle: EquilateralTriangle {
        willSet {
            square.sideLength = newValue.sideLength
        }
    }
    var square: Square {
        willSet {
            triangle.sideLength = newValue.sideLength
        }
    }
    init(size: Double, name: String) {
        square = Square(sideLength: size, name: name)
        triangle = EquilateralTriangle(sideLength: size, name: name)
    }
}

// Optional accessing
let optionalSquare: Square? = Square(sideLength: 2.5, name: "optional square")
let sideLength = optionalSquare?.sideLength
