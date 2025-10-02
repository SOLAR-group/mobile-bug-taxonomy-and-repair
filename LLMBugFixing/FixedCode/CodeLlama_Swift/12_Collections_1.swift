
Here is a corrected version of the code snippet: 

func inCollection(_ items: [String]) -> String {
    var str = "Nothing to say."

    if "orange" in items {
        str = "juicy"
    } else if "apple" in items {
        str = "apple is fine too"
    } else {
        str = "no fruits to say"
    }

    return str
}
This code corrects the bugs in the previous version by using an 'else' statement and adding a default string in case no fruit matches. 