fun functionAsReturnType(): (Int) -> Int {
    fun addOne(number: Int): Int {
        return 1 + number
    }

    return ::addOne
}
