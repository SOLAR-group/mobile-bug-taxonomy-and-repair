// Functions

func typedFunction(a: Int, b: Int) -> Int {
    return a + b
}

func callFunc() -> Int {
    return typedFunction(a: 1, b: 2)
}

func functionBodyAsExpression(a: Int, b: Int) -> Int {
    a + b
}

func voidReturnValueWithUnit(a: Int, b: Int) {
    print("sum of \(a) and \(b) is \(a + b)")
}

func voidReturnValue(a: Int, b: Int) {
    print("sum of \(a) and \(b) is \(a + b)")
}