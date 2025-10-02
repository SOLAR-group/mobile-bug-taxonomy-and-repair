package llm
// ```kotlin
fun main() {
    // Variable
    var myVariable: Int = 42
    fun updateVariable() {
        myVariable = 50
    }

    // Constant
    val myConstant: Int = 42

    // Typing
    val implicitInteger: Int = 70
    val implicitDouble: Double = 70.0
    val explicitDouble: Double = 70.0

    // String/Number concatenation
    val label: String = "The width is "
    val width: Int = 94
    val widthLabel: String = label + width.toString()
    val widthLabel2: String = label + width.toString()

    // Interpolation
    val apples: Int = 3
    val oranges: Int = 5
    val appleSummary: String = "I have $apples apples."
    val fruitSummary: String = "I have ${apples + oranges} pieces of fruit."

    // Multiline String
    val quotation: String = """
        I said "I have $apples apples."
        And then I said "I have ${apples + oranges} pieces of fruit."
    """.trimIndent()

    // Array
    var list = arrayOf("a", "b", "c")
    var mList = mutableListOf("a", "b", "c")
    var arr = arrayOf("a", "b", "c")
    var arrList = arrayListOf("a", "b", "c")

    var shoppingList: MutableList<String> = mutableListOf("catfish", "water", "tulips")
    fun updateArray() {
        shoppingList[1] = "bottle of water"
    }

    fun appendToArray() {
        shoppingList.add("blue paint")
    }

    // Dictionary
    var map: MutableMap<String, String> = mutableMapOf(
            "1" to "a",
            "2" to "b"
    )

    var occupations: MutableMap<String, String> = mutableMapOf(
            "Malcolm" to "Captain",
            "Kaylee" to "Mechanic",
    )

    fun appendToDictionary() {
        occupations["Jayne"] = "Public Relations"
    }

    // Initializing Array/Dictionary
    val emptyArray: Array<String> = arrayOf()
    val emptyDictionary: Map<String, Float> = mapOf()

    // Overwriting with empty
    fun overwriteArrayWithEmpty() {
        shoppingList = mutableListOf()
    }

    fun overwriteDictionaryWithEmpty() {
        occupations = mutableMapOf()
    }
}
// ```