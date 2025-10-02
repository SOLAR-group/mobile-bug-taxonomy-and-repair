
func getProductFromOptional(x: Int?, y: Int?) -> Int? {
    if x != nil && y != nil {
        return (x * y)
    } else {
        print("'\(x)' or '\(y)' is not a number.")
        return nil
    }
}