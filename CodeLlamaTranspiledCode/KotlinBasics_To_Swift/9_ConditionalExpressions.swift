// Here is the equivalent Swift code for the given Kotlin code:
// ```
// String templates
// Conditional expressions

func conditional(_ a: Int, _ b: Int) -> Int {
        if a > b {
                return a
        } else {
                return b
        }
}

func conditionalAsExpression(_ a: Int, _ b: Int) -> Int {
        guard a > b else { return b }
        return a
// }
// ```
// Note that in Swift, the `if` statement is used for conditionals instead of using ternary operators. Also, the `guard` statement is used to check a condition and exit early if it is not met.