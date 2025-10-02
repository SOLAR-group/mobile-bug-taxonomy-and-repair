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