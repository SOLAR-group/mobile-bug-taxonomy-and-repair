data class SimpleStructure(private var simpleDescription: String = "A simple structure") : ExampleProtocol {
    override fun adjust() {
        simpleDescription += " (adjusted)"
    }
}