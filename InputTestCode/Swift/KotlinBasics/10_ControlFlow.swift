// Control flow

func forIn(items: [String]) -> String {
    var testString = "";

    for item in items {
        testString += item
    }

    return testString
}

func forInIndex(items: [String]) -> Int {
    var testValue = 0

    for (index, item) in items.enumerated() {
        testValue += index
    }

    return testValue
}

func forInIndexPlaceholder(items: [String]) -> Int {
    var testValue = 0

    for (index, _) in items.enumerated() {
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

func describe(obj: Any) -> String {
    if(obj is Int && ((obj as? Int) == 1)) {
        return "One"
    } else if(obj is String && (obj as? String) == "Hello") {
        return "Greeting"
    } else if(obj is Int64) {
        return "Long"
    } else if(!(obj is String)) {
        return "Not a string"
    } else {
        return "Unkown"
    }
}

func translateNumber(num: Int) -> String {
    switch (num) {
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