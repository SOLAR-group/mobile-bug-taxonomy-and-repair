// Here's one possible translation of the given Kotlin code to Swift:
// ```swift
import Foundation

func forIn(items: [String]) -> String {
    var testString = ""
    
    for item in items {
        testString += item
    }
    
    return testString
}

func forInIndex(items: [String]) -> Int {
    var testValue = 0
    
    for index in items.indices {
        testValue += index
    }
    
    return testValue
}

func forInIndexPlaceholder(items: [String]) -> Int {
    var testValue = 0
    
    for index in items.indices {
        testValue += index
    }
    
    return testValue
}

func whileLoop() -> Int {
    var count = 0
    
    while (count < 15) {
        count += 1
    }
    
    return count
}

func describe(_ obj: Any) -> String {
    switch obj {
        case 1:
            return "One"
        case "Hello":
            return "Greeting"
        case is Long:
            return "Long"
        default:
            return "Not a string"
    }
}

func translateNumber(_ num: Int) -> String {
    switch num {
        case 1:
            return "One"
        case 2:
            return "Two"
        case 3:
            return "Three"
        case 4:
            return "Four"
        case 5:
            return "Five"
        default:
            return "Number not known."
    }
}
// ```
// Note that the `when` expression in Swift is equivalent to the `switch` statement in Kotlin, but with a slightly different syntax. The `is` keyword in Kotlin is replaced by the `is` operator in Swift, which checks if an object is of a certain type. The `!` symbol in Kotlin is not necessary in Swift, since it is inferred from the context.