class KotlinBasics {
    /* COMMENTS */

    // This is an end-of-line comment

    /* This is a block comment
    on multiple lines. */

    /* The comment starts here
    /* contains a nested comment */
    and ends here. */

    /* PRINTING */

    func printing() {
        print("Hello World", terminator:"");
    }

    func linePrinting() {
        print("Hello World");
    }

    /* FUNCTIONS */

    func typedFunction(a: Int, b: Int) -> Int {
        return a + b;
    }

    func callFunc() -> Int {
        return typedFunction(a: 1, b: 2)
    }

    func functionBodyAsExpression(a: Int, b: Int) -> Int {
        a + b
    }

    func voidReturnValueWithUnit(a: Int, b: Int) {
        print("sum of \(a) and \(b) is \(a + b)")
    }

    func voidReturnValue(a: Int, b: Int) {}

    /* VARIABLES */

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

    /* STRING TEMPLATES */

    var s = 1
    let s1 = "s is \(s)"

    func arbitraryExpInTemplate() -> String {
        print(s1)

        s = 2
        let s2 = "\(s1.replacingOccurrences(of: "is", with: "was")), but now is \(s)"

        return s2
    }


    /* CONDITIONAL EXPRESSIONS */

    func conditional(a: Int, b: Int) -> Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    func conditionalAsExpression(a: Int, b: Int) -> Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    /* CONTROL FLOW */

    func forIn(items: [String]) -> String {
        var testString = "";

        for item in items {
            testString += item
        }

        return testString
    }

    func forInIndex(items: [String]) -> Int {
        var testValue = 0

        for (index, item) in items.enumerated() {
            testValue += index
        }

        return testValue
    }

    func whileLoop() -> Int {
        var count = 0

        while (count < 15) {
            count += 1
        }

        return count
    }

    func describe(obj: Any) -> String {
        if(obj is Int && ((obj as? Int) == 1)) {
            return "One"
        } else if(obj is String && (obj as? String) == "Hello") {
            return "Greeting"
        } else if(obj is Int64) {
            return "Long"
        } else if(!(obj is String)) {
            return "Not a string"
        } else {
            return "Unkown"
        }
    }

    func translateNumber(num: Int) -> String {
        switch (num) {
            case 1:
                return "One"
            case 2:
                return "Two"
            case 3:
                return "Three"
            case 4:
                return "Four"
            case 5:
                return "Five"
            default:
                return "Number not known."
        }
    }

    /* Ranges */

        func withinRange(x: Int, y: Int) -> Bool {
            return (1...y + 1).contains(x)
        }
        
        func outOfRange(list: [String]) -> Bool {
            return !(0...list.count - 1).contains(list.count)
        }

        func iterateOverRange() -> Int {
            var testValue = 0

            for x in 1...5 {
                testValue += x
            }

            return testValue
        }

        func iterateOverProgression() -> Int {
            var testValue = 0

            for x in stride(from: 10, through: 1, by: -3) {
                testValue += x
            }

            return testValue
        }

    /* Collections */

    func inCollection(items: [String]) -> String {
        var str = "Nothing to say."

        if(items.contains("orange")) {
            str = "juicy"
        } else if(items.contains("apple")) {
            str = "apple is fine too"
        }

        return str
    }

    func collectionSimpleLambda(list: [String]) -> [String] {
        return list.filter { $0 == "win" }
    }

    func collectionLambdaExpression(list: [String]) -> [String] {
        var filteredList = [String]()

        list
            .filter({ $0.starts(with: "a") })
            .sorted()
            .map({ $0.uppercased() })
            .forEach({ filteredList.append($0) })

            return filteredList
    }

    /* Nullable values and null checks */

    func parseInt(str: String) -> Int? {
        return Int(str)
    }

    func getProduct(arg1: String, arg2: String) -> Int? {
        let x = Int(arg1)
        let y = Int(arg2)

        if (x != nil && y != nil) {
            return (x! * y!)
        }
        else {
            print("\(arg1) or \(arg2) is not a number")
            return nil
        }
    }

    func castNumber(arg1: String, arg2: String) -> Int? {
        let x = Int(arg1)
        let y = Int(arg2)

        if (x == nil) {
            print("Wrong number format in arg1: \(arg1)")
            return nil
        }
        if (y == nil) {
            print("Wrong number format in arg2: \(arg2)")
            return nil
        }
        
        return (x! * y!)
    }

    func getProductFromOptional(x: Int?, y: Int?) -> Int? {
        if (x != nil && y != nil) {
            return (x! * y!)
        } else {
            print("'\(x)' or '\(y)' is not a number.")
            return nil
        }
    }

    /* Type checks and automatic casts */

    func getStringLength1(obj: Any) -> Int? {
        if let str = obj as? String {
            return str.count
        }
        
        return nil
    }

    func getStringLength2(obj: Any) -> Int? {
        if (!(obj is String)) {
            return nil
        }

        return (obj as! String).count
    }

    func getStringLength3(obj: Any) -> Int? {
        if let str = obj as? String {
            if str.count > 0 {
                return str.count
            }
        }

        return nil
    }

    /* Miscellaneous */

    func arrayWithListOf() -> [String] {
        let items = ["a", "b", "c"]

        return items
    }

    func incrementingDecrementing() -> Int {
        var number = 1

        number += 1
        number -= 1
        number += 1

        return number
    }
}

/* CLASSES AND INSTANCES */

class Rectangle {
    var height: Double
    var length: Double
    
    var perimeter: Double
    
    init(height: Double, length: Double) {
        self.height = height
        self.length = length
        
        self.perimeter = (height + length) * 2
    }
}

class Shape {}


class RectangularShape: Shape {
    var height: Double
    var length: Double
    
    var perimeter: Double
    
    init(height: Double, length: Double) {
        self.height = height
        self.length = length
        
        self.perimeter = (height + length) * 2
    }
}

class Tshirt {
    var color: String
    
    init(color: String) {
        self.color = color
    }
    
    func getDescription() -> String {
        return "This Tshirt is " + color;
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