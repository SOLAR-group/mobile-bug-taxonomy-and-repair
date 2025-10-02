The bug in this snippet is that it does not handle the case where one or both of the input strings do not contain a valid integer value. The function will return nil when either arg1 or arg2 are not convertible to an Int, but it should also print an error message and return nil in those cases.

Here's the fixed code:
```
func castNumber(arg1: String?, arg2: String?) -> Int? {
    guard let x = parseInt(str: arg1) else {
        print("Wrong number format in arg1: '\(arg1)'")
        return nil
    }
    
    guard let y = parseInt(str: arg2) else {
        print("Wrong number format in arg2: '\(arg2)'")
        return nil
    }
    
    return (x * y)
}
```
In this code, we use the `guard` statement to check if either `parseInt()` returns `nil`, and if so, print an error message and return `nil`. We also used optional binding to safely unwrap the result of `parseInt()` without using forced unwrapping with `!`.