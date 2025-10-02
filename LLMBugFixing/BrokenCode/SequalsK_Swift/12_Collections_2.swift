func collectionLambdaExpression(list: Array<String>) -> [String] {
    var filteredList = [String]()
    list.filter {$0.startsWith("a")}.sortedBy {$0}.map {$0.toUpperCase()}.forEach {filteredList.append($0)}
    return filteredList
}