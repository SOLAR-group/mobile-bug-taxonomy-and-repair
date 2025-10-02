package llm
// Here is the equivalent Kotlin code for the given Swift code:
// ```kotlin
// // Enumerations
enum class Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS;

    fun simpleDescription(): String = when (this) {
        SPADES -> "spades"
        HEARTS -> "hearts"
        DIAMONDS -> "diamonds"
        else -> "clubs"
    }
}

// Enumerations with raw values
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

// Instance of enumeration from raw value
fun makeEnumerationFromRawValue(): String? {
    var description: String? = null

    if (Rank(rawValue = 3) != null) {
        description = Rank(rawValue = 3).simpleDescription()
    }

    return description
}

// Enumerations with associated values
enum class ServerResponse {
    RESULT("success", "result"), FAILURE("error", "failure");

    fun simpleDescription(): String = when (this) {
        RESULT -> "result"
        else -> "failure"
    }
}

// Structs
data class Card(val rank: Rank, val suit: Suit) {
    fun simpleDescription() = "The ${rank.simpleDescription()} of ${suit.simpleDescription()}"
}

val threeOfSpades = Card(Rank.THREE, Suit.SPADES)
val threeOfSpadesDescription = threeOfSpades.simpleDescription()
// ```
// Note that in Kotlin, enums are defined using the `enum` keyword, and associated values are defined using the `=` operator. In addition, Kotlin does not have a concept of raw values for enums like Swift does, so we need to define the raw value explicitly in this case. Also, unlike Swift, Kotlin uses `null` instead of `nil` to represent a nullable type.