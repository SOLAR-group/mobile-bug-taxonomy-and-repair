import ollama

from ollama import chat
from ollama import ChatResponse

def request_body(prompt):
    print("running...")
    response: ChatResponse = chat(model='codellama:7b-instruct', messages=[
    {
        'role': 'user',
        'content': prompt,
    },
    ])
    print(response['message']['content'])


simplevalues = '''
Swift
Source Code:
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
Translate the above Swift code to Kotlin. 
'''

controlflow = """
Swift
Source Code:
// Iterating Array
let individualScores = [75, 43, 103, 87, 12]
var teamScore = 0

func iterateArray() {
    for score in individualScores {
        if score > 50 {
            teamScore += 3
        } else {
            teamScore += 1
        }
    }
}

// Iterating Dictionary
let interestingNumbers = [
    "Prime": [2, 3, 5, 7, 11, 13],
    "Fibonacci": [1, 1, 2, 3, 5, 8],
    "Square": [1, 4, 9, 16, 25],
]
var largest = 0

func iterateDictionary() {
    for (key, numbers) in interestingNumbers {
        for number in numbers {
            if number > largest {
                largest = number
            }
        }
    }
}

func iterateDictionaryPlaceholder() {
    for (_, numbers) in interestingNumbers {
        for number in numbers {
            if number > largest {
                largest = number
            }
        }
    }
}

// While
var n = 2
func useWhile() {
    while n < 100 {
        n *= 2
    }
}

var m = 2
func useRepeat() {
    repeat {
        m *= 2
    } while m < 100
}

// Range
var total = 0
func useRange() {
    for i in 0..<4 {
        total += i
    }
}

// Optional values
func checkOptionalValue(optionalString: String?) -> Bool {
    return optionalString == nil
}

// Optional in if
func checkOptionalValueInIf(optionalName: String?) -> String {
    var greeting = "Hello!"

    if let name = optionalName {
        greeting = "Hello, \(name)"
    }

    return greeting
}

// Default value for optional values
func checkDefaultValue(nickname: String?) -> String {
    let fullName: String = "John Appleseed"
    let informalGreeting = "Hi \(nickname ?? fullName)"

    return informalGreeting
}

// Switch statements
func switchStatement(vegetable: String) -> String {
    switch vegetable {
    case "celery":
        return "Add some raisins and make ants on a log."
    case "cucumber", "watercress": 
        return "That would make a good tea sandwich."
    case let x where x.hasSuffix("pepper"):
        return "Is it a spicy \(x)?"
    default:
        return "Everything tastes good in soup."
    }
}
Translate the above Swift code to Kotlin. 
"""

functions = """
Swift
Source Code:
// Function
func functionWithParameters(person: String, day: String) -> String {
    return "Hello \(person), today is \(day)."
}

// Function labels
func functionWithLabel(person: String, on day: String) -> String {
    return "Hello \(person), today is \(day)."
}

// Omitting function labels
func functionWithOmittedLabel(_ person: String, day: String) -> String {
    return "Hello \(person), today is \(day)."
}

// Multiple function returns
func multipleFunctionReturns(scores: [Int]) -> (min: Int, max: Int, sum: Int) {
    var min = scores[0]
    var max = scores[0]
    var sum = 0

    for score in scores {
        if score > max {
            max = score
        } else if score < min {
            min = score
        }
        sum += score
    }

    return (min, max, sum)
}

// Nested/Anonymous functions
func nestedFunction() -> Int {
    var y = 10
    func add() {
        y += 5
    }
    add()
    return y
}

// Functions as return type
func functionAsReturnType() -> ((Int) -> Int) {
    func addOne(number: Int) -> Int {
        return 1 + number
    }
    return addOne
}

// Functions as argument
func functionAsArgument(list: [Int], condition: (Int) -> Bool) -> Bool {
    for item in list {
        if condition(item) {
            return true
        }
    }
    return false
}
func lessThanTen(number: Int) -> Bool {
    return number < 10
}
let numbers: [Int] = [20, 19, 7, 12]
let containsLessThanTen = functionAsArgument(list: numbers, condition: lessThanTen)

// Closure
func closure() -> [Int] {
    return numbers.map({ (number: Int) -> Int in
        let result = 3 * number
        return result
    })
}

// Closure - Omission of type
let closureNeglectType = numbers.map({ number in 3 * number })

// Addressing parameters by number instead of by name
let sortedNumbers = numbers.sorted { $0 > $1 }
Translate the above Swift code to Kotlin. 
"""

