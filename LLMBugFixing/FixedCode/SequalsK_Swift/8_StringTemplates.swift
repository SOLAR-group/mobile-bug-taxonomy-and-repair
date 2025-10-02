The bug in the code is that the variable `s` is mutated within the template string. When the function `arbitraryExpInTemplate()` is called, it sets `s = 2`, which means that the second time the template string is evaluated, `s1` will be `"s was 2"`.

Here's an example of how to fix this bug using mutation operators:
```
var s = 1
let s1 = "s is \(s)"
func arbitraryExpInTemplate() -> String {
    let s2 = "\(s1.replace("is", "was")), but now is \(s)"
    return s2
}
```
Here, we have used the `replace()` method to replace the substring `"is"` with `"was"`, so that the template string will always use the current value of `s`. We have also removed the line where `s` is mutated within the template string.