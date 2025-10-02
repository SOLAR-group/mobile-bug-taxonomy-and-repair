package llm
// ```kotlin
// Protocols
interface ExampleProtocol {
    val simpleDescription: String get()
    fun adjust()
}

class SimpleClass(private var simpleDescription: String = "A very simple class.", private var anotherProperty: Int = 69105) : ExampleProtocol {
    override fun adjust() {
        simpleDescription += "  Now 100% adjusted."
    }
}

fun generateSimpleClass(): String {
    val a = SimpleClass()
    a.adjust()

    return a.simpleDescription
}

data class SimpleStructure(private var simpleDescription: String = "A simple structure") : ExampleProtocol {
    override fun adjust() {
        simpleDescription += " (adjusted)"
    }
}

fun generateSimpleStruct(): String {
    val b = SimpleStructure()
    b.adjust()

    return b.simpleDescription
}

// Extensions
interface Int : ExampleProtocol {
    val simpleDescription: String get() = "The number $this"
    fun adjust() {
        this += 42
    }
}

val seven = 7
val sevenDescription = seven.simpleDescription
var eight = 8

fun makeUseOfExtension() {
    eight.adjust()
}
// ```