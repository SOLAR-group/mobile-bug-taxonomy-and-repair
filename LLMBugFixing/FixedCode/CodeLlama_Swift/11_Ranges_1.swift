func withinRange(x: Int, y: Int) -> Bool {
    return x >= 1 && x <= y + 1
}
// Examples:
print(withinRange(x: 5, y: 7)) // true
print(withinRange(x: 3, y: 6)) // false
print(withinRange(x: 8, y: 7)) // true

// The issue is that the function returns true even when x > y + 1. To fix this bug, we can change the condition to "return x >= 1 && x <= y". This will ensure that the function only returns true if x is within the range of [1, y] inclusive.
func withinRange(x: Int, y: Int) -> Bool {
    return x >= 1 && x <= y
}
// Examples:
print(withinRange(x: 5, y: 7)) // true
print(withinRange(x: 3, y: 6)) // false
print(withinRange(x: 8, y: 7)) // false