// Type checks and automatic casts

func getStringLength1(obj: Any) -> Int? {
    if obj String {
        return obj.length
    }

    return nil
}

func getStringLength2(obj: Any) -> Int? {
    if obj String {
        return nil
    }

    return obj.length
}

func getStringLength3(obj: Any) -> Int? {
    if obj String && obj.length > 0 {
        return obj.length
    }

    return nil
}

func automaticCastOneVariable(arg1: Int?) -> Int? {
    if arg1 != nil {
        return arg1 * 2
    } else {
        return nil
    }
}