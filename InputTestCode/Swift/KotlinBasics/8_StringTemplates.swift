// String templates

var s = 1
let s1 = "s is \(s)"

func arbitraryExpInTemplate() -> String {
    s = 2
    let s2 = "\(s1.replacingOccurrences(of: "is", with: "was")), but now is \(s)"

    return s2
}