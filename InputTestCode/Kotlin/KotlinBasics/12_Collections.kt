// Collections

fun inCollection(items: Array<String>): String {
    var str = "Nothing to say."

    when {
        "orange" in items -> str = "juicy"
        "apple" in items -> str = "apple is fine too"
    }

    return str
}

fun collectionSimpleLambda(list: Array<String>): List<String> {
    return list.filter { it == "win" }
}

fun collectionLambdaExpression(list: Array<String>): MutableList<String> {
    val filteredList = mutableListOf<String>()

    list
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { filteredList.add(it) }

    return filteredList
}