// Generic function
func makeArray<Item>(repeating item: Item, numberOfTimes: Int) -> [Item] {
    var result: [Item] = []
    for i in 0..<numberOfTimes {
        result.append(item)
    }
    return result
}

// Generic enum
enum OptionalValue<Wrapped> {
    case none
    case some(Wrapped)
}

// Requirements for Generic
func anyCommonElements<T: Sequence, U: Sequence>(_ lhs: T, _ rhs: U) -> Bool
    where T.Element: Equatable, T.Element == U.Element
{
    for lhsItem in lhs {
        for rhsItem in rhs {
            if lhsItem == rhsItem {
                return true
            }
        }
    }
    return false
}