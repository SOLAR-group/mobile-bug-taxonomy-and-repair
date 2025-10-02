fun functionAsReturnType(): ((Int) -> Int) {
    fun addOne(number: Int): Int {
        return number + 1
    }
    return addOne
}