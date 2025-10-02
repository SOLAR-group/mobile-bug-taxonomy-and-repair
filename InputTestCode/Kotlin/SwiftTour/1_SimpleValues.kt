// Variable
var myVariable = 42

fun updateVariable() {
    myVariable = 50
}

// Constant
val myConstant = 42

// Typing
val implicitInteger = 70
val implicitDouble = 70.0
val explicitDouble: Double = 70.0

// String/Number concatenation
val label = "The width is "
val width = 94
val widthLabel = label + width
val widthLabel2 = label + width.toString()

// Interpolation
val apples = 3
val oranges = 5
val appleSummary = "I have $apples apples."
val fruitSummary = "I have ${apples + oranges} pieces of fruit."

// Multiline String
val quotation = """
I said "I have $apples apples."
And then I said "I have ${apples + oranges} pieces of fruit."
"""

// Array
val list = listOf("a", "b", "c")
val mList = mutableListOf("a", "b", "c")
val arr = arrayOf("a", "b", "c")
val arrList = arrayListOf("a", "b", "c")

var shoppingList = mutableListOf("catfish", "water", "tulips")

fun updateArray() {
    shoppingList[1] = "bottle of water"
}

fun appendToArray() {
    shoppingList.add("blue paint")
}

// Dictionary
var map = mapOf(
    "1" to "a",
    "2" to "b"
)

var occupations = mutableMapOf(
    "Malcolm" to "Captain",
    "Kaylee" to "Mechanic"
)

fun appendToDictionary() {
    occupations.put("Jayne", "Public Relations")
}

// Initializing Array/Dictionary
val emptyArray = listOf<String>()
val emptyDictionary = mapOf<String, Float>()

// Overwriting with empty
fun overwriteArrayWithEmpty() {
    shoppingList = mutableListOf()
}

fun overwriteDictionaryWithEmpty() {
    occupations = mutableMapOf()
}


