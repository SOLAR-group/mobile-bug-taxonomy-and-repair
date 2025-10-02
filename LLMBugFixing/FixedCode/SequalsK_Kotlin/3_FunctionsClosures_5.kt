The bug in this Kotlin code is that it returns false even if there are matching elements in the list.  The return value should be true if there are any matching elements in the list and the functionAsArgument() method returns true only if all elements in the list meet the condition. This can be achieved by changing the return value to true for each item that meets the condition, as follows:

fun functionAsArgument(list: MutableList<Int>, condition: (Int) -> Boolean): Boolean {
    for (item in list) {
        if (condition(item)) {
            return true
        }
        else {
            return false
        }
    }
}

However, this can be optimized by using the 'all' function that checks whether all elements of a collection match a predicate. It returns true if all elements satisfy the condition and false otherwise:

fun functionAsArgument(list: MutableList<Int>, condition: (Int) -> Boolean): Boolean {
    return list.all { condition(it) }
}

The last example is a more concise way to implement the same logic as above, but it is not necessarily easier to understand for beginners.