data class SimpleStructure(var simpleDescription: String = "A simple structure") {
    override fun adjust() {
        simpleDescription += " (adjusted)"
    }
}