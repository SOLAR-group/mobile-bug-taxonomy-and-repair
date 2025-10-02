package transpilation

// Generic function
fun <Item> makeArray(@argLabel("repeating") item: Item, numberOfTimes: Int): MutableList<Item> {
    val result: MutableList<Item> = mutableListOf()
    for (i in 0 until numberOfTimes) {
        result.add(item)
    }

    return result
}

// Generic enum
enum class OptionalValue {
    none;
    Wrapped;
}

// Requirements for Generic
fun <T : Sequence, U : Sequence> anyCommonElements(@argLabel("_") lhs: T, @argLabel("_") rhs: U): Boolean T Element Equatable T Element U Element {
    for (lhsItem in lhs) {
        for (rhsItem in rhs) {
            if (lhsItem == rhsItem) {
                return true
            }
        }
    }

    return false
}