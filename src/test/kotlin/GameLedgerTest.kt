import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class GameLedgerTest {

    @Test
    fun `player starting and receives opening balance from bank`() {
        val gameLedger = GameLedger()
        gameLedger.startingBalance("Bill", 100)

        assertThat(gameLedger.transactions).isEqualTo(listOf(Triple("Bill", 100, TransactionType.StartingBalance)))

    }
    @Test
    fun `bank pays fee to player`(){
        val gameLedger = GameLedger()
        gameLedger.bankPaysFeeToPlayer("Susan",50)

        assertThat(gameLedger.transactions).isEqualTo(listOf(Triple("Susan",50, TransactionType.BankFeeToPlayer)))
    }

    @Test
    fun `player pays rent to another player`() {
        val gameLedger = GameLedger()
        gameLedger.playerPaysRentToPlayer(payingPlayer = "Susan", receivingPlayer = "Bill", rent = 100)

        assertThat(gameLedger.transactions).isEqualTo(listOf(Triple("Susan", -100, TransactionType.PlayerPaysRent), Triple("Bill", 100, TransactionType.PlayerReceivesRent)))
    }
}