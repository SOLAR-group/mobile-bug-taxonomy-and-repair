open class NamedShape(var name: String) {
    var numberOfSides: Int = 0
    {
        // for cleanup before object is deallocated
    }

    open fun simpleDescription(): String {
        return "A shape with ${numberOfSides} sides."
    }
}