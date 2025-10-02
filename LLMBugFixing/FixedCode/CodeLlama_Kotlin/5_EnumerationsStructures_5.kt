Here is the fixed code snippet with the bug removed: 
// Structs
data class Card(val rank: Rank, val suit: Suit) {
    fun simpleDescription() = "The ${rank.simpleDescription()} of ${suit.simpleDescription()}"
}

val threeOfSpades = Card(Rank.THREE, Suit.SPADES)
val threeOfSpadesDescription = "Three of spades" 