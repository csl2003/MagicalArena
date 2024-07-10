package arena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testPlayerHealth() {
        Player player = new Player(50, 5, 10);
        player.setHealth(40);
        assertEquals(40, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.setHealth(0);
        assertFalse(player.isAlive());
    }
}
