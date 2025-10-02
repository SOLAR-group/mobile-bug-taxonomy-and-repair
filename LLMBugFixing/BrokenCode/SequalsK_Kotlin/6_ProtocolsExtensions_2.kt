fun Int.adjust() {
    this += 42
}

val seven = 7
val sevenDescription = seven.simpleDescription
var eight = 8
fun makeUseOfExtension() {
    eight.adjust()
}