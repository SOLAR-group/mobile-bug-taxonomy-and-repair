enum class PrinterError(val rawValue: Error) {
    outOfPaper(0),
    noToner(1),
    onFire(2);
}