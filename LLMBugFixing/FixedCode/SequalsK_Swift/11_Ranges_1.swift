func withinRange(x: Int, y: Int) -> Bool {
    return x <= y + 1
}

Here is an example of how to use the `withinRange` function with a range of numbers:

let range = 1...5
if withinRange(x: 3, y: range.upperBound) {
    print("Number is within range")
} else {
    print("Number is not within range")
}

Here is an example of how to use the `withinRange` function with a single number:

if withinRange(x: 5, y: 10) {
    print("Number is within range")
} else {
    print("Number is not within range")
}

Here is an example of how to use the `withinRange` function with a negative number:

if withinRange(x: -3, y: 10) {
    print("Number is within range")
} else {
    print("Number is not within range")
}

Here is an example of how to use the `withinRange` function with a negative number and a range that includes zero:

let range = -5...0
if withinRange(x: -3, y: range.upperBound) {
    print("Number is within range")
} else {
    print("Number is not within range")
}

Here is an example of how to use the `withinRange` function with a positive number and a range that includes zero:

let range = 0...5
if withinRange(x: 3, y: range.upperBound) {
    print("Number is within range")
} else {
    print("Number is not within range")
}