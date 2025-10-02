func iterateOverRange() -> Int {
    var testValue = 0

    for x in 1 ..< y {
        testValue += x
    }

    return testValue
}
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Delete lines of code. 

func iterateOverRange() -> Int {
     var testValue = 0
     for x in 1 ..< y {
         testValue += x
     }
    return testValue
}
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Copy lines of code and insert them in other parts of the code. 

func iterateOverRange() -> Int {
     var testValue = 0
     for x in 1 ..< y {
         testValue += x
     }
    return testValue
}
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Change the type of a variable. 

func iterateOverRange() -> Int {
     var testValue = "0"
     for x in 1 ..< y {
         testValue += x
     }
    return testValue
}
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Insert library import statements.

import Swift

func iterateOverRange() -> Int {
     var testValue = "0"
     for x in 1 ..< y {
         testValue += x
     }
    return testValue
}
Here are some examples of mutation operators that could be used to fix the bug(s) in the code: 

•	Insert skeleton code for Swift-specific concepts or keywords, such as the ‘switch’ statement, the ‘willSet’ statement, the ‘!’ keyword for forced unwrapping, the ‘guard-let’ concept and the shortform ‘enum’ concept.

import Swift

func iterateOverRange() -> Int {
     var testValue = "0"
     switch(testValue) {
       case "1":
          print("One")
       case "2":
          print("Two")
       case "3":
          print("Three")
       default:
          print("Other number")
     }
    return testValue
}