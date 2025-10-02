} catch(e: Throwable) {null}
var fridgeIsOpen = false
val fridgeContent = arrayOf("milk", "eggs", "leftovers")
fun fridgeContains(@argLabel("_") food: String): Boolean {
    fridgeIsOpen = true
    {
        fridgeIsOpen = false // is always executed
    }

    val result = fridgeContent.contains(food)
    return result
}

fun useDefer() {
    fridgeContains("banana")
}