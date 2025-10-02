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