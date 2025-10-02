// Functions

fun typedFunction(a: Int, b: Int): Int {
    return a + b
}

fun callFunc(): Int {
    return typedFunction(1, 2)
}

fun functionBodyAsExpression(a: Int, b: Int) = a + b

fun voidReturnValueWithUnit(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun voidReturnValue(a: Int, b: Int) {
	println("sum of $a and $b is ${a + b}")
}