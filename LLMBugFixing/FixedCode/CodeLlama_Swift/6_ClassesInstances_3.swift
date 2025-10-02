class Tshirt {
        var color: String? = nil
        func getDescription() -> String {
                return "This Tshirt is \(color ?? "")"
        }
}
