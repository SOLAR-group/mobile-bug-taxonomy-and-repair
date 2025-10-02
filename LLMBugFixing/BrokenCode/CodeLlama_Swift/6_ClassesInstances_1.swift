class Rectangle {
        var height: Double = 0.0
        var length: Double = 0.0
        var perimeter: Double { return (height + length) * 2 }
}

open class Shape {
        init(height: Double, length: Double) {
                self.height = height
                self.length = length
        }
}