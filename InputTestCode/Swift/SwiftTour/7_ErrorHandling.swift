// Error Enum
enum PrinterError: Error {
    case outOfPaper
    case noToner
    case onFire
}

// Error throwing
func send(job: Int, toPrinter printerName: String) throws -> String {
    if printerName == "Never Has Toner" {
        throw PrinterError.noToner
    }
    return "Job sent"
}

// Error catching
func errorCatching() -> String {
    do {
        let printerResponse = try send(job: 1040, toPrinter: "Bi Sheng")
        return printerResponse
    } catch {
        return "Error"
    }
}

//Optional handling
let printerSuccess = try? send(job: 1884, toPrinter: "Mergenthaler")
let printerFailure = try? send(job: 1885, toPrinter: "Never Has Toner")

// Defer
var fridgeIsOpen = false
let fridgeContent = ["milk", "eggs", "leftovers"]

func fridgeContains(_ food: String) -> Bool {
    fridgeIsOpen = true
    defer {
        fridgeIsOpen = false // is always executed
    }

    let result = fridgeContent.contains(food)
    return result
}

func useDefer() {
    fridgeContains("banana")
}