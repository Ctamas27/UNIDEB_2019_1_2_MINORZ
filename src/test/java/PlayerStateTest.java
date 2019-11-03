import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerStateTest {

    @Test
    public void state() {
        assertEquals("B", PlayerState.State());
        assertEquals("R", PlayerState.State());
    }

    @Test
    public void getPlayer() {
        PlayerState.State();
        assertEquals("B",PlayerState.getPlayer());
        PlayerState.State();
        assertEquals("R",PlayerState.getPlayer());
    }
}