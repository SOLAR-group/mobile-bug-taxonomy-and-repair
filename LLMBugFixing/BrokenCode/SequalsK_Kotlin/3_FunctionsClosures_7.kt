val numbers: MutableList<Int> = mutableListOf(20, 19, 7, 12)
val containsLessThanTen = functionAsArgument(numbers, ::lessThanTen)

// Closure
fun closure(): MutableList<Int> {
    return numbers.map({
        number: Int ->
        val result = 3 * number
        result
    })
}