Delete lines of code: 
func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    return a + b
}
Copy lines of code and insert them in other parts of the code:
func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    var sum = 0
    sum += a + b
    return sum
}
Change the type of a variable: 
func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    var sum = 0 as! Int
    sum += a + b
    return sum
}
Insert library import statements:
import Foundation
func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    var sum = 0 as! Int
    sum += a + b
    return sum
}
Insert skeleton code for Swift-specific concepts or keywords, such as the ‘switch’ statement, the ‘willSet’ statement, the ‘!’ keyword for forced unwrapping, the ‘guard-let’ concept and the shortform ‘enum’ concept:
func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    var sum = 0 as! Int
    sum += a + b
    return sum
}
switch a+b {
case 1...5:
print("a + b is between 1 and 5")
default:
print("a + b is not between 1 and 5")
}
willSet(newValue) {
   print("new value will be set to \(newValue)")
 }
func functionBodyAsExpression(_ a: Int, _ b: Int) -> Int {
    var sum = 0 as! Int
    sum += a + b
    return sum
}
guard let optionalInt = someOptionalInt else { return }
print("optionalInt is not nil and has value \(optionalInt)")
enum someEnum {
   case option1, option2
}
var someVar: someEnum = .option1
