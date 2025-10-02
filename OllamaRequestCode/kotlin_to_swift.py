import ollama

from ollama import chat
from ollama import ChatResponse

def request_body(prompt):
    response: ChatResponse = chat(model='codellama:7b-instruct', messages=[
    {
        'role': 'user',
        'content': prompt,
    },
    ])
    print(response['message']['content'])

packageimport = """
Kotlin\nSource Code:\n
package test.me

import kotlin.annotation.*
Translate the above Kotlin code to Swift.
"""

entry = """
Kotlin\nSource Code:\n
// Main

fun main() {
    print ("Hello World.")
}
Translate the above Kotlin code to Swift.
"""

printing = """
Kotlin\nSource Code:\n
// Printing

fun printing() {
    print("Hello World")
}

fun linePrinting() {
    println("Hello World")
}
Translate the above Kotlin code to Swift.
"""

functions = """Kotlin\nSource Code:\n

fun typedFunction(a: Int, b: Int): Int {
    return a + b
}

fun callFunc(): Int {
    return typedFunction(1, 2)
}

fun functionBodyAsExpression(a: Int, b: Int) = a + b

fun voidReturnValueWithUnit(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun voidReturnValue(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
Translate the above Kotlin code to Swift. """

variables = """Kotlin\nSource Code:\n

// Variables

val a: Int = 1
val b = 2

fun deferredAssignment(): Int {
    val c: Int
    c = 3

    return c
}

var x = 5

fun inferredTypeAddition(): Int {
    var y = 5
    y += 1

    return y
}

var z = 0
fun incrementTopLevel() { 
    z += 1 
}
Translate the above Kotlin code to Swift. """

classes = """
Kotlin\nSource Code:\n
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

Translate the above Kotlin code to Swift. 
"""

comments = """
Kotlin\nSource Code:\n
// Comments

// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

/* The comment starts here
/* contains a nested comment */
and ends here. */

Translate the above Kotlin code to Swift. 
"""

stringtemplates = """
Kotlin\nSource Code:\n

// String templates

var s = 1
val s1 = "s is $s"

fun arbitraryExpInTemplate(): String {
    s = 2
    val s2 = "${s1.replace("is", "was")}, but now is ${s}"

    return s2
}

Translate the above Kotlin code to Swift. 
"""

conditionals = """
Kotlin\nSource Code:\n

// String templates
// Conditional expressions

fun conditional(a: Int, b: Int): Int {
	if (a > b) {
		return a
	} else {
		return b
	}
}

fun conditionalAsExpression(a: Int, b: Int) = if (a > b) a else b

Translate the above Kotlin code to Swift. 
"""

controlflow = """
Kotlin\nSource Code:\n
// Control flow

fun forIn(items: Array<String>): String {
    var testString = "";

    for (item in items) {
        testString += item
    }

    return testString
}

fun forInIndex(items: Array<String>): Int {
    var testValue = 0

    for (index in items.indices) {
        testValue += index
    }

    return testValue
}

fun forInIndexPlaceholder(items: Array<String>): Int {
    var testValue = 0

    for (index in items.indices) {
        testValue += index
    }

    return testValue
}

fun whileLoop(): Int {
    var count = 0

    while (count < 15) {
        count += 1
    }

    return count
}

fun describe(obj: Any): String =
	when (obj) {
		1 -> "One"
		"Hello" -> "Greeting"
		is Long -> "Long"
		!is String -> "Not a string"
		else -> "Unknown"
	}

fun translateNumber(num: Int): String {
    when (num) {
        1 -> return "One"
        2 -> return "Two"
        3 -> return "Three"
        4 -> return "Four"
        5 -> return "Five"
        else -> return "Number not known."
    }
}
Translate the above Kotlin code to Swift. 
"""

ranges = """
Kotlin\nSource Code:\n
// Ranges

fun withinRange(x: Int, y: Int): Boolean {
    return x in 1..y + 1
}

fun outOfRange(list: List<String>): Boolean {
    return list.size !in list.indices
}

fun iterateOverRange(): Int {
    var testValue = 0

    for (x in 1..5) {
        testValue += x
    }

    return testValue
}

fun iterateOverProgression(): Int {
    var testValue = 0

    for (x in 10 downTo 1 step 3) {
        testValue += x
    }

    return testValue
}
Translate the above Kotlin code to Swift. 
"""

collections = """
Kotlin\nSource Code:\n
// Collections

fun inCollection(items: Array<String>): String {
    var str = "Nothing to say."

    when {
        "orange" in items -> str = "juicy"
        "apple" in items -> str = "apple is fine too"
    }

    return str
}

fun collectionSimpleLambda(list: Array<String>): List<String> {
    return list.filter { it == "win" }
}

fun collectionLambdaExpression(list: Array<String>): MutableList<String> {
    val filteredList = mutableListOf<String>()

    list
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach { filteredList.add(it) }

    return filteredList
}
Translate the above Kotlin code to Swift. 
"""

nullable = """
Kotlin\nSource Code:\n
// Nullable values and null checks

fun parseInt(str: String): Int? {
	return str.toIntOrNull()
}

fun getProduct(arg1: String, arg2: String): Int? {
	val x = parseInt(arg1)
	val y = parseInt(arg2)

	if (x != null && y != null) {
		return (x * y)
	}
	else {
		println("'$arg1' or '$arg2' is not a number")
        return null
	}    
}

fun castNumber(arg1: String?, arg2: String?): Int? {
    val x = parseInt(arg1) 
  	val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return null
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return null
    }

    return (x * y)
}

fun getProductFromOptional(x: Int?, y: Int?): Int? {
	if (x != null && y != null) {
		return (x * y)
	}
	else {
		println("'$x' or '$y' is not a number.")
        return null
	}    
}
Translate the above Kotlin code to Swift. 
"""

typechecks = """
Kotlin\nSource Code:\n
// Type checks and automatic casts

fun getStringLength1(obj: Any): Int? {

	if (obj is String) {
		return obj.length
	}

	return null
}

fun getStringLength2(obj: Any): Int? {
	if (obj !is String) return null

	return obj.length
}

fun getStringLength3(obj: Any): Int? {
	if (obj is String && obj.length > 0) {
			return obj.length
	}

	return null
}

fun automaticCastOneVariable(arg1: Int?): Int? {
    if (arg1 != null) {
        return arg1 * 2
    } else {
        return null
    }
}
Translate the above Kotlin code to Swift. 
"""

misc = """
Kotlin\nSource Code:\n
// Miscellaneous

fun arrayWithListOf(): List<String> {
    val items = listOf("a", "b", "c")

    return items
}

fun incrementingDecrementing(): Int {
    var number = 1

    number++
    number--
    number++

    return number
}
Translate the above Kotlin code to Swift. 
"""

def run_prompts():
    # request_body(packageimport)
    # request_body(entry)
    # request_body(printing)
    # request_body(functions)
    # request_body(variables)
    # request_body(classes)
    # request_body(comments)
    # request_body(stringtemplates)
    # request_body(conditionals)
    # request_body(controlflow)
    # request_body(ranges)
    # request_body(collections)
    # request_body(nullable)
    # request_body(typechecks)
    request_body(misc)


run_prompts()