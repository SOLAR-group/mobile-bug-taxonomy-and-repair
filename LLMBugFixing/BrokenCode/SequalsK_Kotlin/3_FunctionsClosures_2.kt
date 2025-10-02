fun functionWithOmittedLabel(@argLabel("_") person: String, day: String): String {
    return "Hello ${person}, today is ${day}."
}