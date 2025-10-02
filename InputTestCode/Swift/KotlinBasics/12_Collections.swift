// Collections

func inCollection(items: [String]) -> String {
    var str = "Nothing to say."

    if(items.contains("orange")) {
        str = "juicy"
    } else if(items.contains("apple")) {
        str = "apple is fine too"
    }

    return str
}

func collectionSimpleLambda(list: [String]) -> [String] {
    return list.filter { $0 == "win" }
}

func collectionLambdaExpression(list: [String]) -> [String] {
    var filteredList = [String]()

    list
        .filter({ $0.starts(with: "a") })
        .sorted()
        .map({ $0.uppercased() })
        .forEach({ filteredList.append($0) })

        return filteredList
}