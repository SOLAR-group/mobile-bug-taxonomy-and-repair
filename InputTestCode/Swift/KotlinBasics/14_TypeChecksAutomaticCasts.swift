// Type checks and automatic casts

func getStringLength1(obj: Any) -> Int? {
    if let str = obj as? String {
        return str.count
    }
    
    return nil
}

func getStringLength2(obj: Any) -> Int? {
    if (!(obj is String)) {
        return nil
    }

    return (obj as! String).count
}

func getStringLength3(obj: Any) -> Int? {
    if let str = obj as? String {
        if str.count > 0 {
            return str.count
        }
    }

    return nil
}

func automaticCastOneVariable(arg1: Int?) -> Int? {
    if (arg1 != nil) {
        return arg1! * 2
    } else {
        return nil
    }
}