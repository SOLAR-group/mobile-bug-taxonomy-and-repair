package original

// Nullable values and null checks

fun parseInt(str: String): Int? {
	return str.toIntOrNull()
}

fun getProduct(arg1: String, arg2: String): Int? {
	val x = parseInt(arg1)
	val y = parseInt(arg2)

	if (x != null && y != null) {
		return (x * y)
	}
	else {
		println("'$arg1' or '$arg2' is not a number")
        return null
	}    
}

fun castNumber(arg1: String?, arg2: String?): Int? {
    val x = parseInt(arg1) 
  	val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return null
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return null
    }

    return (x * y)
}

fun getProductFromOptional(x: Int?, y: Int?): Int? {
	if (x != null && y != null) {
		return (x * y)
	}
	else {
		println("'$x' or '$y' is not a number.")
        return null
	}    
}