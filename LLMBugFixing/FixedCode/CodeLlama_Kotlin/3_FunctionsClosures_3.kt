To fix the bug in this code snippet, you need to change the type of the variable 'sum' from Int to Double. This is because the scores are being added together and the sum can be a decimal value. Here is the fixed code:

fun multipleFunctionReturns(scores: List<Int>): Triple<Int, Int, Double> {
    var min = scores[0]
    var max = scores[0]
    var sum = 0.0

    for (index, score) in scores.withIndex() {
        if (score > max) {
            max = score
        } else if (score < min) {
            min = score
        }
        sum += score.toDouble()
    }

    return Triple(min, max, sum)
}
