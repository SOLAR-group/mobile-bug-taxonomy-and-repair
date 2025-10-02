func getStringLength2(obj: Any) -> Int? {
    if obj String {
        return nil
    }

    return obj.length
}