class GameLedger {

    var transactions = mutableListOf<Triple<String, Int, TransactionType>>()

    fun startingBalance(playerName: String, fee: Int) {
        transactions.add(Triple(playerName, fee, TransactionType.STARTINGBALANCE))
    }

    fun bankPaysFeeToPlayer(playerName: String, fee: Int) {
        transactions.add(Triple(playerName, fee, TransactionType.BANKFEETOPLAYER))
    }
}

enum class TransactionType {
    STARTINGBALANCE,
    BANKFEETOPLAYER
}