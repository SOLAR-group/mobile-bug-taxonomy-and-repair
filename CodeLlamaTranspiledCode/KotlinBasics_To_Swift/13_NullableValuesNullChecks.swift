// Here's the equivalent code in Swift:
// ```swift
import Foundation

func parseInt(_ str: String) -> Int? {
    return Int(str)
}

func getProduct(_ arg1: String, _ arg2: String) -> Int? {
    let x = parseInt(arg1)
    let y = parseInt(arg2)

    if x != nil && y != nil {
        return (x! * y!)
    } else {
        print("'\(arg1)' or '\(arg2)' is not a number")
        return nil
    }
}

func castNumber(_ arg1: String?, _ arg2: String?) -> Int? {
    let x = parseInt(arg1)
    let y = parseInt(arg2)

    if x == nil || y == nil {
        print("Wrong number format in arg1: '\(arg1)'")
        return nil
    }

    return (x! * y!)
}

func getProductFromOptional(_ x: Int?, _ y: Int?) -> Int? {
    if x != nil && y != nil {
        return (x! * y!)
    } else {
        print("'\(x)' or '\(y)' is not a number.")
        return nil
    }
}
// ```
// Note that in Swift, you can't use the `?` operator on non-optional values like `Int`. Instead, you need to use the `!` operator to force-unwrap the optional value. Also, since Swift doesn't have a built-in `println()` function, you can use `print()` instead.