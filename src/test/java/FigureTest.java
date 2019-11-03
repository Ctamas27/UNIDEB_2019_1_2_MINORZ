import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class FigureTest {

    @Test
    public void getLocationx() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        assertEquals(2, Figure.getLocationx());

        ByteArrayInputStream in2 = new ByteArrayInputStream("5".getBytes());
        System.setIn(in2);
        assertEquals(4, Figure.getLocationx());
    }

    @Test
    public void getLocationy() {
        ByteArrayInputStream in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        assertEquals(2, Figure.getLocationy());

        ByteArrayInputStream in2 = new ByteArrayInputStream("1".getBytes());
        System.setIn(in2);
        assertEquals(0, Figure.getLocationy());
    }

    @Test
    public void getDirection() {
        ByteArrayInputStream in = new ByteArrayInputStream("down".getBytes());
        System.setIn(in);
        assertEquals("down", Figure.getDirection());
    }

    @Test
    public void getPlayerName() {
        ByteArrayInputStream in = new ByteArrayInputStream("Tomi".getBytes());
        System.setIn(in);
        assertEquals("Tomi", Figure.getPlayerName("B"));
    }
}