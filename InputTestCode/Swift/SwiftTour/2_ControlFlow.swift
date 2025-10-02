// Iterating Array
let individualScores = [75, 43, 103, 87, 12]
var teamScore = 0

func iterateArray() {
    for score in individualScores {
        if score > 50 {
            teamScore += 3
        } else {
            teamScore += 1
        }
    }
}

// Iterating Dictionary
let interestingNumbers = [
    "Prime": [2, 3, 5, 7, 11, 13],
    "Fibonacci": [1, 1, 2, 3, 5, 8],
    "Square": [1, 4, 9, 16, 25],
]
var largest = 0

func iterateDictionary() {
    for (key, numbers) in interestingNumbers {
        for number in numbers {
            if number > largest {
                largest = number
            }
        }
    }
}

func iterateDictionaryPlaceholder() {
    for (_, numbers) in interestingNumbers {
        for number in numbers {
            if number > largest {
                largest = number
            }
        }
    }
}

// While
var n = 2
func useWhile() {
    while n < 100 {
        n *= 2
    }
}

var m = 2
func useRepeat() {
    repeat {
        m *= 2
    } while m < 100
}

// Range
var total = 0
func useRange() {
    for i in 0..<4 {
        total += i
    }
}

// Optional values
func checkOptionalValue(optionalString: String?) -> Bool {
    return optionalString == nil
}

// Optional in if
func checkOptionalValueInIf(optionalName: String?) -> String {
    var greeting = "Hello!"

    if let name = optionalName {
        greeting = "Hello, \(name)"
    }

    return greeting
}

// Default value for optional values
func checkDefaultValue(nickname: String?) -> String {
    let fullName: String = "John Appleseed"
    let informalGreeting = "Hi \(nickname ?? fullName)"

    return informalGreeting
}

// Switch statements
func switchStatement(vegetable: String) -> String {
    switch vegetable {
    case "celery":
        return "Add some raisins and make ants on a log."
    case "cucumber", "watercress": 
        return "That would make a good tea sandwich."
    case let x where x.hasSuffix("pepper"):
        return "Is it a spicy \(x)?"
    default:
        return "Everything tastes good in soup."
    }
}

