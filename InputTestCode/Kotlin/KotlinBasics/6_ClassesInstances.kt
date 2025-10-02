package original

// Classes and Instances

class Rectangle(var height: Double, var length: Double) {
	var perimeter = (height + length) * 2
}

open class Shape

class RectangularShape(var height: Double, var length: Double): Shape() {
var perimeter = (height + length) * 2
}

class Tshirt(var color: String) {
	fun getDescription(): String {
		return "This Tshirt is " + color;
	}
}

open class Clothing(var size: String, var color: String)

class Jeans(var brand: String, size: String, color: String): Clothing(size, color)
