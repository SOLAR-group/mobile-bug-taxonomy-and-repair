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