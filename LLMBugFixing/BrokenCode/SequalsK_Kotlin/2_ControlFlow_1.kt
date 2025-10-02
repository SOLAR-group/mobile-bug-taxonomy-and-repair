// Optional in if
fun checkOptionalValueInIf(optionalName: String?): String {
    var greeting = "Hello!"
    optionalName?.let { name ->
        greeting = "Hello, ${name}"
    }

    return greeting
}
