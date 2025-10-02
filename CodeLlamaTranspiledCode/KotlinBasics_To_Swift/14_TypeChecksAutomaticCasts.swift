// Here is the equivalent Swift code for the given Kotlin code:
// ```
// Type checks and automatic casts

func getStringLength1(_ obj: Any) -> Int? {

        if let string = obj as? String {
                return string.count
        }

        return nil
}

func getStringLength2(_ obj: Any) -> Int? {
    guard let string = obj as? String else { return nil }

    return string.count
}

func getStringLength3(_ obj: Any) -> Int? {
    if let string = obj as? String, string.count > 0 {
        return string.count
    }

    return nil
}

func automaticCastOneVariable(_ arg1: Int?) -> Int? {
    guard let intValue = arg1 else { return nil }
    return intValue * 2
}
// ```
// Note that in Swift, you don't need to specify the type of a variable or function parameter when it can be inferred from the context. Also, Swift uses `nil` instead of `null` to represent an optional value that is not set.

// In addition, Swift has a more concise syntax for working with optionals, you don't need to use the `guard` statement to unwrap an optional value, you can use the `if let` or `while let` statement instead.