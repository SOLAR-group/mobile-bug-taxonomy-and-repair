func getStringLength2(_ obj: Any) -> Int? {
    guard let string = obj as? String else { return nil }

    return string.count
}