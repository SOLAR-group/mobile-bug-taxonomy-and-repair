// Variables

let a: Int = 1
let b = 2

func deferredAssignment() -> Int {
    let c: Int
    c = 3

    return c
}

var x = 5

func inferredTypeAddition() -> Int {
    var y = 5
    y += 1

    return y
}

var z = 0
func incrementTopLevel() {
    z += 1
}