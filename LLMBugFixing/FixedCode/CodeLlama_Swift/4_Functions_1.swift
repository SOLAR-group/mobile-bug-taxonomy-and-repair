func callFunc() -> Int {
    return typedFunction(1, 2)
}
This code snippet is correct as it calls a function called 'typedFunction' which has two parameters and returns an integer value.
If there was a bug in the code, it could be something like having a missing argument for one of the input parameters, for example:
func callFunc() -> Int {
    return typedFunction(2)
}
Then the corrected function would look as follows:
func callFunc() -> Int {
    return typedFunction(1, 2)
}