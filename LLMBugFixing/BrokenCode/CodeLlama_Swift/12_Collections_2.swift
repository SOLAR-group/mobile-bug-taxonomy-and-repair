func collectionLambdaExpression(_ list: [String]) -> [String] {
    var filteredList = [String]()

    for item in list where item.starts(with: "a") {
        filteredList.append(item)
    }

    return filteredList
}