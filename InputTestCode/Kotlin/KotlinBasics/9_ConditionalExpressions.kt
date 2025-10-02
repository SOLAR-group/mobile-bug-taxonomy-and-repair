package original

// Conditional expressions

fun conditional(a: Int, b: Int): Int {
	if (a > b) {
		return a
	} else {
		return b
	}
}

fun conditionalAsExpression(a: Int, b: Int) = if (a > b) a else b