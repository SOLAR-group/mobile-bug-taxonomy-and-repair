func describe(_ obj: Any) -> String {
    switch obj {
        case 1:
            return "One"
        case "Hello":
            return "Greeting"
        case is Long:
            return "Long"
        default:
            return "Not a string"
    }
}