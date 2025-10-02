func castNumber(_ arg1: String?, _ arg2: String?) -> Int? {
    let x = parseInt(arg1)
    let y = parseInt(arg2)

    if x == nil || y == nil {
        print("Wrong number format in arg1: '\(arg1)'")
        return nil
    }

    return (x! * y!)
}