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

class Shape {
}

class RectangularShape: Shape {
    var height: Double
    var length: Double
    var perimeter: Double
    init(height: Double, length: Double) {
        self.height = height
        self.length = length
        perimeter = (height + length) * 2
    }
}

class Tshirt {
    var color: String
    init(color: String) {
        self.color = color
    }

    func getDescription() -> String {
        return "This Tshirt is " + color
    }
}

class Clothing {
    var size: String
    var color: String
    init(size: String, color: String) {
        self.size = size
        self.color = color
    }
}

class Jeans: Clothing {
    var brand: String
    init(brand: String, size: String, color: String) {
        self.brand = brand
        super.init(size: size, color: color)
    }
}