// Collections

func inCollection(items: Array<String>) -> String {
    var str = "Nothing to say."
    if "orange" items {
        str = "juicy"
    } else if "apple" items {
        str = "apple is fine too"
    }

    return str
}

func collectionSimpleLambda(list: Array<String>) -> [String] {
    return list.filter {$0 == "win"}
}

func collectionLambdaExpression(list: Array<String>) -> [String] {
    var filteredList = [String]()
    list.filter {$0.startsWith("a")}.sortedBy {$0}.map {$0.toUpperCase()}.forEach {filteredList.append($0)}
    return filteredList
}