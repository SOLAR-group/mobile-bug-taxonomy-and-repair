package transpilation

// Protocols
interface ExampleProtocol {
    val simpleDescription: String
    fun adjust()
}

class SimpleClass : ExampleProtocol {
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

data class SimpleStructure(var simpleDescription: String = "A simple structure") {
    override fun adjust() {
        simpleDescription += " (adjusted)"
    }
}

fun generateSimpleStruct(): String {
    var b = SimpleStructure()
    b.adjust()
    return b.simpleDescription
}

// Extensions
val Int.simpleDescription: String
    get() {
        return "The number ${this}"
    }

fun Int.adjust() {
    this += 42
}

val seven = 7
val sevenDescription = seven.simpleDescription
var eight = 8
fun makeUseOfExtension() {
    eight.adjust()
}