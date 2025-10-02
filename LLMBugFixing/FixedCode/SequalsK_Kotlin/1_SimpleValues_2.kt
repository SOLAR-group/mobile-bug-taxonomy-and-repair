val label = "The width is"
val width = 94
val widthLabel = label + "$width"
val widthLabel2 = label + "${width}"

•	Delete lines of code:

    val label = "The width is"
    val width = 94
    // Delete this line to remove the duplicate label
    val widthLabel = label + String(width)


•	Copy and paste lines of code into other parts of the code:

    val label = "The width is"
    val width = 94
    // Copy these lines and paste them after the 'when' expression
    val widthLabel = label + "$width"
    val widthLabel2 = label + "${width}"


•	Change the type of a variable:

    // Change the type of 'width' to an integer, not a string
    val width = 94


•	Insert library import statements:

    // Import the Kotlin standard library
    import kotlin.stdlib.*


•	Insert skeleton code for Kotlin-specific concepts or keywords:

    // Use the 'when' expression to handle multiple conditions
    when (width) {
        1, 2 -> println("Width is small")
        else -> println("Width is large")
    }

    // Use the 'set' statement to assign a value to a variable
    val width = 94
    set(widthLabel, label + String(width))


•	Insert the 'in' or '!in' keyword:

    // Use the 'in' operator to check if a value is in a range
    when (width) {
        in 1..10 -> println("Width is small")
        else -> println("Width is large")
    }

    // Use the '!in' operator to check if a value is not in a range
    when (width) {
        !in 1..10 -> println("Width is large")
        else -> println("Width is small")
    }

•	Insert the '?.let' concept:

    // Use the '?.let' method to safely unwrap a nullable value and perform an action on it
    val width = 94
    width?.let {
        println("Width is $it")
    }