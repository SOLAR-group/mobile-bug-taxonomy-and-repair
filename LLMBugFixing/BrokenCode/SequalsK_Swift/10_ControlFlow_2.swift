func describe(obj: Any) -> String {
    switch obj {
        case 1:
            "One"
        case "Hello":
            "Greeting"
        case Long:
            "Long"
        case String:
            "Not a string"
        default:
            "Unknown"
    }
}