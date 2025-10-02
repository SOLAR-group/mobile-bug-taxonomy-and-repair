fun makeEnumerationFromRawValue(): String? {
    var description: String? = null
    Rank(3)?.let { convertedRank ->
        description = convertedRank.simpleDescription()
    }

    return description
}