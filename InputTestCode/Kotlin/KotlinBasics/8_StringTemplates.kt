// String templates

var s = 1
val s1 = "s is $s"

fun arbitraryExpInTemplate(): String {
    s = 2
    val s2 = "${s1.replace("is", "was")}, but now is ${s}"

    return s2
}