package arena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {
    @Test
    public void testFight() {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);

        Arena arena = new Arena(playerA, playerB);
        arena.fight();

        assertTrue(playerA.isAlive() || playerB.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }
}
