// Here is the equivalent Swift code for the given Kotlin code:
// ```kotlin
// Collections

func inCollection(_ items: [String]) -> String {
    var str = "Nothing to say."

    if "orange" in items {
        str = "juicy"
    } else if "apple" in items {
        str = "apple is fine too"
    }

    return str
}

func collectionSimpleLambda(_ list: [String]) -> [String] {
    let filteredList = list.filter { $0 == "win" }
    return filteredList
}

func collectionLambdaExpression(_ list: [String]) -> [String] {
    var filteredList = [String]()

    for item in list where item.starts(with: "a") {
        filteredList.append(item)
    }

    return filteredList
}
// ```
// Note that Swift uses the `==` operator for equality checks, instead of the `===` operator used in Kotlin. Additionally, Swift uses the `String` type instead of the `Array<String>` type in Kotlin.