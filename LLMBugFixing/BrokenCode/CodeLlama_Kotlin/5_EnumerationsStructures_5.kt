// Structs
data class Card(val rank: Rank, val suit: Suit) {
    fun simpleDescription() = "The ${rank.simpleDescription()} of ${suit.simpleDescription()}"
}

val threeOfSpades = Card(Rank.THREE, Suit.SPADES)
val threeOfSpadesDescription = threeOfSpades.simpleDescription()
