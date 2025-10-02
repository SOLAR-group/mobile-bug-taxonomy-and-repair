// Nullable values and null checks

func parseInt(str: String) -> Int? {
    return str.toIntOrNull()
}

func getProduct(arg1: String, arg2: String) -> Int? {
    let x = parseInt(str: arg1)
    let y = parseInt(str: arg2)
    if x != nil && y != nil {
        return (x * y)
    } else {
        print("'\(arg1)' or '\(arg2)' is not a number")
        return nil
    }
}

func castNumber(arg1: String?, arg2: String?) -> Int? {
    let x = parseInt(str: arg1)
    let y = parseInt(str: arg2)
    if x == nil {
        print("Wrong number format in arg1: '\(arg1)'")
        return nil
    }

    if y == nil {
        print("Wrong number format in arg2: '\(arg2)'")
        return nil
    }

    return (x * y)
}

func getProductFromOptional(x: Int?, y: Int?) -> Int? {
    if x != nil && y != nil {
        return (x * y)
    } else {
        print("'\(x)' or '\(y)' is not a number.")
        return nil
    }
}