package transpilation

// Function
fun functionWithParameters(person: String, day: String): String {
    return "Hello ${person}, today is ${day}."
}

// Function labels
fun functionWithLabel(person: String, @argLabel("on") day: String): String {
    return "Hello ${person}, today is ${day}."
}

// Omitting function labels
fun functionWithOmittedLabel(@argLabel("_") person: String, day: String): String {
    return "Hello ${person}, today is ${day}."
}

// Multiple function returns
fun multipleFunctionReturns(scores: MutableList<Int>): min: Int max: Int sum: Int {
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

    return
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
    fun addOne(number: Int): Int {
        return 1 + number
    }

    return ::addOne
}

// Functions as argument
fun functionAsArgument(list: MutableList<Int>, condition: (Int) -> Boolean): Boolean {
    for (item in list) {
        if (condition(item)) {
            return true
        }
    }

    return false
}

fun lessThanTen(number: Int): Boolean {
    return number < 10
}

val numbers: MutableList<Int> = mutableListOf(20, 19, 7, 12)
val containsLessThanTen = functionAsArgument(numbers, ::lessThanTen)

// Closure
fun closure(): MutableList<Int> {
    return numbers.map({
        number: Int ->
        val result = 3 * number
        result
    })
}

// Closure - Omission of type
val closureNeglectType = numbers.map({number -> 3 * number})

// Addressing parameters by number instead of by name
val sortedNumbers = numbers.sorted {it > $1}