package llm
// Here's the equivalent Kotlin code:
// ```kotlin
// Generic function
fun <Item> makeArray(repeating: Item, numberOfTimes: Int): Array<Item> {
    val result = arrayListOf<Item>()
    for (i in 0..numberOfTimes - 1) {
        result.add(repeating)
    }
    return result.toTypedArray()
}

// Generic enum
enum class OptionalValue<Wrapped>(private val value: Wrapped? = null) {
    NONE("none"),
    SOME(value)
}

// Requirements for Generic
fun <T, U> anyCommonElements(lhs: T, rhs: U): Boolean where T : Sequence<*>, U : Sequence<*>, T.Element == U.Element {
    return lhs.any(rhs::contains) || rhs.any(lhs::contains)
}
// ```
// Note that Kotlin doesn't have the same concept of generics as Swift does, so we need to use type parameters instead. Additionally, we can't use `inout` parameters in Kotlin like we can in Swift, so we need to use a different approach for the function that takes an `inout` parameter.

// Also, notice that in Kotlin, we need to specify the type of the generic parameters explicitly when using them, unlike Swift where we can infer the types based on the context.