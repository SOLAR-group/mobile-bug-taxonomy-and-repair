
Here is the fixed code: 

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