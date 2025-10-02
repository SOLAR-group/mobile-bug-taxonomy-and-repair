func forInIndex(items: [String]) -> Int {
    var testValue = 0
    
    for index in items.indices {
        testValue += index
    }
    
    return testValue
}