
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