// Function
fun functionWithParameters(person: String, day: String): String {
    return "Hello $person, today is $day."
}

// Function labels
fun functionWithLabel(person: String, day: String): String {
    return "Hello $person, today is $day."
}

// Omitting function labels
fun functionWithOmittedLabel(person: String, day: String): String {
    return "Hello $person, today is $day."
}

// Multiple function returns
fun multipleFunctionReturns(scores: Array<Int>): Array<Any> {
    var min = scores[0]
    var max = scores[0]
    var sum = 0

    for (score in scores) {
        if (score > max) {
            max = score
        } else if (score < min) {
            min = score
        }
        sum += score
    }

    return arrayOf(min, max, sum)
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
fun functionAsReturnType(): (Int) -> Int {
    val addOne = fun (number: Int): Int {
        return 1 + number
    }

    return addOne
}

// Functions as argument
fun functionAsArgument(list: Array<Int>, condition: (Int) -> Boolean): Boolean {
    for (item in list) {
        if (condition(item)) {
            return true
        }
    }
    return false
}
val lessThanTen = fun (number: Int): Boolean {
    return number < 10
}
val numbers = arrayOf(20, 19, 7, 12)
val containsLessThanTen = functionAsArgument(numbers, lessThanTen)

// Closure
fun closure(): List<Int> {
    return numbers.map(fun (number: Int): Int {
        val result = 3 * number
        return result
    })
}

// Closure - Omission of type
val closureNeglectType = numbers.map { number -> 3 * number }

// Addressing parameters by number instead of by name
fun addressByNumber(): Array<Int> {
    numbers.sortWith({ _0, _1 -> maxOf(_0, _1) })

    return numbers
}

