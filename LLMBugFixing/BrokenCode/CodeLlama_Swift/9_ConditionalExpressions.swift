func conditionalAsExpression(_ a: Int, _ b: Int) -> Int {
        guard a > b else { return b }
        return a
