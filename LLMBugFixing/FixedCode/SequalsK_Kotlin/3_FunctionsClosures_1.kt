You need to fix two bugs in this code snippet:

1. The `argLabel` annotation should be applied to the `day` parameter instead of the `person` parameter.
2. You need to use string templates (`"..."`) when concatenating strings, not the `+` operator.

Here's the fixed code:
```
fun functionWithLabel(person: String, @argLabel("on") day: String): String {
    return "Hello $person, today is $day."
}
```