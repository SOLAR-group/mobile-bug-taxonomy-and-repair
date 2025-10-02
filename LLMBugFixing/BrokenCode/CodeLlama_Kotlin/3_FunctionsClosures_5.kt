fun functionAsArgument(list: List<Int>, condition: (Int) -> Boolean): Boolean {
    for (item in list) {
        if (condition(item)) {
            return true
        }
    }
    return false
}