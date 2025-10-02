enum class Rank(val rawValue: Int) {
    ace(1),
    two(2), three(3), four(4), five(5), six(6), seven(7), eight(8), nine(9), ten(10),
    jack(11), queen(12), king(13);
    companion object {
        operator fun invoke(rawValue: Int): Rank? = values().firstOrNull { it.rawValue == rawValue }
    }

    fun simpleDescription(): String {
        when (this) {
            ace -> return "ace"
            jack -> return "jack"
            queen -> return "queen"
            king -> return "king"
            else -> return String(rawValue)
        }
    }
}