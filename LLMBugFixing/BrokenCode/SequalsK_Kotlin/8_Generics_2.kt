
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