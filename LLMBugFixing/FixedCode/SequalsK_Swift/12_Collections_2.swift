Here is the fixed code snippet with one bug removed:
func collectionLambdaExpression(list: Array<String>) -> [String] {
    var filteredList = [String]()
    list.filter {$0.startsWith("a")}.sortedBy {$0}.map {$0.toUpperCase()} 
    return filteredList
}
The corrected code was missing the forEach function after the map function to append all elements of the new list to the filteredList array.