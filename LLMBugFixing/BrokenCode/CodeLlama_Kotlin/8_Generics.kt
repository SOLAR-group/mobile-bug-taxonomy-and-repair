fun <Item> makeArray(repeating: Item, numberOfTimes: Int): Array<Item> {
    val result = arrayListOf<Item>()
    for (i in 0..numberOfTimes - 1) {
        result.add(repeating)
    }
    return result.toTypedArray()
}

enum class OptionalValue<Wrapped>(private val value: Wrapped? = null) {
    NONE("none"),
    SOME(value)
}

fun <T, U> anyCommonElements(lhs: T, rhs: U): Boolean where T : Sequence<*>, U : Sequence<*>, T.Element == U.Element {
    return lhs.any(rhs::contains) || rhs.any(lhs::contains)
}