objects = """
Swift
Source Code:
// Class definition
class Shape {
    var numberOfSides = 0
    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

// Object instantiation
var shape = Shape()

// Accessing properties
func accessClassProperties() {
    shape.numberOfSides = 7
}

// Accessing methods
func accessClassMethods() -> String {
    shape.numberOfSides = 2
    return shape.simpleDescription()
}

// Initializer and Deinitializer
// Superclasses
class NamedShape {
    var numberOfSides: Int = 0
    var name: String

    init(name: String) {
        self.name = name
    }

    deinit {
        // for cleanup before object is deallocated
    }

    func simpleDescription() -> String {
        return "A shape with \(numberOfSides) sides."
    }
}

// Subclasses
class Square: NamedShape {
    var sideLength: Double

    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 4
    }

    func area() -> Double {
        return sideLength * sideLength
    }

    override func simpleDescription() -> String {
        return "A square with sides of length \(sideLength)."
    }
}

// Getter/Setter
class EquilateralTriangle: NamedShape {
    var sideLength: Double = 0.0

    init(sideLength: Double, name: String) {
        self.sideLength = sideLength
        super.init(name: name)
        numberOfSides = 3
    }

    var perimeter: Double { 
        get {
            return 3.0 * sideLength
        }
        set (newValue) {
            sideLength = newValue / 3.0
        }
    }

    override func simpleDescription() -> String {
        return "An equilateral triangle with sides of length \(sideLength)."
    }
}

// Will Set
class ObservedTriangle {
    var triangle: EquilateralTriangle {
        willSet {
            print("New value for triangle!")
        }
    }
    init(size: Double, name: String) {
        triangle = EquilateralTriangle(sideLength: size, name: name)
    }
}

// Will Set accessing other variable
class TriangleAndSquare {
    var triangle: EquilateralTriangle {
        willSet {
            square.sideLength = newValue.sideLength
        }
    }
    var square: Square {
        willSet {
            triangle.sideLength = newValue.sideLength
        }
    }
    init(size: Double, name: String) {
        square = Square(sideLength: size, name: name)
        triangle = EquilateralTriangle(sideLength: size, name: name)
    }
}

// Optional accessing
let optionalSquare: Square? = Square(sideLength: 2.5, name: "optional square")
let sideLength = optionalSquare?.sideLength

Translate the above Swift code to Kotlin. 
"""

enums = """
Swift
Source Code:
// Enumerations
enum Suit {
    case spades, hearts, diamonds, clubs

    func simpleDescription() -> String {
        switch self {
        case .spades:
            return "spades"
        case .hearts:
            return "hearts"
        case .diamonds:
            return "diamonds"
        case .clubs:
            return "clubs"
        }
    }
}

// Enumerations with raw values
enum Rank: Int {
    case ace = 1
    case two, three, four, five, six, seven, eight, nine, ten
    case jack, queen, king

    func simpleDescription() -> String {
        switch self {
        case .ace:
            return "ace"
        case .jack:
            return "jack"
        case .queen:
            return "queen"
        case .king:
            return "king"
        default:
            return String(self.rawValue)
        }
    }
}

// Instance of enumeration from raw value
func makeEnumerationFromRawValue() -> String? {
    var description: String? = nil

    if let convertedRank = Rank(rawValue: 3) {
        description = convertedRank.simpleDescription()
    }

    return description
}

// Enumerations with associated values
enum ServerResponse {
    case result(String, String)
    case failure(String)
}

// Structs
struct Card {
    var rank: Rank
    var suit: Suit
    func simpleDescription() -> String {
        return "The \(rank.simpleDescription()) of \(suit.simpleDescription())"
    }
}
let threeOfSpades = Card(rank: .three, suit: .spades)
let threeOfSpadesDescription = threeOfSpades.simpleDescription()

Translate the above Swift code to Kotlin. 
"""

