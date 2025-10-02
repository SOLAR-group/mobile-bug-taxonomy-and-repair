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