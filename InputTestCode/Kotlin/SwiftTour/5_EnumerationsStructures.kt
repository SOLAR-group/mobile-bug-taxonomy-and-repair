// Enumerations
enum class Suit {
    spades, hearts, diamonds, clubs;

    fun simpleDescription(): String {
        return when (this) {
            spades -> "spades"
            hearts -> "hearts"
            diamonds -> "diamonds"
            clubs -> "clubs"
        }
    }
}

// Enumerations with raw values
enum class Rank(val rawValue: Int) {
    ace(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    jack(11),
    queen(12),
    king(13);

    fun simpleDescription(): String {
        return when (this) {
            ace -> "ace"
            jack -> "jack"
            queen -> "queen"
            king -> "king"
            else -> this.rawValue.toString()
        }
    }
}

enum class Rank_alt(val rawValue: Int) {
    ace(1),
    two(2),
    three(3),
    four(4),
    five(5),
    six(6),
    seven(7),
    eight(8),
    nine(9),
    ten(10),
    jack(11),
    queen(12),
    king(13);

    fun simpleDescription(): String {
        var res: String;

        when (this) {
            ace -> res = "ace"
            jack -> res = "jack"
            queen -> res = "queen"
            king -> res = "king"
            else -> res = this.rawValue.toString()
        }

        return res;
    }
}

// Instance of enumeration from raw value
fun makeEnumerationFromRawValue(): String? {
    var description: String? = null

    val convertedRank: Rank? = Rank.values().firstOrNull { it.rawValue == 3 }
    description = convertedRank.let {
        convertedRank!!.simpleDescription()
    }

    return description
}


// Enumerations with associated values
// https://tonny.medium.com/kotlin-vs-swift-enumeration-1dfbec668f0a
sealed class ServerResponse

data class ServerResponseResult(val value1: String, val value2: String): ServerResponse()
data class ServerResponseFailure(val value1: String): ServerResponse()

// Structs
data class Card(var rank: Rank, var suit: Suit) {
    fun simpleDescription(): String {
        return "The ${rank.simpleDescription()} of ${suit.simpleDescription()}"
    }
}

val threeOfSpades = Card(Rank.three, Suit.spades)
val threeOfSpadesDescription = threeOfSpades.simpleDescription()

