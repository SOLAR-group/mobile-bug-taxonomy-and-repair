// Ranges

func withinRange(x: Int, y: Int) -> Bool {
    return (1...y + 1).contains(x)
}

func outOfRange(list: [String]) -> Bool {
    return !(0...list.count - 1).contains(list.count)
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