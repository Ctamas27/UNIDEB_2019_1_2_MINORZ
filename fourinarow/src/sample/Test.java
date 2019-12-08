package sample;

import org.junit.Before;
import  static org.junit.Assert.assertEquals;

import java.awt.*;

public class Test {

    private Label testLabel = new Label();

    @Before
    public void init(){
        testLabel.setText("valami");
        testLabel.setBackground(Color.red);
    }

    @org.junit.Test
    public void testLabelText(){
        assertEquals("Test for a label text", "valami", testLabel.getText());
    }

    @org.junit.Test
    public void testLabelBackgroundColor(){
        assertEquals("Test for a label background color", Color.red, testLabel.getBackground());
    }

}
