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
