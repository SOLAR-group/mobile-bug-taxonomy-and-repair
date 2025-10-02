
Here is the corrected version of the code: 
val individualScores = listOf(75, 43, 103, 87, 12)

The bug in this code was that the 'listOf' method was not properly used to create a List object.
To fix this bug, we can use the 'toList()' method on the 'individualScores' array, like so:
val individualScores = individualScores.toList()