enum class Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS;

    fun simpleDescription(): String = when (this) {
        SPADES -> "spades"
        HEARTS -> "hearts"
        DIAMONDS -> "diamonds"
        else -> "clubs"
    }
}