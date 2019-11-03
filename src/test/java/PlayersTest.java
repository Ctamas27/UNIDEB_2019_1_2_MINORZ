import org.junit.Test;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;


public class PlayersTest {

    @Test
    public void player1() {
        ByteArrayInputStream in = new ByteArrayInputStream("Tomi".getBytes());
        System.setIn(in);
        assertEquals("Tomi",Players.player1("1"));

    }

    @Test
    public void player2() {
        ByteArrayInputStream in = new ByteArrayInputStream("QWE".getBytes());
        System.setIn(in);
        assertEquals("QWE",Players.player1("1"));
    }
}
