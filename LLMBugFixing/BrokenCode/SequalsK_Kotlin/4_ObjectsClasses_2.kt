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