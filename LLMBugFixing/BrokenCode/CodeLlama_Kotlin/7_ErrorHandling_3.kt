// Defer
var fridgeIsOpen: Boolean = false
val fridgeContent = listOf("milk", "eggs", "leftovers")

fun fridgeContains(food: String): Boolean {
    fridgeIsOpen = true
    try {
        return fridgeContent.contains(food)
    } finally {
        fridgeIsOpen = false // is always executed
    }
}

fun useDefer() {
    fridgeContains("banana")
}