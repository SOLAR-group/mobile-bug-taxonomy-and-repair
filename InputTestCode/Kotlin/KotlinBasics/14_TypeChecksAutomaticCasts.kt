package original

// Type checks and automatic casts

fun getStringLength1(obj: Any): Int? {

	if (obj is String) {
		return obj.length
	}

	return null
}

fun getStringLength2(obj: Any): Int? {
	if (obj !is String) return null

	return obj.length
}

fun getStringLength3(obj: Any): Int? {
	if (obj is String && obj.length > 0) {
			return obj.length
	}

	return null
}

fun automaticCastOneVariable(arg1: Int?): Int? {
    if (arg1 != null) {
        return arg1 * 2
    } else {
        return null
    }
}