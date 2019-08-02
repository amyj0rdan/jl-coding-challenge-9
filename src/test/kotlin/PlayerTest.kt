import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class PlayerTest {
    @Test
    fun `player has a name`() {
        val player = Player("Sarah")

        assertThat(player.name).isEqualTo("Sarah")
    }
}