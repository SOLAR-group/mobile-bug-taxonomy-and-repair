package transpilation

// Enumerations
enum class Suit {
    spades, hearts, diamonds, clubs;
    fun simpleDescription(): String {
        when (this) {
            spades -> return "spades"
            hearts -> return "hearts"
            diamonds -> return "diamonds"
            clubs -> return "clubs"
        }
    }
}

// Enumerations with raw values
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

// Instance of enumeration from raw value
fun makeEnumerationFromRawValue(): String? {
    var description: String? = null
    Rank(3)?.let { convertedRank ->
        description = convertedRank.simpleDescription()
    }

    return description
}

// Enumerations with associated values
enum class ServerResponse {
    result String String;
    failure String;
}

// Structs
data class Card(var rank: Rank, var suit: Suit) {
    fun simpleDescription(): String {
        return "The ${rank.simpleDescription()} of ${suit.simpleDescription()}"
    }
}

val threeOfSpades = Card(three, spades)
val threeOfSpadesDescription = threeOfSpades.simpleDescription()