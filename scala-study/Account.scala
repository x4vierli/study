class Account private (val id: Int, initialBalance: Double) {
    private var balance = initialBalance
}

object Account {
    def apply(initialBalance: Double) {
        new Account(newUniqueNumber(), initialBalance)
    }
}