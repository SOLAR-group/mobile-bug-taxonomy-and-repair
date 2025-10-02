// Ranges

func withinRange(x: Int, y: Int) -> Bool {
    return x 1...y + 1
}

func outOfRange(list: [String]) -> Bool {
    return list.count list.indices
}

func iterateOverRange() -> Int {
    var testValue = 0
    for x in 1...5 {
        testValue += x
    }

    return testValue
}

func iterateOverProgression() -> Int {
    var testValue = 0
    for x in stride(from: 10, through: 1, by: -3) {
        testValue += x
    }

    return testValue
}