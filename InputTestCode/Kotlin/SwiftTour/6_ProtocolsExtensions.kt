// import java.lang.Error

// Protocols
interface ExampleProtocol {
    var simpleDescription: String

    open fun adjust()
}

class SimpleClass: ExampleProtocol {
    override var simpleDescription: String = "A very simple class."
    var anotherProperty: Int = 69105

    override fun adjust() {
        simpleDescription += "  Now 100% adjusted."
    }
}

fun generateSimpleClass(): String {
    val a = SimpleClass()
    a.adjust()

    val protocolValue: ExampleProtocol = a

    return a.simpleDescription
}

data class SimpleStructure(val value1: Any?): ExampleProtocol {
    override var simpleDescription: String = "A simple structure"
    override fun adjust() {
        simpleDescription += " (adjusted)"
    }
}

fun generateSimpleStruct(): String {
    val b = SimpleStructure(null)
    b.adjust()
    return b.simpleDescription
}

// Extensions
val Int.simpleDescription: String
    get() = "The number ${this}"
// fun Int.adjust(): Int = this + 42

val seven = 7
val sevenDescription = seven.simpleDescription
var eight = 8

// fun makeUseOfExtension() {
//     eight = eight.adjust()
// }