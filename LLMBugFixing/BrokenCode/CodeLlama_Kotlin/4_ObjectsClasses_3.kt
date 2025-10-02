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