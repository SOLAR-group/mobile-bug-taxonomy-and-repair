fun functionAsArgument(list: MutableList<Int>, condition: (Int) -> Boolean): Boolean {
    for (item in list) {
        if (condition(item)) {
            return true
        }
    }

    return false
}