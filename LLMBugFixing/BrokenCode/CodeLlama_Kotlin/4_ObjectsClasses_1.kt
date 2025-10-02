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
