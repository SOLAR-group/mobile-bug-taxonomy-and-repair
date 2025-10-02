fun functionWithLabel(person: String, @argLabel("on") day: String): String {
    return "Hello ${person}, today is ${day}."
}