protocols = """
Swift
Source Code:
// Protocols
protocol ExampleProtocol {
    var simpleDescription: String { get }
    mutating func adjust()
}

class SimpleClass: ExampleProtocol {
    var simpleDescription: String = "A very simple class."
    var anotherProperty: Int = 69105
    func adjust() {
        simpleDescription += "  Now 100% adjusted."
    }
}

func generateSimpleClass() -> String {
    let a = SimpleClass()
    a.adjust()

    let protocolValue: ExampleProtocol = a

    return a.simpleDescription
}

struct SimpleStructure: ExampleProtocol {
    var simpleDescription: String = "A simple structure"
    mutating func adjust() {
        simpleDescription += " (adjusted)"
    }
}

func generateSimpleStruct() -> String {
    var b = SimpleStructure()
    b.adjust()

    return b.simpleDescription
}

// Extensions
extension Int: ExampleProtocol {
    var simpleDescription: String {
        return "The number \(self)"
    }
    mutating func adjust() {
        self += 42
    }
}

let seven = 7
let sevenDescription = seven.simpleDescription
var eight = 8

func makeUseOfExtension() {
    eight.adjust()
}

Translate the above Swift code to Kotlin. 
"""

errors = """
Swift
Source Code:
// Error Enum
enum PrinterError: Error {
    case outOfPaper
    case noToner
    case onFire
}

// Error throwing
func send(job: Int, toPrinter printerName: String) throws -> String {
    if printerName == "Never Has Toner" {
        throw PrinterError.noToner
    }
    return "Job sent"
}

// Error catching
func errorCatching() -> String {
    do {
        let printerResponse = try send(job: 1040, toPrinter: "Bi Sheng")
        return printerResponse
    } catch {
        return "Error"
    }
}

//Optional handling
let printerSuccess = try? send(job: 1884, toPrinter: "Mergenthaler")
let printerFailure = try? send(job: 1885, toPrinter: "Never Has Toner")

// Defer
var fridgeIsOpen = false
let fridgeContent = ["milk", "eggs", "leftovers"]

func fridgeContains(_ food: String) -> Bool {
    fridgeIsOpen = true
    defer {
        fridgeIsOpen = false // is always executed
    }

    let result = fridgeContent.contains(food)
    return result
}

func useDefer() {
    fridgeContains("banana")
}
Translate the above Swift code to Kotlin. 
"""

generics = """
Swift
Source Code:
// Generic function
func makeArray<Item>(repeating item: Item, numberOfTimes: Int) -> [Item] {
    var result: [Item] = []
    for i in 0..<numberOfTimes {
        result.append(item)
    }
    return result
}

// Generic enum
enum OptionalValue<Wrapped> {
    case none
    case some(Wrapped)
}

// Requirements for Generic
func anyCommonElements<T: Sequence, U: Sequence>(_ lhs: T, _ rhs: U) -> Bool
    where T.Element: Equatable, T.Element == U.Element
{
    for lhsItem in lhs {
        for rhsItem in rhs {
            if lhsItem == rhsItem {
                return true
            }
        }
    }
    return false
}
Translate the above Swift code to Kotlin. 
"""

def run_prompts():
    request_body(simplevalues)
    # request_body(controlflow)
    # request_body(functions)
    # request_body(objects)
    # request_body(enums)
    # request_body(protocols)
    # request_body(errors)
    # request_body(generics)

run_prompts()
