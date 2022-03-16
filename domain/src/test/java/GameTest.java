import com.julien.colin.shifumi.xdd.domain.Game;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Game")
class GameTest {
    private static final short EXPECTED_DEFAULT_NUMBER_OF_ROUNDS = 5;

    @Nested
    @DisplayName("Game construction")
    class GameConstructor {
        @DisplayName("""
            Given no number of rounds,
            when constructing a game,
            then return a game with default number of rounds.
        """)
        @Test
        void defaultNumberOfRounds() {
            final Game aNewGameWithNoGivenNumberOfRounds = new Game();
            assertEquals(
                    EXPECTED_DEFAULT_NUMBER_OF_ROUNDS,
                    aNewGameWithNoGivenNumberOfRounds.getNumberOfRounds()
            );
        }
    }

}
