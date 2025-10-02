package llm
// Here's the equivalent code in Kotlin:
// ```kotlin
// Function with parameters and return type
fun functionWithParameters(person: String, day: String): String {
    return "Hello $person, today is $day."
}

// Function with labels
fun functionWithLabel(person: String, on day: String): String {
    return "Hello $person, today is $day."
}

// Omitting function labels
fun functionWithOmittedLabel(_ person: String, day: String) -> String {
    return "Hello $person, today is $day."
}

// Multiple function returns
fun multipleFunctionReturns(scores: List<Int>): Triple<Int, Int, Int> {
    var min = scores[0]
    var max = scores[0]
    var sum = 0

    for (index, score) in scores.withIndex() {
        if (score > max) {
            max = score
        } else if (score < min) {
            min = score
        }
        sum += score
    }

    return Triple(min, max, sum)
}

// Nested/Anonymous functions
fun nestedFunction(): Int {
    var y = 10
    fun add() {
        y += 5
    }
    add()
    return y
}

// Functions as return type
fun functionAsReturnType(): ((Int) -> Int) {
    fun addOne(number: Int): Int {
        return number + 1
    }
    return addOne
}

// Functions as argument
fun functionAsArgument(list: List<Int>, condition: (Int) -> Boolean): Boolean {
    for (item in list) {
        if (condition(item)) {
            return true
        }
    }
    return false
}

// Closure
fun closure(): List<Int> {
    return numbers.map { number: Int -> 3 * number }
}

// Closure - Omission of type
val closureNeglectType = numbers.map { number -> 3 * number }
// ```
// Note that Kotlin does not have the concept of function labels as in Swift, so we omit the label for the `functionWithLabel` and `functionAsArgument` functions. Also, in Kotlin, we can use a more concise syntax for defining anonymous functions, such as the `addOne` function in the `functionAsReturnType` function. Additionally, Kotlin does not require explicit type annotations for function parameters and return types, so we omit them in the code above.