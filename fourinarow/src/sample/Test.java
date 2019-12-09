package sample;

import javafx.scene.shape.Circle;
import org.junit.Before;
import  static org.junit.Assert.assertEquals;
import static javafx.scene.paint.Color.BLUE;

import java.awt.*;

public class Test {

    private Label testLabel = new Label();

    private Circle testCircle = new Circle();

    @Before
    public void init(){
        testLabel.setText("valami");
        testLabel.setBackground(Color.red);
        testCircle.setId("valami");
    }

    @org.junit.Test
    public void testLabelText(){
        assertEquals("Test for a label text", "valami", testLabel.getText());
    }

    @org.junit.Test
    public void testLabelBackgroundColor(){
        assertEquals("Test for a label background color", Color.red, testLabel.getBackground());
    }

    @org.junit.Test
    public void testCircleId(){
        assertEquals("Test for a color id", "valami", testCircle.getId());
    }


}
