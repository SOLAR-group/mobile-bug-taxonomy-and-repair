func getStringLength3(obj: Any) -> Int? {
    if let string = obj as? String {
        return string.count
    }

    return nil
}