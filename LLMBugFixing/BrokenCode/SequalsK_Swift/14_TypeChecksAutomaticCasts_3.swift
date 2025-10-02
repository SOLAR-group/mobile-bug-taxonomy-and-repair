func getStringLength3(obj: Any) -> Int? {
    if obj String && obj.length > 0 {
        return obj.length
    }

    return nil
}