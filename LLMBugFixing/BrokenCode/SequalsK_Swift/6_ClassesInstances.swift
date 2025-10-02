// Classes and Instances

class Rectangle {
    var height: Double
    var length: Double
    var perimeter: Double
    init(height: Double, length: Double) {
        self.height = height
        self.length = length
        perimeter = (height + length) * 2
    }
}