class SimpleClass(private var simpleDescription: String = "A very simple class.", private var anotherProperty: Int = 69105) : ExampleProtocol {
    override fun adjust() {
        simpleDescription += "  Now 100% adjusted."
    }
}