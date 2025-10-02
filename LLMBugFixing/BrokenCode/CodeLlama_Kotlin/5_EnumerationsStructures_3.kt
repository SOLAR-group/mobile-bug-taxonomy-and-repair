fun makeEnumerationFromRawValue(): String? {
    var description: String? = null

    if (Rank(rawValue = 3) != null) {
        description = Rank(rawValue = 3).simpleDescription()
    }

    return description
}