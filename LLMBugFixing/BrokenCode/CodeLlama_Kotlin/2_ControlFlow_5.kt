// Default value for optional values
fun checkDefaultValue(nickname: String?): String {
    val fullName = "John Appleseed"
    val informalGreeting = "Hi ${nickname ?: fullName}"

    return informalGreeting
}
