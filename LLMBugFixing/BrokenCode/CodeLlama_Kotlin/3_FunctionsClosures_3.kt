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