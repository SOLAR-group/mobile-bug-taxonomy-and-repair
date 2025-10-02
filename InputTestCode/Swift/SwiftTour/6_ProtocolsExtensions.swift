// Protocols
protocol ExampleProtocol {
    var simpleDescription: String { get }
    mutating func adjust()
}

class SimpleClass: ExampleProtocol {
    var simpleDescription: String = "A very simple class."
    var anotherProperty: Int = 69105
    func adjust() {
        simpleDescription += "  Now 100% adjusted."
    }
}

func generateSimpleClass() -> String {
    let a = SimpleClass()
    a.adjust()

    let protocolValue: ExampleProtocol = a

    return a.simpleDescription
}

struct SimpleStructure: ExampleProtocol {
    var simpleDescription: String = "A simple structure"
    mutating func adjust() {
        simpleDescription += " (adjusted)"
    }
}

func generateSimpleStruct() -> String {
    var b = SimpleStructure()
    b.adjust()

    return b.simpleDescription
}

// Extensions
extension Int: ExampleProtocol {
    var simpleDescription: String {
        return "The number \(self)"
    }
    mutating func adjust() {
        self += 42
    }
}

let seven = 7
let sevenDescription = seven.simpleDescription
var eight = 8

func makeUseOfExtension() {
    eight.adjust()
}
