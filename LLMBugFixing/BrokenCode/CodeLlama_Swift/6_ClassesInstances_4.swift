open class Clothing {
        init(size: String, color: String) {
                self.size = size
                self.color = color
        }
        var size: String? = nil
        var color: String? = nil
}

class Jeans: Clothing {
        init(brand: String, size: String, color: String) {
                super.init(size: size, color: color)
                self.brand = brand
        }
        var brand: String? = nil
}