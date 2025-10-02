package llm

// Variables

val a: Int = 1
val b = 2

fun deferredAssignment(): Int {
    val c: Int
    c = 3

    return c
}

var x = 5

fun inferredTypeAddition(): Int {
    var y = 5
    y += 1

    return y
}

var z = 0
fun incrementTopLevel() { 
    z += 1 
}