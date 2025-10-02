The bug in the code is that the makeArray function returns an array of nullable items instead of an array of non-nullable items. This is because the value parameter of the OptionalValue enum is marked as nullable with a question mark. To fix this, we can remove the question mark from the value parameter, like this:
```
enum class OptionalValue<Wrapped>(private val value: Wrapped) {
    NONE("none"),
    SOME(value)
}
```
This will make the value parameter non-nullable and the function will return an array of non-nullable items.

Another bug in the code is that the anyCommonElements function does not correctly check if two sequences have any common elements. The function should use the contains method instead of the any method, like this:
```
fun <T, U> anyCommonElements(lhs: T, rhs: U): Boolean where T : Sequence<*>, U : Sequence<*>, T.Element == U.Element {
    return lhs.contains(rhs) || rhs.contains(lhs)
}
```
This will ensure that the function correctly checks if two sequences have any common elements.

Here is the fixed code snippet:
```
fun <Item> makeArray(repeating: Item, numberOfTimes: Int): Array<Item> {
    val result = arrayListOf<Item>()
    for (i in 0..numberOfTimes - 1) {
        result.add(repeating)
    }
    return result.toTypedArray()
}

enum class OptionalValue<Wrapped>(private val value: Wrapped) {
    NONE("none"),
    SOME(value)
}

fun <T, U> anyCommonElements(lhs: T, rhs: U): Boolean where T : Sequence<*>, U : Sequence<*>, T.Element == U.Element {
    return lhs.contains(rhs) || rhs.contains(lhs)
}
```