class GameLedger {

    var transactions = mutableListOf<Pair<String,Int>>()

    fun startingBalance(playerName:String,fee:Int){
        transactions.add(Pair(playerName,fee))
    }
}