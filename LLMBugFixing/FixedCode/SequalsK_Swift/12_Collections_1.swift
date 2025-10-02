Here is an example of a corrected version of the code:

func inCollection(items: Array<String>) -> String {
    var str = "Nothing to say."
    if items.contains("orange") {
        str = "juicy"
    } else if items.contains("apple") {
        str = "apple is fine too"
    }
    return str
}

The corrected version fixes the bug by using the contains() function to check if a particular item is in the array, rather than checking for equality with the items directly.