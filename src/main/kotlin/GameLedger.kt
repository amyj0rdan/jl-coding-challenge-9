class GameLedger {

    var transactions = mutableListOf<Triple<String, Int, TransactionType>>()

    fun startingBalance(playerName: String, fee: Int) {
        transactions.add(Triple(playerName, fee, TransactionType.StartingBalance))
    }

    fun bankPaysFeeToPlayer(playerName: String, fee: Int) {
        transactions.add(Triple(playerName, fee, TransactionType.BankFeeToPlayer))
    }

    fun playerPaysRentToPlayer(payingPlayer: String, receivingPlayer: String, rent: Int) {
        transactions.add(Triple(payingPlayer, -rent, TransactionType.PlayerPaysRent))
        transactions.add(Triple(receivingPlayer, rent, TransactionType.PlayerReceivesRent))
    }

    fun playerPaysBankForLocation(playerName: String, fee: Int) {
        transactions.add(Triple(playerName, -fee, TransactionType.PlayerPaysBankForLocation))

    }

    fun playerPaysBankForBuilding(playerName: String, fee: Int) {
        transactions.add(Triple(playerName, -fee, TransactionType.PlayerPaysBankForBuilding))

    }
}

enum class TransactionType {
    StartingBalance,
    BankFeeToPlayer,
    PlayerPaysRent,
    PlayerReceivesRent,
    PlayerPaysBankForLocation,
    PlayerPaysBankForBuilding
}