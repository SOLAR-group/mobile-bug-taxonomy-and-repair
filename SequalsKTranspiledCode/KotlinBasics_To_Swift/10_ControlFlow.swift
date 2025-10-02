// Control flow

func forIn(items: Array<String>) -> String {
    var testString = ""
    for item in items {
        testString += item
    }

    return testString
}

func forInIndex(items: Array<String>) -> Int {
    var testValue = 0
    for index in items.indices {
        testValue += index
    }

    return testValue
}

func forInIndexPlaceholder(items: Array<String>) -> Int {
    var testValue = 0
    for index in items.indices {
        testValue += index
    }

    return testValue
}

func whileLoop() -> Int {
    var count = 0
    while count < 15 {
        count += 1
    }

    return count
}

func describe(obj: Any) -> String {
    switch obj {
        case 1:
            "One"
        case "Hello":
            "Greeting"
        case Long:
            "Long"
        case String:
            "Not a string"
        default:
            "Unknown"
    }
}

func translateNumber(num: Int) -> String {
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