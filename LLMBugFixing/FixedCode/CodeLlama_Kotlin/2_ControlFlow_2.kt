Here is the fixed code: 
val interestingNumbers = mapOf(
    "Prime" to listOf(2, 3, 5, 7, 11, 13),
    "Fibonacci" to listOf(1, 1, 2, 3, 5, 8),
    "Square" to listOf(1, 4, 9, 16, 25)
)
// Calculate the sum of all numbers in each list.
for ((type, numbers) in interestingNumbers) {
    val sum = numbers.sum()
    println("$type: $sum")
}