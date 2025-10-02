// Here's the equivalent Swift code for the given Kotlin code:
// ```swift
func typedFunction(a: Int, b: Int) -> Int {
    return a + b
}

func callFunc() -> Int {
    return typedFunction(1, 2)
}

func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    return a + b
}

func voidReturnValueWithUnit(a: Int, b: Int) {
    print("sum of \(a) and \(b) is \(a + b)")
}

func voidReturnValue(a: Int, b: Int) {
    print("sum of \(a) and \(b) is \(a + b)")
}
// ```
// Note that in Swift, function types are inferred based on the return type of the function, so we don't need to specify it explicitly. Also, Swift uses `print` instead of `println`, and `Unit` is replaced with `Void`.
