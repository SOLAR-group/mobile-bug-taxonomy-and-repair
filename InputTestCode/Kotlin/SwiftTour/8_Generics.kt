import java.lang.Exception

// Generic function
fun <Item> makeArray(item: Item, numberOfTimes: Int): MutableList<Item> {
    val result: MutableList<Item> = mutableListOf()
    for (i in 0 until numberOfTimes) {
        result.add(item)
    }
    return result
}

// Generic enum
// No corresponding translation found

// Requirements for Generic
// No corresponding translation found

