// Function
func functionWithParameters(person: String, day: String) -> String {
    return "Hello \(person), today is \(day)."
}

// Function labels
func functionWithLabel(person: String, on day: String) -> String {
    return "Hello \(person), today is \(day)."
}

// Omitting function labels
func functionWithOmittedLabel(_ person: String, day: String) -> String {
    return "Hello \(person), today is \(day)."
}

// Multiple function returns
func multipleFunctionReturns(scores: [Int]) -> (min: Int, max: Int, sum: Int) {
    var min = scores[0]
    var max = scores[0]
    var sum = 0

    for score in scores {
        if score > max {
            max = score
        } else if score < min {
            min = score
        }
        sum += score
    }

    return (min, max, sum)
}

// Nested/Anonymous functions
func nestedFunction() -> Int {
    var y = 10
    func add() {
        y += 5
    }
    add()
    return y
}

// Functions as return type
func functionAsReturnType() -> ((Int) -> Int) {
    func addOne(number: Int) -> Int {
        return 1 + number
    }
    return addOne
}

// Functions as argument
func functionAsArgument(list: [Int], condition: (Int) -> Bool) -> Bool {
    for item in list {
        if condition(item) {
            return true
        }
    }
    return false
}
func lessThanTen(number: Int) -> Bool {
    return number < 10
}
let numbers: [Int] = [20, 19, 7, 12]
let containsLessThanTen = functionAsArgument(list: numbers, condition: lessThanTen)

// Closure
func closure() -> [Int] {
    return numbers.map({ (number: Int) -> Int in
        let result = 3 * number
        return result
    })
}

// Closure - Omission of type
let closureNeglectType = numbers.map({ number in 3 * number })

// Addressing parameters by number instead of by name
let sortedNumbers = numbers.sorted { $0 > $1 }