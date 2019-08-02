import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class GameLedgerTest {

    @Test
    fun `player starting and receives opening balance from bank`() {
        val gameLedger = GameLedger()
        gameLedger.startingBalance("Bill", 100)

        assertThat(gameLedger.transactions).isEqualTo(listOf(Pair("Bill", 100)))

    }
}