The bug in this code is that the height and length properties are not initialized correctly.  The perimeter property is calculated incorrectly because it is not taking into account the values of the height and length properties.  Here is a possible fix: 
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
In this code, the height and length properties are initialized with the correct values when an instance of the Rectangle or Shape class is created.  The perimeter property is also corrected so that it takes into account the values of the height and length properties.  