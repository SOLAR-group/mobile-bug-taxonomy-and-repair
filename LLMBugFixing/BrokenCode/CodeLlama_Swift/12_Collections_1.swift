func inCollection(_ items: [String]) -> String {
    var str = "Nothing to say."

    if "orange" in items {
        str = "juicy"
    } else if "apple" in items {
        str = "apple is fine too"
    }

    return str
}