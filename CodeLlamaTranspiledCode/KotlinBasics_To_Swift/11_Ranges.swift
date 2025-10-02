// ```
// Ranges

func withinRange(x: Int, y: Int) -> Bool {
    return x >= 1 && x <= y + 1
}

func outOfRange(list: [String]) -> Bool {
    return list.count > list.indices.count
}

func iterateOverRange() -> Int {
    var testValue = 0

    for x in 1 ..< y {
        testValue += x
    }

    return testValue
}

func iterateOverProgression() -> Int {
    var testValue = 0

    for x in 10 ..< 1 where x % 3 == 0 {
        testValue += x
    }

    return testValue
}
// ```