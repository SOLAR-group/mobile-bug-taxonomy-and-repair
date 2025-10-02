Remove the line eight.adjust() as this is not a valid way to invoke an adjust function on a value of type Int. 
Here's the corrected code:
fun Int.adjust() {
    this += 42
}
val seven = 7
val sevenDescription = seven.simpleDescription
var eight = 8
fun makeUseOfExtension() {}