The corrected snippet looks like this:
// Defer
var fridgeIsOpen: Boolean = false
val fridgeContent = listOf("milk", "eggs", "leftovers")
fun fridgeContains(food: String): Boolean {
    try {
        return fridgeContent.contains(food)
    } finally {
        fridgeIsOpen = false
    }
}

fun useDefer() {
    fridgeContains("banana")
}