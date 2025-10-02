func iterateOverProgression() -> Int {
    var testValue = 0

    for x in 10 ..< 1 where x % 3 == 0 {
        testValue += x
    }

    return testValue
}
