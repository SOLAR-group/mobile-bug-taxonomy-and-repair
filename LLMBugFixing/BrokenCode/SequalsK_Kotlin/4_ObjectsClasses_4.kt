class ObservedTriangle {
    var triangle: EquilateralTriangle
        set(ᏫnewValue) {
            println("New value for triangle!")
            field = ᏫnewValue
        }

    constructor(size: Double, name: String) {
        triangle = EquilateralTriangle(size, name)
    }
}