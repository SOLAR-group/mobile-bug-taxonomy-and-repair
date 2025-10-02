// Optional in if
fun checkOptionalValueInIf(optionalName: String?): String {
    var greeting = "Hello!"

    if (optionalName != null) {
        greeting = "Hello, ${optionalName}"
    }

    return greeting
}