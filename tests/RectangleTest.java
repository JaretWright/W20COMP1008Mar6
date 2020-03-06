import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(10,20);
    }

    @Test
    public void getLength() {
        assertEquals(10, rectangle.getLength(),0.0);
    }

    @Test
    public void setLength() {
        rectangle.setLength(20);
        assertEquals(20,rectangle.getLength(),0.0);
    }

    @Test
    public void setLengthInvalid() {
        try {
            rectangle.setLength(-2);
            fail("length cannot be negative");
        } catch(IllegalArgumentException e)
        {
            System.out.println("caught Illegal length with message "+e.getMessage());
        }
    }

    @Test
    public void getWidth() {
    }

    @Test
    public void setWidth() {
    }
}