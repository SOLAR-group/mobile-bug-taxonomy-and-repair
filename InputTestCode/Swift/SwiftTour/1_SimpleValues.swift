// Variable
var myVariable = 42

func updateVariable() {
    myVariable = 50
}

// Constant
let myConstant = 42

// Typing
let implicitInteger = 70
let implicitDouble = 70.0
let explicitDouble: Double = 70

// String/Number concatenation
let label = "The width is "
let width = 94
let widthLabel = label + String(width)
let widthLabel2 = label + String(width)

// Interpolation
let apples = 3
let oranges = 5
let appleSummary = "I have \(apples) apples."
let fruitSummary = "I have \(apples + oranges) pieces of fruit."

// Multiline String
let quotation = """
I said "I have \(apples) apples."
And then I said "I have \(apples + oranges) pieces of fruit."
"""

// Array
var list = ["a", "b", "c"]
var mList = ["a", "b", "c"]
var arr = ["a", "b", "c"]
var arrList = ["a", "b", "c"]

var shoppingList = ["catfish", "water", "tulips"]

func updateArray() {
    shoppingList[1] = "bottle of water"
}

func appendToArray() {
    shoppingList.append("blue paint")
}

// Dictionary
var map = [
    "1": "a",
    "2": "b"
]

var occupations = [
    "Malcolm": "Captain",
    "Kaylee": "Mechanic",
]

func appendToDictionary() {
    occupations["Jayne"] = "Public Relations"
}

// Initializing Array/Dictionary
let emptyArray = [String]()
let emptyDictionary = [String: Float]()

// Overwriting with empty
func overwriteArrayWithEmpty() {
    shoppingList = []
}

func overwriteDictionaryWithEmpty() {
    occupations = [:]
}