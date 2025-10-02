// Here's one possible translation of the Kotlin code to Swift:
// ```swift
// String templates
var s = 1
let s1 = "s is \(s)"

func arbitraryExpInTemplate() -> String {
    s = 2
    let s2 = "\(s1.replacingOccurrences(of: "is", with: "was")), but now is \(s)"
    
    return s2
}
// ```
// Note that in Swift, we need to use string interpolation to inject the value of `s` into the string template. Also, we need to use the `replacingOccurrences(of:with:)` method to replace the substring "is" with "was" in the string `s1`.