Here is the fixed code snippet:
val sortedNumbers = numbers.sortedDescending()

This code uses the sortedDescending() method to sort the list of numbers in descending order. This fixes the bug in the original code, which was using the sorted() method with a lambda expression that compared each element to its predecessor, resulting in an infinite loop.