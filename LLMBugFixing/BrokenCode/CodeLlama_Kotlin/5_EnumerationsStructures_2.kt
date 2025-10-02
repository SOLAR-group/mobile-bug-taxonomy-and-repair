enum class Rank(val value: Int) {
    ACE(1), TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

    fun simpleDescription(): String = when (this.value) {
        1 -> "ace"
        11 -> "jack"
        12 -> "queen"
        13 -> "king"
        else -> this.value.toString()
    }
}
