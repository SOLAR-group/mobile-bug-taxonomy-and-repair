fun <Item> makeArray(@argLabel("repeating") item: Item, numberOfTimes: Int): MutableList<Item> {
    val result: MutableList<Item> = mutableListOf()
    for (i in 0 until numberOfTimes) {
        result.add(item)
    }

    return result
}
