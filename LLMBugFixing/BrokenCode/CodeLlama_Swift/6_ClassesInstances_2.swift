class RectangularShape: Shape {
        override init(height: Double, length: Double) {
                super.init(height: height, length: length)
        }
        var perimeter: Double { return (height + length) * 2 }
}