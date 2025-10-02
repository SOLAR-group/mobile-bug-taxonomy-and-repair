
func automaticCastOneVariable(_ arg1: Int?) -> Int? {
    guard let intValue = arg1 else { return nil }
    return intValue * 2
}
